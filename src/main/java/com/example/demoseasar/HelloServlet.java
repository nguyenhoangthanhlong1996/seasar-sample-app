package com.example.demoseasar;

import com.example.demoseasar.services.TodoServiceIF;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        S2Container container = S2ContainerFactory.create("dicon/services.dicon");
        TodoServiceIF todoService = (TodoServiceIF) container.getComponent("todoService");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + todoService.test() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}