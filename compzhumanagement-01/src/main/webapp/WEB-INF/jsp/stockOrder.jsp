<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
    <title>销售管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/table.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
    
</head>
<body>
<%@ include file="top.jsp"%>
<%@ include file="left.jsp"%>
<div class="all">
<div class="level">
    <img src="${pageContext.request.contextPath}/images/house.png">
    <div class="txt">&nbsp;首页&nbsp;&gt;&nbsp;销售管理&nbsp;&gt;&nbsp;订货单</div>
</div>
<form action="/Orders/selectOrdersSelective" method="post">
<div class="whole">
    <div class="littletitle">搜索查询</div>
    订单编号：<input type="text" placeholder="请输入订单编号" class="text" name="oid">&nbsp;&nbsp;
    商品名称：<input type="search" style="height: 30px" placeholder="请输入商品名称" class="text" name="mname">&nbsp;&nbsp;
    <img src="${pageContext.request.contextPath}/images/query.jpg" class="img1">&nbsp;<input type="submit" value="查询" class="button">&nbsp;&nbsp;
    <img src="${pageContext.request.contextPath}/images/add.png" class="img2">&nbsp;<a href="/page/order-insert">新增</a>&nbsp;&nbsp;
    <img src="${pageContext.request.contextPath}/images/reset.png" class="img3">&nbsp;<input type="reset" value="重置" class="button">
</div>

<div class="main">
    <table id="cs_table" border-color="blue" class="data-table">
        <thead>
        <tr class="head">
            <td>订单编号</td>
            <td>客户名称</td>
            <td>商品名称</td>
            <td>订货日期</td>
            <td>订货数量</td>
            <td>经手人</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody id="group_one">
      <c:forEach items="${ord}" var="o">
        <tr>
       	    <td>${o.oid}</td>
            <td>${o.customerid.cname}</td>	
			<td>${o.merchandiseid.mname}</td>
			
			<td>${o.orderdata}</td>
			<td>${o.merchandisenumber}</td>
		
			<td>${o.employeeid.ename}</td>
           
            <td><a href="${pageContext.request.contextPath}/Orders/deleteOrdersByKey?oid=${o.oid}">删除</a>&nbsp;
					<a href="${pageContext.request.contextPath}/Orders/selectOrdersByKey?oid=${o.oid}">修改</a>
				</td>
        </tr>
         </c:forEach>
        </tbody>
 
    </table>
    <table id="cs_table2" class="data-table"></table>
    <hr>
</div>
</form>
</div>

</body>
</html>