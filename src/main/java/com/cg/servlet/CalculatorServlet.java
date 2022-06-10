package com.cg.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");

        int firstOperand = Integer.parseInt(req.getParameter("firstOperand"));
        String operator = req.getParameter("operator");
        int secondOperand = Integer.parseInt(req.getParameter("secondOperand"));

        float result = 0;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
        }

        req.setAttribute("firstOperand", firstOperand);
        req.setAttribute("operator", operator);
        req.setAttribute("secondOperand", secondOperand);

        req.setAttribute("result", result);

        dispatcher.forward(req, resp);
    }
}
