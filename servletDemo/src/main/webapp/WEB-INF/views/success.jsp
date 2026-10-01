<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Response</title>
</head>
<body>

    <h1>your name is : <%= request.getParameter("uname") %></h1>

    <h1>your city is : <%= request.getParameter("ucity") %></h1>

</body>
</html>
