<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./css/theTeam.css" type="text/css">
</head>
<body>
<!-- 上方导航栏 -->
	<div class="topNav">
		<div class="regAndSign">
			<div class="register"><a href="">Register</a></div>
			<div class="split">&nbsp;|&nbsp;</div>
			<div class="login"><a href="">Sign in</a></div>
			<div class="search">
				<div class="searchInfo">search or jump to...</div>
				<img src="img/search.png" />
			</div>
		</div>
	</div>
	
	<!-- 除导航栏外全部内容 -->
	<div class="allPage">
		<!-- 左侧导航栏 -->
		<div class="leftNav">
			<div class="logo"><img src="img/logo.png"/></div>
			<div class="nav"><a href="home.jsp">HOME</a></div>
			<div class="nav"><a href="list2">INTERFACE TEST</a></div>
			<div class="nav"><a href="list">MANAGEMENT</a></div>
			<div class="nav"><a href="theTeam.jsp">THE TEAM</a></div>
		</div>
		
		<!-- 右侧内容区域 -->
		<div class="rightPage">
			<!-- 产品介绍 -->
			<div class="teambox">
				<div team-1>关于我们</div>
				<div class="description">
					BTF小组成立于2020年10月，原名“防脱发研究小组”，寓意代码写的再多，熬夜再厉害，年龄再大都不会脱发！！
					由衷的希望每一个代码的搬运工都能有一头秀发，乌黑亮丽~~~永远不会担心头发是不是比之前少了，，，当然，我们只是希望这样。
					搭建好本接口测试平台是我们共同的目标，防脱发亦如是。
				</div>
				<div class="description">
					人的命，三分天注定，七分靠打拼，有梦就”会红”，爱拼才会赢。只要不把自己束缚在心灵的牢笼里，谁也束缚不了你去展翅高飞。
					成败一笑过，潇洒向前行。人生充满变数,不知下一分下一秒我们将在何处。所以，别让自己的心太累,简单一点，快乐一些，
					看花开花落，听流水潺潺，淡定从容地去生活!
				</div>
				<div class="description">
					“我宁愿自己没实力输掉，也不愿有实力做不到”，在人生的道路上，我们总是会觉得这样或者是那样的不如意，但千万别跟自己过不去，
					而要懂得善待自己，只有这样我们才能获得精神的解脱，从容地走自己选择的路，做自己喜欢做的事。
				</div>
				
				<div class="english">
					<img src="img/fly.png" />
					<div class="saying">Don't stop when you try, you'll see what you'll look like one day.</div>
				</div>
				
			</div>
			
			<!-- 关于我们 -->
			<div class="aboutUs">
				<div class="teamInfo">
					<div class="teamInfo-1">更多服务</div>
					<div class="teamInfo-1">在线客服</div>
					<div class="teamInfo-1">线下服务</div>
					<div class="teamInfo-1">零售查询</div>
					<div class="teamInfo-1">服务热线</div>
				</div>
				<div class="teamInfo">
					<div class="teamInfo-1">产品发布</div>
					<div class="teamInfo-1">升级维护</div>
					<div class="teamInfo-1">产品研发</div>
					<div class="teamInfo-1">最新技术</div>
					<div class="teamInfo-1">了解更多</div>
				</div>
				<div class="teamInfo">
					<div class="teamInfo-1">关于我们</div>
					<div class="teamInfo-1">团队建设</div>
					<div class="teamInfo-1">品牌logo</div>
					<div class="teamInfo-1">独家赞助</div>
					<div class="teamInfo-1">了解更多</div>
				</div>
			</div>
			
			<!-- 联系我们 -->
			<div class="connection">
				<div class="conTitle">联系我们</div>
				<div class="information">
					<div class="info">
						<img src="img/icon01.png" />
						<div class="info-1">address：河北师范大学软件学院</div>
					</div>
					<div class="info">
						<img src="img/icon02.png"/>
						<div class="info-1">cal：15232182756</div>
					</div>
					<div class="info">
						<img src="img/icon03.png"/>
						<div class="info-1">team：BTFgroup</div>
					</div>
				</div>
				<div class="images">
					<img src="img/qq.png"/>
					<img src="img/Wechat.png"/>
					<img src="img/weibo.png"/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>