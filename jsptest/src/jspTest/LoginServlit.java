package jspTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request,response);
		System.out.println("겟");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request,response);
		System.out.println("포스트");
	}

	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//post 한글
		response.setContentType("text/html;charset=utf-8");//get 한글
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
//		String hv = request.getParameter("hValue");
		PrintWriter out = response.getWriter();
		try {
			int hv = Integer.parseInt(request.getParameter("hValue"));
		} catch(Exception e) {
			out.println("ㅇㅇ?");
		}
//		PrintWriter out = response.getWriter();
		out.println("<p>아이디 = "+id+"</p>");
		out.println("<p>비밀번호 = "+pw+"</p>");
//		out.println(hv);
	}

}
