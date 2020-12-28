package Customer.controller;

import Common.*;
import Customer.model.Customer;
import Customer.model.CustomerType;
import Customer.repository.CustomerTypeRepository;
import Customer.repository.CustomerTypeRepositoryImpl;
import Customer.service.CustomerDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerDAO customerDAO;
    Validate validate = new Validate();
    public void init() {
        customerDAO = new CustomerDAO();
    }
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    insertCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    updateCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

        }
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
                    deleteCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            break;
            case "search":
                try {
                    searchForm(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerDAO.deleteCustomer(id);
        List<Customer> listCustomer = customerDAO.selectAllCustomers();
        request.setAttribute("listCustomer", listCustomer );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/view.jsp");
        requestDispatcher.forward(request, response);

    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {

        String type_id = request.getParameter("type_id");
        String nameCustomer = request.getParameter("nameCustomer");
        String birthday = request.getParameter("birthday");
        String genderCustomer = request.getParameter("genderCustomer");
        String id_card = request.getParameter("id_card");
        String phoneCustomer = request.getParameter("phoneCustomer");
        String emailCustomer = request.getParameter("emailCustomer");
        String addressCustomer = request.getParameter("addressCustomer");
        String idCustomer = request.getParameter("id");
        Customer customer = new Customer(idCustomer, type_id, nameCustomer, birthday,genderCustomer,id_card,phoneCustomer, emailCustomer, addressCustomer);
        customerDAO.updateCustomer(customer);
        response.sendRedirect("/customers");
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
//        idCustomer, type_id, nameCustomer, birthday, genderCustomer, id_card,phoneCustomer, emailCustomer, addressCustomer
        boolean check = true;
        String messageId = null;
        String messageIdCard = null;
        String messagePhone= null;
        String messageBirthDay = null;
        String messageEmail = null;
        String birthDay = null;
        String phone = null;
        String email = null;
        String customerId = null;
        String idCard = null;

        try {
            customerId = request.getParameter("customerId");
            validate.regexIdCustomer(customerId);
        } catch (ValidateException e) {
            messageId = e.getMessage();
            check = false;
        }

        String typeId = request.getParameter("typeId");
        String name = request.getParameter("name");
        try {
            birthDay = request.getParameter("birthday");
            validate.regexDate(birthDay);
        } catch (BirthdayException e) {
            messageBirthDay = e.getMessage();
            check = false;
        }

        String gender = request.getParameter("gender");

        try {
            idCard = request.getParameter("idCard");
            validate.regexIdCard(idCard);
        }catch (ValidateException e){
            messageIdCard = e.getMessage();
            check = false;
        }

        try {
            phone = request.getParameter("phone");
            validate.regexPhone(phone);
        } catch (PhoneException e) {
            messagePhone = e.getMessage();
            check = false;
        }
        try {
            email = request.getParameter("email");
            validate.regexEmail(email);
        } catch (EmailException e) {
            messageEmail = e.getMessage();
            check = false;
        }
        String address = request.getParameter("address");

        if (!check){
            request.setAttribute("customerId", customerId);
            request.setAttribute("typeId", typeId);
            request.setAttribute("name", name);
            request.setAttribute("birthday",birthDay);
            request.setAttribute("gender",gender);
            request.setAttribute("idCard",idCard);
            request.setAttribute("phone",phone);
            request.setAttribute("email",email);
            request.setAttribute("address",address);


            request.setAttribute("messageId",messageId);
            request.setAttribute("messageIdCard",messageIdCard);
            request.setAttribute("messageBirthDay",messageBirthDay);
            request.setAttribute("messagePhone",messagePhone);
            request.setAttribute("messageEmail",messageEmail);

            showCreateCustomer(request,response);
        }else {
            customerDAO.insertCustomer(new Customer(customerId,typeId,name,birthDay,gender,idCard,phone,email,address));
//            request.setAttribute("messageConfig","đã thêm thành công");
//        response.sendRedirect("/customers");
            listCustomer(request,response);
        }
//        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
//        dispatcher.forward(request, response);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = customerDAO.selectAllCustomers();
        request.setAttribute("listCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        dispatcher.forward(request, response);
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("nameCustomer");
//        String country = request.getParameter("country");
//        int id = Integer.parseInt(request.getParameter("id"));
        List<Customer> listCustomer = new CustomerDAO().searchName(name);
        request.setAttribute("listCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerDAO.selectCustomer(id);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        request.setAttribute("customer", customer);
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        dispatcher.forward(request, response);
    }
    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<CustomerType> customerTypeList = customerTypeRepository.getAllCustomerType();
//        request.setAttribute("customerTypeList",customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        dispatcher.forward(request,response);
    }

}