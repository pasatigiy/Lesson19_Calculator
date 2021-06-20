package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    private CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int num1 = Integer.parseInt(req.getParameter("num1"));

        int num2 = Integer.parseInt(req.getParameter("num2"));


        String operation = req.getParameter("operation");
        double calculate = calculatorService.calculate(num1, num2, operation);
        resp.getWriter().println("result" + " " + calculate);

    }
}
