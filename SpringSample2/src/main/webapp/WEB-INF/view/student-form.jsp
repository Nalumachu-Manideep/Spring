<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Student Registration Form</title>
        <style>
            .error{color:red}
        </style>
    </head>

    <body>
        <h2>Student Form</h2>
        <form:form action="processForm" modelAttribute="student">

        First name (*) :<form:input path="firstName"/>
        <form:errors path="lastName" cssClass="error" />

        <br><br>
        Last name (*) : <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />

        <br><br>

        Age:  <form:input path="age" />
        <form:errors path="age" cssClass="error" />

        <br><br>

        Postal Code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>

        <br><br>

        Course Code: <form:input path="courseCode"/>
                <form:errors path="courseCode" cssClass="error"/>

        <br><br>


        Country:
         <br><br>
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>

        </form:select>
        <br><br>
        Favourite Language:
        <br><br>
        <form:radiobutton path="favouriteLanguage" value="Java"/> Java
        <form:radiobutton path="favouriteLanguage" value="Python"/> Python
        <form:radiobutton path="favouriteLanguage" value="PHP"/> PHP
        <form:radiobutton path="favouriteLanguage" value="R"/>R

        <br><br>
        Operating System :
        <br><br>
        <form:checkbox path="operatingSystems" value="Linux"/>Linux
        <form:checkbox path="operatingSystems" value="Mac OS"/>Mac OS
        <form:checkbox path="operatingSystems" value="MS Windows"/>MS Windows

        <br><br>

        <input type="submit" value="Submit" />

        </form:form>
    </body>
</html>