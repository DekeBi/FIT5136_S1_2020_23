<%--
  Created by IntelliJ IDEA.
  User: bidek
  Date: 2020/6/3
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup</title>
</head>
<body>
    <h1>Please enter your personal information</h1>
<form action="/WebApp_war_exploded/confirmation" method="post">
    name:<input type="text" name="Name" width="100">
    DOB:<input type="text" name="Date of Birth" width="100">
    email:<input type="text" name="Email" width="30"/>
    password:<input type="password" name="Password" width="20"/>
    nationality:<input type="text" name="Nationality" width="30">
    ID:<input type="text" name="Identification" width="30">
    gender:<input type="text" name="Gender" width="10">
    allergy:<input type="text" name="Allergies" width="200">
    food preference:<input type="text" name="Food Preference" width="200">
    qualification:<input type="text" name="Qualification(s)" width="200">
    workexp:<input type="text" name="Work Experiences" width="200">
    occupation:<input type="text" name="Occupation(s)" width="200">
    skill:<input type="text" name="Computer Skills" width="200">
    language:<input type="text" name="Language(s)" width="200">

    <input type="submit" value="Health&Criminal records"/>
</form>
    <h1>This is your personal information and health criminal records</h1>

    <p>Name: ${name}</p>
    <p>Date of Birth: ${dob}</p>
    <p>Email: ${email}</p>
    <p>Password: ${password1}</p>
    <p>Nationality: ${nationality}</p>
    <p>Identification: ${id}</p>
    <p>Gender: ${gender}</p>
    <p>Allergy: ${allergy}</p>
    <p>Food Preference: ${food}</p>
    <p>Qualification: ${qualification}</p>
    <p>Work Experience: ${exp}</p>
    <p>Occupation: ${occupation}</p>
    <p>Skill: ${skill}</p>
    <p>Language: ${language}</p>

    <p>Health: ${health}</p>
    <p>Criminal: ${criminal}</p>
    <h1>Click Complete Registration to complete</h1>

<form  action="/WebApp_war_exploded/Congratulations" method="post">
    <input type="submit" value="Complete Registration"/>

</form>
</body>
</html>
