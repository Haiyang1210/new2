package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

//import org.apache.tomcat.jni.User;
import sen.User;

/**
 * Servlet implementation class Servl
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("index.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username"); //获取表单里name为username的值。
		String password = request.getParameter("password");//获取表单里name为password的值。
		
		HttpSession session = request.getSession();//定义Session
		
		User user = new User();
		boolean isExist= user.isUserExist(username,password);
		if(isExist) {
			session.setAttribute("username",username);//把用户名存到session中
			response.sendRedirect("zhuye.jsp");
		}else {
			response.sendRedirect("index.html");
		}
		
//		//判断username和password是否和Common接口里面的一致，相同的话就跳转；
//		if(username.equals( Common.zhangsan.getUsername() ) && password.equals( Common.zhangsan.getPassword() )) {
//		
//			session.setAttribute("username", username);//将username保存到全局存储。
//			
//			response.sendRedirect("zhuye.jsp");//跳转到zhuye.jsp这个页面
//			return;
//		}
//		if(username.equals( Common.caixukun.getUsername() ) && password.equals( Common.caixukun.getPassword() )) {
//			
//			session.setAttribute("username", username);//将username保存到全局存储。
//			
//			response.sendRedirect("zhuye.jsp");
//			return;
//		}
//		//如果以上都没有一致的话则跳到index.html
//		response.sendRedirect("index.html");
		
	}

}
