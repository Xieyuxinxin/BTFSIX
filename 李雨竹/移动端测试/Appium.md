## Appium

##### 学习资料：

- **官网**：http://appium.io/docs/cn/about-appium/intro/

- **github**：https://github.com/appium/appium/tree/master/docs/cn

    ​				https://github.com/appium/appium/tree/master/sample-code

- **PPT**：移动端测试--13/14/15章

    



##### Appium介绍：

Appium是一个**开源工具**，用于自动化ios手机、Android手机和windows桌面平台上的原生、移动Web和混合应用。

Appium是一个**开源的移动端自动化测试工具**，可测试原生的，混合的，基于手机web浏览器的移动端应用；

- 原生应用：指用ios\Android或者windows sdks编写的应用
- 移动Web应用：用移动端浏览器访问的应用
- 混合应用：带有一个【webview】的包装器，用来和web内容交互的原生控件。

Appium是**跨平台**的：允许你用同样的 API 对多平台（iOS、Android、Windows）写测试。做到在 iOS、Android 和 Windows 测试套件之间复用代码。



##### Appium理念：

Appium旨在满足移动端自动化需求的理念，概述为以下**四个原则**：

1. 你不应该为了自动化而重新编译你的应用或以任何方式修改它
2. 你不应该被限制在特定的语言或框架上来编写运行测试
3. 移动端自动化框架不应该在自动化接口方面重复造轮子
4. 移动端自动化框架应该开源，在精神、实践以及名义上都该如此



##### Appium设计：

如何实现上述理念呢？

- 为了实现**理念1**，使用了系统自带的自动化框架。这样，我们不需要把Appium特定的或者第三方的代码编译进你的应用，意味着你**测试使用的应用与最终发布的应用并无二致**。
    - Android 4.3+: 谷歌的 [UiAutomator / UiAutomator2](https://developer.android.com/training/testing/ui-automator)
    - Android 2.3+: 谷歌的 [Instrumentation](http://developer.android.com/reference/android/app/Instrumentation.html). (通过绑定独立的项目—— [Selendroid](http://selendroid.io/) 提供对 Instrumentation 的支持)
    - Windows: 微软的 [WinAppDriver] (http://github.com/microsoft/winappdriver)
- 为了实现理念2，把这些系统本身提供的框架包装进一套API——**WebDriver API**中。WebDriver（也叫「Selenium WebDriver」）规定了一个客户端-服务器协议（称为 [JSON Wire Protocol](https://w3c.github.io/webdriver/webdriver-spec.html)），按照这种客户端-服务器架构，可以使用任何语言编写的客户端向服务器发送适当的 HTTP 请求。
- 为了实现**理念3**，WebDriver 已经成为 Web 浏览器自动化事实上的标准，并且是一个 [W3C 工作草案](https://dvcs.w3.org/hg/webdriver/raw-file/tip/webdriver-spec.html)。



##### Appium概念：

###### 客户端/服务器架构：

Appium的核心是一个暴露REST API 的 **WEB 服务器**。它接受来自客户端的连接，监听命令并在移动设备上执行，答复HTTP 响应来描述执行结果。

###### 会话Session:

自动化始终在一个会话的上下文中执行，这些客户端程序库以各自的方式发起与服务器的会话，但最终都会发给服务器一个 `POST /session` 请求，请求中包含一个被称作「预期能力（Desired Capabilities）」的 JSON 对象。这时服务器就会开启这个自动化会话，并返回一个用于发送后续命令的会话 ID。

###### 预期能力：

预期能力（Desired Capabilities）是一些发送给 Appium 服务器的键值对集合（比如 map 或 hash），它告诉服务器我们想要启动什么类型的自动化会话。也有许多能力（Capabilities）可以修改服务器在自动化过程中行为。such as : platformName 设置为ios

###### Appium服务器：

Appium 是一个用 Node.js 写的服务器。可以从[源码](https://github.com/appium/appium/blob/master/docs/cn/contributing-to-appium/appium-from-source.md)构建安装或者从 [NPM](https://www.npmjs.com/package/appium) 直接安装：

$  npm install -g appium  

$  appium

###### Appium客户端：

有一些客户端程序库（分别在 Java、Ruby、Python、PHP、JavaScript 和 C# 中实现），它们支持 Appium 对 WebDriver 协议的扩展。你需要用这些客户端程序库代替常规的 WebDriver 客户端。

###### Appium Desktop：

(https://github.com/appium/appium-desktop)**
这有一个 Appium 服务器的图形界面封装可以下载，它适用于任何平台。它打包了 Appium 服务器运行需要的所有东西，所以你不需要为 Node 而烦恼。它们还提供一个 Inspector 使你可以查看应用程序的层级结构。这在写测试时可以派上用场。



##### 支持 Appium 服务器的客户端程序库列表：

这些库封装了标准的 Selenium 客户端，提供了所有 [JSON Wire protocol](https://w3c.github.io/webdriver/webdriver-spec.html) 指定的常规 selenium 命令，并额外添加操控移动设备相关的命令，例如 **多点触控手势** 和 **屏幕方向**

- java:https://github.com/appium/java-client



##### 运行测试：

- https://github.com/appium/java-client

- 测试是否连接设备  adb devices

- 使用Appium测试你的应用：编写 WebDriver 测试脚本 DesiredCapabilities 

- 使用 Appium 运行你的测试程序：

    Android 设备在 4.3 版本（API 级别 17）之前没有安装谷歌的 [UiAutomator 框架](http://developer.android.com/tools/testing-support-library/index.html#UIAutomator)。UiAutomator 是 Appium 用于在设备上执行自动化的部分。对于早期的设备或混合（基于 webview）应用程序，Appium 与另一个名为 [Selendroid](http://selendroid.io/) 自动化后端进行绑定。

    要使用 Selendroid，只需稍微改动上述提到的预期功能（Desired capabilities），添加 `automationName` 并指定 Selendroid 为自动化后端。通常，你还需要在 activity 名前加一个 `.`（例如，对于 `appActivity` 这个功能需要使用 `.MainActivity` 替代 `MainActivity`)。

- 代码见链接



##### 预期功能：

http://appium.io/docs/cn/writing-running-appium/caps/

###### Appium 服务器初始化参数（Capability）：

###### Android独有：



##### 移动手势：

http://appium.io/docs/cn/writing-running-appium/touch-actions/

TouchAction\MultiTouch