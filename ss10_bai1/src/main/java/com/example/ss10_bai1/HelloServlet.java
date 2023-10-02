package com.example.ss10_bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Customer> list =new ArrayList<>();
                list.add(new Customer("kiet", "11/09/2003", "quang nam","https://i.ytimg.com/vi/dh8hvkDL_po/maxresdefault.jpg"));
                list.add(new Customer("hau", "5/10/2002", "quang ngai","https://img6.thuthuatphanmem.vn/uploads/2022/04/19/hinh-anh-anime-nam-ngau-loi-dep-nhat_081256260.jpg"));
                list.add(new Customer("nhu", "19/01/2002", "phu yen","https://kenh14cdn.com/thumb_w/660/203336854389633024/2023/1/5/photo-20-16728916028822010149407.png"));
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}