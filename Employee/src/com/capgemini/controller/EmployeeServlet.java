package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/get employee details")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Employee> employees = new ArrayList<>();
	
    public EmployeeServlet() {
        super();
    }
@Override
public void init() throws ServletException {
	
		employees.add(new Employee(123,"john",300000.0,"devops"));
		employees.add(new Employee(124,"mac",400000.0,"SAP consultant"));
		employees.add(new Employee(125,"sia",200000.0,"customer care"));
		employees.add(new Employee(126,"kiya",200000.0,"customer care"));
	
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		String empid=request.getParameter("EmployeeId");
		
		int employee=Integer.parseInt(empid);
		int flag=0;
        for (Employee e : employees) {
        	
			 if(employee==e.getEmpId()) {
				 flag=1;
				 
				 out.println("<table border='1'><tr><th>empName</th><th>salary</th><th>deptName</th></tr>");
				 out.println("<tr><td>"+e.getEmpName()+"</td><td>"+e.getSalary()+"</td><td>"+e.getDeptName()+"</td></tr></table>");
				 out.println("<br><br><a href='employee.html'>Get another employee details</a>");
			 }  
		}	
       
        if(flag==0)
        {
			 out.println("Invalid employeeId");
			 out.println("<br><br><a href='employee.html'>Try Again</a>");
        }
	 
		out.close();
	}
}
