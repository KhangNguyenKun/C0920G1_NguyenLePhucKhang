package Controller;

import Model.Customer;
import Model.Employee;
import Service.CustomerDAO;
import Service.EmployeeDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet" ,urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDAO employeeDAO;

    public void init() {
        employeeDAO = new EmployeeDAO();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    insertEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":


            case "edit":
                try {
                    updateEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String id = request.getParameter("id");
        String nameEmployee = request.getParameter("nameEmployee");
        String birthDay = request.getParameter("birthDay");
        String idCard = request.getParameter("idCard");
        String salary = request.getParameter("salary");
        String phoneEmployee = request.getParameter("phoneEmployee");
        String addressEmployee = request.getParameter("addressEmployee");
        String mailEmployee = request.getParameter("mailEmployee");
        String positionId = request.getParameter("positionId");
        String educationDegree = request.getParameter("educationDegree");
        String divisionId = request.getParameter("divisionId");
        String userNameEmployee = request.getParameter("userNameEmployee");
        Employee newEmployee = new Employee( id,  nameEmployee, birthDay,  idCard,  salary,  phoneEmployee,  addressEmployee,
                mailEmployee,  positionId,  educationDegree,  divisionId,  userNameEmployee);
        employeeDAO.updateEmployee(newEmployee);
        response.sendRedirect("/employees");
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeDAO.deleteEmployee(id);
        List<Employee> listEmployee = employeeDAO.selectAllEmployees();
        request.setAttribute("listEmployee", listEmployee );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        //        int id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee, String addressEmployee,
           //     String mailEmployee, int positionId, String educationDegree, int divisionId, String userNameEmployee
        String id = request.getParameter("id");
        String nameEmployee = request.getParameter("nameEmployee");
        String birthDay = request.getParameter("birthDay");
        String idCard = request.getParameter("idCard");
        String salary = request.getParameter("salary");
        String phoneEmployee = request.getParameter("phoneEmployee");
        String addressEmployee = request.getParameter("addressEmployee");
        String mailEmployee = request.getParameter("mailEmployee");
        String positionId = request.getParameter("positionId");
        String educationDegree = request.getParameter("educationDegree");
        String divisionId = request.getParameter("divisionId");
        String userNameEmployee = request.getParameter("userNameEmployee");
        Employee newEmployee = new Employee( id,  nameEmployee, birthDay,  idCard,  salary,  phoneEmployee,  addressEmployee,
                 mailEmployee,  positionId,  educationDegree,  divisionId,  userNameEmployee);
        employeeDAO.insertEmployee(newEmployee);
        List<Employee> listEmployee = employeeDAO.selectAllEmployees();
        request.setAttribute("listEmployee", listEmployee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                try {
                    deleteEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                searchForm(request, response);
                break;
            default:
                listEmployee(request, response);
                break;
        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> listEmployee = employeeDAO.selectAllEmployees();
        request.setAttribute("listEmployee", listEmployee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/view.jsp");
        dispatcher.forward(request, response);
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeDAO.selectEmployee(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/edit.jsp");
        request.setAttribute("employee", employee);
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
