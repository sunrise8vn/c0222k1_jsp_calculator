package com.cg.servlet;

import com.cg.model.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "PersonServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/person/list.jsp");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Quỳnh Anh Shine", "nva@gmail.com", BigDecimal.valueOf(0), "2345"));
        personList.add(new Person(2, "Phước boy", "nvb@gmail.com", BigDecimal.valueOf(1000), "2345"));
        personList.add(new Person(3, "Phúc bồ", "nvc@gmail.com", BigDecimal.valueOf(50000000), "2345"));
        personList.add(new Person(4, "Đại mộng du", "nvd@gmail.com", BigDecimal.valueOf(999999000), "2345"));

        req.setAttribute("personList", personList);

        dispatcher.forward(req, resp);
    }
}
