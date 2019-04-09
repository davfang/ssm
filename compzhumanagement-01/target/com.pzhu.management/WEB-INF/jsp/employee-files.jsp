<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
    <title>员工档案管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/table.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
   
</head>
<body>
<%@ include file="top.jsp"%>
<%@ include file="left.jsp"%>
<div class="all">
<div class="level">
    <img src="${pageContext.request.contextPath}/images/house.png">
    <div class="txt">&nbsp;首页&nbsp;&gt;&nbsp;档案管理&nbsp;&gt;&nbsp;员工档案</div>
</div>
<form action="/Employee/selectEmployeeSelective" method="post">
<div class="whole">
    <div class="littletitle">搜索查询</div>
    员工编号：<input type="text" placeholder="按员工编号查询" name="ecode" class="text">&nbsp;&nbsp;
    员工姓名：<input type="search" style="height: 30px" placeholder="按员工姓名查询" name="ename" class="text">&nbsp;&nbsp;
    <img src="${pageContext.request.contextPath}/images/query.jpg" class="img1">&nbsp;<input type="submit" value="查询" class="button">&nbsp;&nbsp;
    <img src="${pageContext.request.contextPath}/images/add.png" class="img2">&nbsp;<a href="/page/employee-insert">新增</a>&nbsp;&nbsp;
    <img src="${pageContext.request.contextPath}/images/reset.png" class="img3">&nbsp;<input type="reset" value="重置" class="button">
</div>

<div class="main">
    <table id="cs_table" border-color="blue" class="data-table">
        <thead>
        <tr class="head">
            <td>员工编号</td>
            <td>姓名</td>
            <td>出生日期</td>
            <td>性别</td>
            <td>电话</td>
            <td>电子邮件</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody id="group_one">
        <c:forEach items="${list}" var="list">
			<tr>	
				<td>${list.ecode}</td>
				<td>${list.ename}</td>
				<td>${list.birthday}</td>
				<td>${list.sex}</td>
				<td>${list.etelephone}</td>
				<td>${list.eemail}</td>
				<td><a href="${pageContext.request.contextPath}/Employee/deleteEmployee?eid=${list.eid}">删除</a>&nbsp;
					<a href="${pageContext.request.contextPath}/Employee/selectByPrimaryKey?eid=${list.eid}">修改</a>
				</td>		
			</tr>
		</c:forEach>
        </tbody>
       
    </table>
    <hr>
</div>
</form>
</div>

</body>
</html>