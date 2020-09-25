<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>

<html>
<head>
    <title>新增员工</title>
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
                    <small>新增员工</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/employee/addemployee" method="post">
        员工Id：<input type="text" name="id" required><br><br><br>
        员工姓名：<input type="text" name="name" required><br><br><br>
        员工年龄：<input type="text" name="age" required><br><br><br>
        员工性别：<input type="text" name="sex" required><br><br><br>
        员工地址：<input type="text" name="address" required><br><br><br>
        员工电话：<input type="text" name="phone" required><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>