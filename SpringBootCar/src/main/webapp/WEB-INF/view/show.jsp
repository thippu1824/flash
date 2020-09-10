<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style style="background-color: F5DEB3;">
        table,td,th{
            border: 1px solid black;
        }
    </style>
</head>
<body>

	<div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-10">
             <div class="container-fluid">
        <h4>Welcome Mr.Bean!!!Here is your list of cars</h4> <br>
        <table>
            <tr>
                <th>Company</th>
                <th>Model</th>
                <th>Color</th>
                <th>Date Of Purchase</th>
                <th>Price</th>
                <th>Engine Capacity</th>
                <th>Licence PlateNumber</th>
                <th>Seating Capacity</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            
            <c:forEach var="car" items="${cars }">
            
            	<c:url var="updateLink" value="updateForm">
						<c:param name="CarId" value="${car.id}" />
				</c:url>
				
				<c:url var="deleteLink" value="deleteForm">
						<c:param name="CarId" value="${car.id}" />
				</c:url>
            
		            <tr>
		            	<td>${car.company}</td>
		            	<td> ${car.model}</td>
		            	<td> ${car.color}</td>
		            	<td>${car.dateofpurchase} </td>
		            	<td>${car.price} </td>
		            	<td> ${car.enginecapacity}</td>
		            	<td>${car.licenceplatenumber} </td>
		            	<td>${car.seatingcapacity} </td>
		            	<td>  <a href="${updateLink }"> <button type="button" class="btn btn-warning">Update  car</button></a>
		            	<td>  <a href="${deleteLink }"> <button type="button" class="btn btn-danger">Delete  car</button></a>
		            </tr>
            </c:forEach>

        </table>
    </div>
        </div>
        <div class="col-sm-1"></div>
    </div>
   
</body>
</html>