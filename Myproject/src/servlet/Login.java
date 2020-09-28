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
		String username = request.getParameter("username"); //��ȡ����nameΪusername��ֵ��
		String password = request.getParameter("password");//��ȡ����nameΪpassword��ֵ��
		
		HttpSession session = request.getSession();//����Session
		
		User user = new User();
		boolean isExist= user.isUserExist(username,password);
		if(isExist) {
			session.setAttribute("username",username);//���û����浽session��
			response.sendRedirect("zhuye.jsp");
		}else {
			response.sendRedirect("index.html");
		}
		
//		//�ж�username��password�Ƿ��Common�ӿ������һ�£���ͬ�Ļ�����ת��
//		if(username.equals( Common.zhangsan.getUsername() ) && password.equals( Common.zhangsan.getPassword() )) {
//		
//			session.setAttribute("username", username);//��username���浽ȫ�ִ洢��
//			
//			response.sendRedirect("zhuye.jsp");//��ת��zhuye.jsp���ҳ��
//			return;
//		}
//		if(username.equals( Common.caixukun.getUsername() ) && password.equals( Common.caixukun.getPassword() )) {
//			
//			session.setAttribute("username", username);//��username���浽ȫ�ִ洢��
//			
//			response.sendRedirect("zhuye.jsp");
//			return;
//		}
//		//������϶�û��һ�µĻ�������index.html
//		response.sendRedirect("index.html");
		
	}

}
