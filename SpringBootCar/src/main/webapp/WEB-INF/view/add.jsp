<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body style="background-color: F5DEB3;">
    <div class="container-fluid">
    
        <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
        <h4>Please fill the following details</h4>
            <div class="form-group">
            <form:form action="addCar" modelAttribute="car">
            
            <form:hidden path="id" />
          
            <form:label path="company">Enter Company Name</form:label>
            <form:input path="company" class="form-control"/>
             <form:label path="model">Enter Model</form:label>
            <form:input path="model" class="form-control"/>
            <form:label path="color">Enter Color</form:label>
            <form:input path="color" class="form-control"/>
            <form:label path="dateofpurchase">Enter Date Of Purchase</form:label>
            <form:input path="dateofpurchase" class="form-control"/>
            <form:label path="price">Enter Price</form:label>
            <form:input path="price" class="form-control"/>
            <form:label path="enginecapacity">Enter Engine Capacity</form:label>
            <form:input path="enginecapacity" class="form-control"/>
            <form:label path="licenceplatenumber">Enter Licence PlateNumber</form:label>
            <form:input path="licenceplatenumber" class="form-control"/>
            <form:label path="seatingcapacity">Enter Seating Capacity</form:label>
            <form:input path="seatingcapacity" class="form-control"/>
            
            <form:button type="submit" class="btn btn-success">Submit</form:button>
            
            </form:form>
        </div>
        </div>
        <div class="col-sm-3"></div>
    </div>
        
    </div>
    
</body>
</html>