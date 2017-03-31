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

@WebServlet("/removeAll.do")
public class RemoveWishlistAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WishlistService service = new WishlistServiceLogic();
		HttpSession session = request.getSession();
		String userId=(String)session.getAttribute("loginId");
		
		
//		String userId = session.getId();
		service.removeLectureAllWishlist(userId);
	
		
		response.sendRedirect("./wishlist.do");
	}

}
