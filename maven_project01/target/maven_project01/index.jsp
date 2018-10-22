<%@page pageEncoding="utf-8" language="java" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <table border="1">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>身高</th>
                <th>生日</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${list}" var="stu" >
                <tr>
                    <td>${stu.sid}</td>
                    <td>${stu.sname}</td>
                    <td>${stu.sex}</td>
                    <td>${stu.height}</td>
                    <td>${stu.birth}</td>
                    <td>
                        <a href="#">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
