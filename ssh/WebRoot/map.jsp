<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Map</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<!-- 加载OpenLayers 类库 -->
<script type="text/javascript" src="http://www.openlayers.cn/olapi/OpenLayers.js"></script>
<style>
html,body {
	width: 100%;
	height: 100%;
	margin: 0;
	padding: 0;
}
</style>
<!-- 关键代码在这里了 -->
<script type="text/javascript">
	function init() {
		// 使用指定的文档元素创建地图
		var map = new OpenLayers.Map("rcp1_map");
		// 创建一个 OpenStreeMap raster layer
		// 把这个图层添加到map中
		var osm = new OpenLayers.Layer.OSM();
		map.addLayer(osm);
		// 设定视图缩放地图程度为最大
		map.zoomToMaxExtent();
	}
</script>
</head>
<body onload="init()">
	<div id="rcp1_map" style="width: 100%;height: 100%;">
</div>
</body>
</html>

