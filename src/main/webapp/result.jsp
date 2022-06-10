<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Result</title>
</head>
<body>
    <h1>RESULT</h1>

    <h2>
        KQ:
        <c:out value="${requestScope['firstOperand']}"/>
        <c:out value="${requestScope['operator']}"/>
        <c:out value="${requestScope['secondOperand']}"/>
        =
        <c:out value="${requestScope['result']}"/>
    </h2>
</body>
</html>
