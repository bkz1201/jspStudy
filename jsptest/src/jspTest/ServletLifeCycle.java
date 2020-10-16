package jspTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletlifecycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLifeCycle() {
        super();
        System.out.println("생성자");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화");
	}
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("소멸자");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
		System.out.println("서비스");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("겟");
		PrintWriter w = response.getWriter();
		w.println("<h1>JSP 예제</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("포스트");
	}

}
