<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>员工列表</title>
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
                    <small>员工列表 —— 显示员工</small>
                </h1>
            </div>
        </div>
    </div>

   <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/employee/toAddemployee">新增员工</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/employee/allemployee">显示全部员工</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <form class="form-inline" action="${pageContext.request.contextPath}/employee/queryemployee" method="post" style="float: right">
                 <input type="text" name="queryemployeeByName" class="form-control" placeholder="请输入员工姓名" required>
                 <input type="submit" value="查询" class="btn btn-primary">
            </form>
              </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>员工编号</th>
                    <th>员工名字</th>
                    <th>员工年龄</th>
                    <th>员工性别</th>
                    <th>员工地址</th>
                    <th>员工电话</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="employee" items="${list}">
                    <tr>
                        <td>${employee.getId()}</td>
                        <td>${employee.getName()}</td>
                        <td>${employee.getAge()}</td>
                        <td>${employee.getSex()}</td>
                        <td>${employee.getAddress()}</td>
                        <td>${employee.getPhone()}</td>
                        <td>
                           <a href="${pageContext.request.contextPath}/employee/toUpdateemployee?id=${employee.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/employee/del/${employee.getId()}">删除</a>
                       </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
