<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Student Confirmation</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"">    </head>
    <body>
        <h2>The Student Details are </h2>
        <h4 style="color:red;">The student is confirmed : </h4> ${student.firstName} ${student.lastName}

        <br><br>
         Age:${student.age}

        <br><br>
        Postal Code:${student.postalCode}

        <br><br>

        Course Code:${student.courseCode}

        <br><br>
        Country : ${student.country}

        <br><br>
        Favourite Language: ${student.favouriteLanguage}

        <br><br>
        Operating Systems:
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>


    </body>
</html>