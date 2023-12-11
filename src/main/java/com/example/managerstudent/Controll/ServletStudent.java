package com.example.managerstudent.Controll;

import com.example.managerstudent.Model.Student;
import com.example.managerstudent.Service.ManagerStudent;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
@WebServlet(name = "student", value = "/student")
public class ServletStudent extends HttpServlet {
    ManagerStudent managerStudent = new ManagerStudent();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "create":
                showcCeateForm(req, resp);
                break;
            case "update":
                showUpdateForm(req,resp);
                break;
            case "delete":
                showDeleteForm(req ,resp);
                break;
            case "searchContent":
                showSearchPage(req, resp);
                break;
            case "sort":
                showListSort(req,resp);
            default:
                showListPage(req, resp);
        }
    }

    private void showListPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("student/list.jsp");
        List<Student> students = managerStudent.findAll();
        req.setAttribute("list", students);
        requestDispatcher.forward(req, resp);

    }

    private void showListSort(HttpServletRequest req, HttpServletResponse resp) {
        String action = req.getParameter("action");
        if ("sort".equals(action)) {
            managerStudent.sortByID();
        }
        List<Student> sortedBlogs = managerStudent.findAll();
        req.setAttribute("sortedBlogs", sortedBlogs);
        req.getRequestDispatcher("blog/sort.jsp");

    }

    private void showSearchPage(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showDeleteForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        managerStudent.delete(id);
        resp.sendRedirect("/student");
    }

    private void showUpdateForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("student/update.jsp");
        int id = Integer.parseInt(req.getParameter("id"));
        Student student = managerStudent.findById(id);
        req.setAttribute("svCanSua",student);
        requestDispatcher.forward(req, resp);

    }

    private void showcCeateForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("student/create.jsp");
        List<Student> students = managerStudent.findAll();
        req.setAttribute("list", students);
        requestDispatcher.forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String action = req.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "create":
                createForm(req, resp);
                break;
            case "update":
                editForm(req, resp);
                break;
            case "delete":
                deleteForm(req, resp);
                break;

        }
    }

    private void deleteForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    }

    private void editForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String sexes = req.getParameter("sexes");
        String address = req.getParameter("address");
        double score = Double.parseDouble(req.getParameter("score"));
        managerStudent.update(id,new Student(id,name,age,sexes,address,score));
        resp.sendRedirect("/student");
    }

    private void createForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        String name= req.getParameter("name");
        int  age= Integer.parseInt(req.getParameter("age"));
        String sexes= req.getParameter("sexes");
        String address = req.getParameter("address");
        double score = Double.parseDouble(req.getParameter("score"));
        managerStudent.addStudent(new Student(id,name,age,sexes,address,score));
        resp.sendRedirect("/student");
    }

}
