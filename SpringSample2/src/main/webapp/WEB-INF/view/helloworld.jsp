<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hello World Page</title>
    </head>
    <body>
        <h2>Hello World of Spring!</h2>
        <br><br>
        Student name:
        <c:out value="${param.studentName}" />

        <br><br>
        The message: <c:out value="${message}" />
    </body>
</html>
