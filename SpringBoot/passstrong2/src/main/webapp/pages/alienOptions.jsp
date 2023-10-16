<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

    <form action="/getAllAlien">
        <input type="submit" value="Get All Alien Values"/><br>
    </form>
    <br><br>
    <form action="/showOneAlien">
        <input type="number" name="aid"/><br>
        <input type="submit" value="Give the Primary Key for the Alien you can see"/><br>
    </form>
    <br><br>
    <form action="/addAlien">
        <input type="number" name="aid"/><br>
        <input type="text" name="aname"/><br>
        <input type="text" name="lang"/><br>
        <input type="submit" value="Submit options"/><br>
    </form>
    <br><br>
    <form action="/updateAlien">
        <input type="number" name="aid"/><br>
        <input type="text" name="aname"/><br>
        <input type="text" name="lang"/><br>
        <input type="submit" value="Alien Update done"/><br>
    </form>
    <br><br>
    <form action="/deleteAlien">
        <input type="number" name="aid"/><br>
        <input type="submit" value="What Alien you can Delete"/><br>
    </form>
    <br><br>
    <form action="/deleteAllAlien">
        <input type="submit" value="Delete all Data in Data Base"/><br>
    </form>

</body>
</html>