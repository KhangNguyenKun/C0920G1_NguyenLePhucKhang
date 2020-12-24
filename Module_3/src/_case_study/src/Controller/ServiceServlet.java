package Controller;

import Model.Employee;
import Model.Service;
import Service.CustomerDAO;
import Service.ServiceDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServiceServlet", urlPatterns = "/services")
public class ServiceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ServiceDAO serviceDAO;

    public void init() {
        serviceDAO = new ServiceDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertService(request, response);
                break;
            case "edit":
                try {
                    updateService(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;

        }
    }

    private void updateService(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//        String service_id, String service_name, String service_area, String service_cost, String service_max_people, String rent_type_id,
//                String service_type_id, String standard_room, String description_other_convenience, String pool_area, String number_of_floors
        String service_id = request.getParameter("service_id");
        String service_name = request.getParameter("service_name");
        String service_area = request.getParameter("service_area");
        String service_cost = request.getParameter("service_cost");
        String service_max_people = request.getParameter("service_max_people");
        String rent_type_id = request.getParameter("rent_type_id");
        String service_type_id = request.getParameter("service_type_id");
        String standard_room = request.getParameter("standard_room");
        String description_other_convenience = request.getParameter("description_other_convenience");
        String pool_area = request.getParameter("pool_area");
        String number_of_floors = request.getParameter("number_of_floors");
        Service newService = new Service( service_id,  service_name,  service_area,  service_cost,  service_max_people,  rent_type_id,
               service_type_id,  standard_room,  description_other_convenience,  pool_area,  number_of_floors);
        serviceDAO.updateService(newService);
        response.sendRedirect("/services");
    }
    private void insertService(HttpServletRequest request, HttpServletResponse response) {
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
                deleteService(request, response);

                break;
            case "search":
                searchForm(request, response);

                break;
            default:
                listService(request, response);
                break;
        }
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
    }
    private void deleteService(HttpServletRequest request, HttpServletResponse response) {
    }
}