package kr.or.ddit;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculate.do")


public class CalculateServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int leftOp = Integer.parseInt(request.getParameter("leftOp"));
		String op = request.getParameter("operator");		
		int rightOp = Integer.parseInt(request.getParameter("rightOp"));
		Object result = 0;
		
		switch (op) {
		case "+":
			result = leftOp + rightOp;
			break;
		case "-":
			result = leftOp - rightOp;
			break;
		case "*":
			result = leftOp * rightOp;
			break;
		case "/":
			result = (double)leftOp / rightOp;
			break;
		}
		
		String resultStr = MessageFormat.format("{0}{1}{2} = {3}", leftOp, op, rightOp, result);
		
		request.setAttribute("result", resultStr);
		
		request.getRequestDispatcher("/01/calculateForm.jsp").forward(request, response);
	
	}

}
