package cm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import cm.service.facade.ManageLectureService;
import cm.service.logic.ManageLectureServiceLogic;


@WebServlet("/searchDepartment.do")
public class SearchDepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
//		PrintWriter out=response.getWriter();
//		System.out.println("searchDepartment");
//		ManageLectureService service = new ManageLectureServiceLogic();
//		JSONObject jsonObj = new JSONObject();
//		
//			
//		String selectVal = request.getParameter("selectVal");
//		List<String> list=new ArrayList<String>();		
//		
//		list= service.selectDepartmentBySchool(selectVal);
//		for (String departments : list) {
//			JSONObject department = (JSONObject) JSONValue.parse(departments);
//		department.put(key, value);
//		System.out.println(department); 
//			jsonObj.put("department", department);
//			System.out.println(jsonObj);
//		}		
//		out.print(list);
//		out.close();
		
		ManageLectureService service = new ManageLectureServiceLogic();
		
		
		
		String selectVal=request.getParameter("selectVal");
		ArrayList<String> list =new ArrayList<String>();
		
		list=(ArrayList<String>) service.selectDepartmentBySchool(selectVal);
		
		Gson gson=new Gson();
		
		JsonElement element=gson.toJsonTree(list, new TypeToken<List<String>>() {}.getType());
		
		JsonArray jsonArray = element.getAsJsonArray();
		response.setContentType("application/json");
		response.getWriter().print(jsonArray);
		
		
		/*$.ajax({
			url:'Servleturl?dataID='document.getElementById("#data_id").value;
			type:'GET',
			dataType:'json',
			success:function(data){
			document.getElementById("#lat").value=data[0].Lat;
			document.getElementById("#longi").value=data[0].Longi;

			 }
			});
			});*/
		
		
		
		
		
		
		
		
		
	}
	

}
