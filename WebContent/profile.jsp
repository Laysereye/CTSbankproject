
<%@page import="com.arbs.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%!Customer customer;%>

<%
	Customer customer=(Customer) session.getAttribute("ud");
		System.out.print("profile jsp: customer:::"+customer.getFirstname());
%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=customer.getFirstname() + " " + customer.getLastName()%></title>
<link rel="shortcut icon" type="image/png" href="image/favicon.png" />
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/profile.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="row">
		<jsp:include page="loginheader.jsp" />
	</div>

	<div class="container-fullwidth">
		<div class="jumbotron col-md-6 col-md-offset-3"
			style="margin-top: 50px">
			<div class="row">
				<div class="profile-head col-md-10 col-md-offset-1">
					<div class="col-md-4 ">
						<img class="img-circle img-responsive" alt="" src="image/user.png">
					</div>


					<div class="col-md-6 ">
						<h2><%=customer.getFirstname() + " " + customer.getLastName()%></h2>
						<ul>
							<li class="navli"><span
								class="glyphicon glyphicon-map-marker"></span> <%=customer.getBranch()%></li>
							<li class="navli"><span class="glyphicon glyphicon-home"></span>
								<%=customer.getAddress()%></li>
							<li class="navli"><span class="glyphicon glyphicon-phone"></span><%=customer.getPhone()%></li>
							<li class="navli"><span class="glyphicon glyphicon-envelope"></span><%=customer.getEmail()%></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="account_details col-md-10 col-md-offset-1"
					style="margin-top: 30px;">
					<h2>Account Details</h2>
					<hr class="divider">
					<table class="table table-user-information col-md-6">
						<tbody>
							<tr>
								<td><b>First Name:</b></td>
								<td><%=customer.getFirstname()%></td>
							</tr>
							<tr>
								<td><b>Last Name:</b></td>
								<td><%=customer.getLastName()%></td>
							</tr>
							<tr>
								<td><b>Address</b></td>
								<td><%=customer.getAddress()%></td>
							</tr>
							<tr>
								<td><b>City</b></td>
								<td><%=customer.getCity()%></td>
							</tr>
							<tr>
								<td><b>Branch Name</b></td>
								<td><%=customer.getBranch()%></td>
							</tr>
							<tr>
								<td><b>Zip</b></td>
								<td><%=customer.getPin()%></td>
							</tr>
							<tr>
								<td><b>UserName</b></td>
								<td><%=customer.getUsername()%></td>
							</tr>
							<tr>
								<td><b>Phone Number</b></td>
								<td><%=customer.getPhone()%></td>
							</tr>
							<tr>
								<td><b>Email</b></td>
								<td><a href="mailto:" +<%=customer.getEmail()%> ><%=customer.getEmail()%></a></td>
							</tr>
							<tr>
								<td><b>ID</b></td>
								<td><%=customer.getId()%></td>
							</tr>
							<tr>
								<td><b>Date of Birth</b></td>
								<td><%=customer.getDob()%></td>
							</tr>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>

		<div class="row"></div>

		<!-- Footer start here -->
		<div class="row" style="margin-top: 50px;">
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>