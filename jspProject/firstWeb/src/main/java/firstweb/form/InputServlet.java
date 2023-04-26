package firstweb.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormInput")
public class InputServlet extends HttpServlet {
	
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("UTF-8");
		
		
		
		
		// 내용 입력데이터 받기
		String content = request.getParameter("content");
		System.out.println("content : " + content);
		
		PrintWriter out = response.getWriter();
		out.println("<h3>content : " + content+"</h3>");
		
	}

}
