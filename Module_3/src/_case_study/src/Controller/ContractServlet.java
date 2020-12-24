package Controller;

import Model.Contract;
import Model.Customer;
import Service.ContractDAO;
import Service.CustomerDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ContractDAO contractDAO;

    public void init() {
        contractDAO = new ContractDAO();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                try {
                    insertContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":

                try {
                    updateContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;

        }
    }

    private void updateContract(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//        String contract_id, String contract_start_date, String contract_end_date,
//                String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id
        String contract_id = request.getParameter("contract_id");
        String contract_start_date = request.getParameter("contract_start_date");
        String contract_end_date = request.getParameter("contract_end_date");
        String contract_deposit = request.getParameter("contract_deposit");
        String contract_total_money = request.getParameter("contract_total_money");
        String employee_id = request.getParameter("employee_id");
        String customer_id = request.getParameter("customer_id");
        String service_id = request.getParameter("service_id");
        Contract contract = new Contract(contract_id,  contract_start_date,  contract_end_date,
                 contract_deposit,  contract_total_money,  employee_id,  customer_id,  service_id);
        contractDAO.updateContract(contract);
        response.sendRedirect("/contract");
    }

    private void insertContract(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String contract_id = request.getParameter("contract_id");
        String contract_start_date = request.getParameter("contract_start_date");
        String contract_end_date = request.getParameter("contract_end_date");
        String contract_deposit = request.getParameter("contract_deposit");
        String contract_total_money = request.getParameter("contract_total_money");
        String employee_id = request.getParameter("employee_id");
        String customer_id = request.getParameter("customer_id");
        String service_id = request.getParameter("service_id");
        Contract contract = new Contract(contract_id,  contract_start_date,  contract_end_date,
                contract_deposit,  contract_total_money,  employee_id,  customer_id,  service_id);
        contractDAO.insertContract(contract);
        List<Contract> listContract = contractDAO.selectAllContracts();
        request.setAttribute("listContract", listContract);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/view.jsp");
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
                    deleteContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;
            case "search":

                    searchForm(request, response);

                break;
            default:
                listContract(request, response);
                break;
        }
    }

    private void listContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contract> listContract = contractDAO.selectAllContracts();
        request.setAttribute("listContract", listContract);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/view.jsp");
        dispatcher.forward(request, response);
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void deleteContract(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        contractDAO.deleteContract(id);
        List<Contract> listContract = contractDAO.selectAllContracts();
        request.setAttribute("listContract", listContract );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Contract contract = contractDAO.selectContract(id);

        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/edit.jsp");
        request.setAttribute("contract", contract);
        dispatcher.forward(request, response);
    }
    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/create.jsp");
        dispatcher.forward(request, response);
    }

}
