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

@WebServlet("/remove.do")
public class RemoveWinshlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WishlistService service = new WishlistServiceLogic();

		HttpSession session = request.getSession();
		String userId=(String)session.getAttribute("loginId");
		int lectureId = Integer.parseInt(request.getParameter("id"));

		service.removeLectureWishlist(userId, lectureId);
		response.sendRedirect(request.getContextPath()+"/wishlist.do");
	}

}
