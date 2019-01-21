<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="shortcut icon" type="image/png" href="image/favicon.png" />
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/profile.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<!--  admin Header  -->
	<div class="row">
		<jsp:include page="adminheader.jsp" />
	</div>
			<!-- admin body Page -->
						<div class="container-fluid" style="margin-top:20px">
								<div class="row">
										<div class="account col-md-4 col-md-offset-3">
											<h1 class="well text-center">Create New Account</h1>
												<div class="col-lg-12 well">
													<div class="row">
														<form action="AccountLinkController" method="post">
														<div class="col-sm-12">
														<div class="col-sm-5 form-group">
															<label class="required"><strong>Customer ID:</strong></label>
														</div>
														<div class="col-sm-6 form-group">
														<input type="hidden" class="form-control" name="cid1" value="<%=request.getAttribute("custid")%>"/>
														<input type="text" class="form-control" name="cid" value="<%=request.getAttribute("custid")%>" disabled="disabled"/>
														</div>
														
														</div>
														<div class="col-sm-12">
														<div class="col-sm-5 form-group">
															<label class="required"><strong>Intial Amount:</strong><span
																			style="color: red; font-size: 14px">*</span></label>
														</div>
														<div class="col-sm-6 form-group">
														<input type="text" class="form-control" name="amount" placeholder="Enter Initial Amount" required/>
														</div>
														
														</div>
														<div class="col-sm-12">
														<div class="col-sm-5 form-group">
															<label class="required"><strong>Branch Name:</strong>
															
														</div>
														<div class="col-sm-6 form-group">
														<select class="form-control" name="branchname" placeholder="Enter Branch Name">
														<option>Dhaka</option>
												<option>Khulna</option>
												<option>Chittagong</option>
												<option>Rajshahi</option>
												<option>Sylhet</option>
												<option>Mymensingh</option>
												<option>Rangpur</option>
												<option>Comilla</option>
														</select>
														</div>
														
														</div>
														<div class="col-sm-12">
														<div class="col-sm-5 form-group">
															<label class="required">Account Type:</label>
										
														</div>
														<div class="col-sm-6 form-group">
														<div class="input-group-btn">
											<select class="form-control btn btn-default"
												name="acctype" required>
												<option >Saving Account</option>
												<option>Current Account</option>
												
											</select>
										</div>
														</div>
														
														</div>
														<div class="col-sm-12">
														<div class="col-sm-12 form-group">
															<label class="required"><strong><div class="form-group">
																<span class="text-muted"><em><span
																			style="color: red; font-size: 14px">*</span> Indicates
																				required field</em> </span>
																			
														</div></strong></label>
														</div>
														
														
														</div>
																			<div class="col-md-12">
																				<div class="col-sm-3">
																				</div>
																				<div class="col-sm-8">
																				<input type="submit" value="AddAccount" name="submit" class="btn btn-primary">
																				</div>
																			</div>
														
														</form>
														
													</div>
													
												</div>
										</div>
								</div>
	
						</div>
<!-- admin Footer -->
	<div class="row">
	<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>