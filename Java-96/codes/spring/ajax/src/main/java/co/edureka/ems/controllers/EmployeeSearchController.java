package co.edureka.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;

public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		service = (EmployeeService) context.getBean("employee-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eno = Integer.parseInt(request.getParameter("eno"));
		
		Employee emp = service.searchEmployeeByNo(eno);
		
		PrintWriter out = response.getWriter();
		
		if(emp != null) {
			response.setContentType("application/json");
			JSONObject jObj = new JSONObject();
			jObj.put("emp_name", emp.getEmployeeName());
			jObj.put("emp_sal", emp.getEmployeeSal());
			
			out.print(jObj);
		}else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
