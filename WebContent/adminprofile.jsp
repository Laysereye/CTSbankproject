<%@page import="javax.servlet.http.HttpSession,java.util.*,com.arbs.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" type="image/png" href="image/favicon.png" />
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/profile.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="row">
		<jsp:include page="adminheader.jsp" />
	</div>
		  
	<div class="container" style="margin-top:70px">
			<div class="row">
			<% List<Customer> clist=(List<Customer>)request.getAttribute("clist");
		  if(clist==null)
		  {
		  %>
									<div class="col-md-4 col-md-offset-4">
										<div class="panel panel-default">
											<div class="panel-heading">
													<h3 class="panel-title">
															<strong>Create Account to link</strong>
													</h3>
											</div>
													<div class="panel-body">
															<form  action="AccountController" method="post">
																<div class="space" style="margin-top:20px"></div>
												<!-- <div class="alert alert-danger">Incorrect Username or Password!</div> -->
																<div style="margin-bottom: 12px" class="input-group">
																		<span class="input-group-addon"><i
																			class="glyphicon glyphicon-user"></i></span> <input
																			id="login-username" type="text" class="form-control"
																			name="username" value="" placeholder="Enter Customer name">
																</div>

																<input type="submit" name="account" value="Search" class="btn btn-success" />
							
													</div>
										</div>
									</div>
				
				<%}
		  else 
				{
				%>
				
							<div class="col-md-10 col-md-offset-2">
								<div class="panel panel-default">
										<div class="panel-heading">
												<h3 class="panel-title">
													<strong>Customer Profile</strong>
												</h3>
										</div>
										
												
												<div class="panel-body">
												<div class="table-responsive">          
  														<table class="table">
  														<thead>
  															
  															<th>Customer Id:</th>
  															<th>First Name </th>
  															<th>Last Name</th>
  															<th>Address </th>
  															<th>City </th>
  															<th>Branch </th>
  															<th>DOB: </th>
  															<th>Email: </th>
  														</thead>
  														<tbody>
												<form  action="AccountController" method="post">
												
												<div class="space" style="margin-top:10px"></div>
															<!-- <div class="alert alert-danger">Incorrect Username or
																Password!</div> -->
												 <div style="margin-bottom: 12px" class="form-check-label">	
												<%for(Customer cust:clist)
											{
										%>		
																			
											<tr> 
											<td><input type="radio" 
													name="custid"  class="required" value='<%=cust.getId() %>' required >
												<%=cust.getId() %></td>
												<td><%=cust.getFirstname() %></td>
												<td><%=cust.getLastName() %></td>
												<td><%=cust.getAddress() %></td>
												<td><%=cust.getCity() %>
												<td><%=cust.getBranch() %></td>
												<td><%=cust.getDob() %></td>
												<td><%=cust.getEmail() %></td>	
													</tr>
												 <%} %>	
												 </div> 
												<tr>
												
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td><input type="submit" name="account" value="AddCustomer" class="btn btn-danger" /></td>
												<tr>
												
												</form>
							
												</tbody>
												</table>
  												</div>
								</div>
					     </div>
					     					
					    					 		
									<%} %>
			</div>
		</div>
		

		

		<!-- Footer start here -->
		<div class="row" style="margin-top: 50px;">
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>