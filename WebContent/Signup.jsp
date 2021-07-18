<%@include file="CommonHeader.jsp"%>

	<div class="container">
			<h2 class="text-center" id="title">Sign Up Here</h2>
			 <p class="text-center">
				<small id="passwordHelpInline" class="text-muted"> Developer: 
				Quick Sign Up For existing Shopping
				</small>
			</p>
 			<hr>
			<div class="row">
				<div class="col-md-5">
 					<form role="form" method="post" action="SignUp">
						<fieldset>							
							<p class="text-uppercase pull-center"> SIGN UP</p>	
 							<div class="form-group">
								<input type="text" name="username" id="username" 
								class="form-control input-lg" placeholder="username">
							</div>

							<div class="form-group">
								<input type="email" name="email" id="email" 
								class="form-control input-lg" placeholder="Email Address">
							</div>
							<div class="form-group">
								<input type="text" name="cname" id="cname" 
								class="form-control input-lg" placeholder="Enter Customer Name">
							</div>
							<div class="form-group">
								<input type="password" name="passwd" id="passwd"
								 class="form-control input-lg" placeholder="Password">
							</div>
								
							
 							<div>
 									  <input type="submit" class="btn btn-lg btn-primary" value="Sign Up">
 							</div>
						</fieldset>
					</form>
				</div>
				
				
</body>
</html>