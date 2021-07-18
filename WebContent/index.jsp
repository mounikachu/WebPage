<%@include file="CommonHeader.jsp" %>

<a href="Demo.jsp">JSP Page</a> 
<a href="Login.jsp">Login</a> 

<h2>Get Request - From</h2>

<from action="MyHttpServlet" method="post">
<input type="Submit" value="myHttpServlet"/>
</from>

<h2>Get Request - Hyperlink</h2>
<a href="MyHttpServlet">My Http Servlet</a>

<h2>Post Request - Post</h2>

<from action="MyHttpServlet" method="get">
<input type="Submit" value="myHttpServlet"/>
</from>



</body>
</html>