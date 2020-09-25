<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/employee/updateemployee" method="post">
          <input type="hidden" name="id" value="${employee.getId()}"/><br>
        员工姓名：<input type="text" name="name" value="${employee.getName()}"/><br>
        员工年龄：<input type="text" name="age" value="${employee.getAge()}"/><br>
        员工性别：<input type="text" name="sex" value="${employee.getSex() }"/><br>
        员工地址：<input type="text" name="address" value="${employee.getAddress() }"/><br>
        员工电话：<input type="text" name="phone" value="${employee.getPhone() }"/><br>
        员工密码：<input type="text" name="password" value="${employee.getPassword() }"/><br>
        <input type="submit" value="提交"/>
    </form>

</div>