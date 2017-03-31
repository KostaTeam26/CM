package cm.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cm.domain.Lecture;
import cm.service.facade.WishlistService;
import cm.service.logic.WishlistServiceLogic;

@WebServlet("/wishlist.do")
public class WishlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WishlistService service = new WishlistServiceLogic();
		
		//HttpSession session = request.getSession(); 
		
		HttpSession session=request.getSession();
		String userId=(String)session.getAttribute("loginId");
		//userId = session.getId();
		List<Lecture> list = new ArrayList<>();
		
		list = service.selectLectureAllWishlist(userId);
		
		request.setAttribute("lists", list);
	
		request.getRequestDispatcher("/views/wishlist.jsp").forward(request, response);
	
	}
}
