package cm.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.service.facade.WishlistService;
import cm.service.logic.WishlistServiceLogic;
@WebServlet("/registWishlist.do")
public class RegisteWishlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		WishlistService service = new WishlistServiceLogic();
		
		HttpSession session = request.getSession();
		String userId=(String)session.getAttribute("loginId");
		
		

		
		String[] a=request.getParameterValues("checkLecture");
		int []b= new int[a.length];
		for(int i=0; i<a.length; i++){
			b[i]+=Integer.parseInt(a[i]);
			}
		for (int lectureId : b) {
			service.createLectureWishlist(userId, lectureId);
		}
		
//		String[] a=request.getParameterValues("checkLecture");
//		String[] b=new String[a.length];
//		for(int i=0; i<a.length; i++){
//			b[i]=a[i];
//			for(String lecture : b){
//				System.out.println(lecture);
//			}
//		}
//		
		
		
		
		//둘 중 선택
		response.sendRedirect("./views/lectureList.jsp");
	}

	
	

	
}
