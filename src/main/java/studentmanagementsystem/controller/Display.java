package studentmanagementsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/display")
public class Display extends HttpServlet{

	String name=null;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		Cookie[] cookies=req.getCookies();
//		PrintWriter printWriter=resp.getWriter();
//		for(Cookie cookie:cookies) {
//			if(cookie.getName().equals("username")) {
//				name=cookie.getValue();
//			}
//		}
//		printWriter.print("welcome");
//	}
//	
//}
		PrintWriter printWriter=resp.getWriter();
		HttpSession httpSession=req.getSession();
		String name=(String) httpSession.getAttribute("username");
		if(name!=null) {
			printWriter.print("welcome to student management system project");
		}else {
			printWriter.print("login with proper credentials");
		}
}
}
