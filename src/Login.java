import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Credential;
import log.LoginDAO;



@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID=1;
    		private LoginDAO loginDao;

    public void init() {
        loginDao = new LoginDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Credential loginBean = new Credential();
        loginBean.setUsername(username);
        loginBean.setPassword(password);
        

        try {
            if (loginDao.validate(loginBean)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
            	System.out.println("Welcome:"+username);
                response.sendRedirect("Success.jsp");
                
            } else {
                HttpSession session = request.getSession();
                //session.setAttribute("user", username);
               // response.sendRedirect("Login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

