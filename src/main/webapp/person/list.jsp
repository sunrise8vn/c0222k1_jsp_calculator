<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>List of persons</title>
</head>
<body>
    <h1>List of persons</h1>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Balance</th>
                <th>Phone</th>
                <th>Rate</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${requestScope['personList']}" var="item">
                <tr>
                    <td>${item.getId()}</td>
                    <td>${item.getName()}</td>
                    <td>${item.getEmail()}</td>
                    <td>
                        <fmt:formatNumber type="currency" pattern="#,##0" value="${item.getBalance()}" />
                    </td>
                    <td>${item.getPhone()}</td>
                    <td>VIP</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
