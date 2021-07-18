

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CredentialDAO;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
    	   
String username=request.getParameter("username");
String password=request.getParameter("passwd");
String customerName=request.getParameter("cname");
String email=request.getParameter("email");
    	  
model.Credential obj=new model.Credential();

obj.setUsername(username);
obj.setPassword(password);
obj.setEmail(email);
obj.setCustomerName(customerName);
	
try
{
	CredentialDAO objDAO=new CredentialDAO();
	objDAO.insertCredential(obj);
}
catch(Exception e)
{
	out.println("Exception Arised: "+e);
}
       
	}  
       
       }
