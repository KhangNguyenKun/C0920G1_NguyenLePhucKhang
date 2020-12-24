package Service;

import Model.Customer;
import Repository.ICustomerDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

;


public class CustomerDAO implements ICustomerDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy";
    private String jdbcUsername = "root";
    private String jdbcPassword = "nguyen8702";

    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer" + " (customer_id,customer_type_id," +
            "customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email," +
            "customer_address)VALUE" +
            "(?,?,?,?,?,?,?,?,?);";
    //    private static final String SELECT_CUSTOMER_BY_ID = "select customer_id,customer_type_id,customer_name," +
//            "customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address = ?";
    private static final String SELECT_CUSTOMER_BY_ID = "select * from customer where customer_id = ?";
    private static final String SELECT_ALL_CUSTOMER = "select * from customer";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where customer_id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update customer set  customer_type_id = ?, customer_name= ?, customer_birthday = ?," +
            "customer_gender = ?,customer_id_card = ?, customer_phone = ?,customer_email= ?,customer_address = ? where customer_id = ?";
private  static final String SEARCH_CUSTOMER_SQL = "select * from customer where name like ?";

    public CustomerDAO(){};

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        //        int id, int type_id, String nameCustomer, String birthDay,
//                String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer

        System.out.println(INSERT_CUSTOMER_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            preparedStatement.setString(1, customer.getId());
            preparedStatement.setString(2, customer.getType_id());
            preparedStatement.setString(3, customer.getNameCustomer());
            preparedStatement.setString(4, customer.getBirthday());
            preparedStatement.setString(5, customer.getGenderCustomer());
            preparedStatement.setString(6, customer.getId_card());
            preparedStatement.setString(7, customer.getPhoneCustomer());
            preparedStatement.setString(8, customer.getEmailCustomer());
            preparedStatement.setString(9, customer.getAddressCustomer());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
@Override
    public Customer selectCustomer(int id) {
        //        int id, int type_id, String nameCustomer, String birthDay,
//                String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer
        Customer customer = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                //    private static final String SELECT_CUSTOMER_BY_ID = "select customer_id,customer_type_id,customer_name," +
//            "customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address = ?";
                String idCustomer = rs.getString("customer_id");
                String type_id = rs.getString("customer_type_id");
                String nameCustomer = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                String genderCustomer = rs.getString("customer_gender");
                String id_card = rs.getString("customer_id_card");
                String phoneCustomer = rs.getString("customer_phone");
                String emailCustomer = rs.getString("customer_email");
                String addressCustomer = rs.getString("customer_address");
                customer = new Customer(idCustomer, type_id, nameCustomer, birthday, genderCustomer, id_card,phoneCustomer, emailCustomer, addressCustomer
                       );
            }
        } catch (SQLException e) {
        }
        return customer;
    }

    @Override
    public List<Customer> selectAllCustomers() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Customer> customerList = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String idCustomer = rs.getString("customer_id");
                String type_id = rs.getString("customer_type_id");
                String nameCustomer = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                String genderCustomer = rs.getString("customer_gender");
                String id_card = rs.getString("customer_id_card");
                String phoneCustomer = rs.getString("customer_phone");
                String emailCustomer = rs.getString("customer_email");
                String addressCustomer = rs.getString("customer_address");



                customerList.add(new Customer(idCustomer, type_id, nameCustomer, birthday, genderCustomer, id_card,phoneCustomer, emailCustomer, addressCustomer));
            }
        } catch (SQLException e) {

        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
            boolean rowDeleted = true;
        try(Connection connection =getConnection();PreparedStatement preparedStatement= connection.prepareStatement(DELETE_CUSTOMER_SQL)) {
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);) {

            preparedStatement.setString(1, customer.getType_id());
            preparedStatement.setString(2, customer.getNameCustomer());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGenderCustomer());
            preparedStatement.setString(5, customer.getId_card());
            preparedStatement.setString(6, customer.getPhoneCustomer());
            preparedStatement.setString(7, customer.getEmailCustomer());
            preparedStatement.setString(8, customer.getAddressCustomer());
            preparedStatement.setString(9, customer.getId());
            System.out.println(preparedStatement);
            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    public List<Customer> searchName(String nameCustomer) throws SQLException {
        Customer customer;
        List<Customer> listCustomer = new ArrayList<>();
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement(SEARCH_CUSTOMER_SQL);){
            preparedStatement.setString(1,"%"+nameCustomer+"%");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String idCustomer = rs.getString("customer_id");
                String type_id = rs.getString("customer_type_id");
                String nameCustomer_after = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                String genderCustomer = rs.getString("customer_gender");
                String id_card = rs.getString("customer_id_card");
                String phoneCustomer = rs.getString("customer_phone");
                String emailCustomer = rs.getString("customer_email");
                String addressCustomer = rs.getString("customer_address");
                customer = new Customer(idCustomer, type_id, nameCustomer_after, birthday, genderCustomer, id_card,phoneCustomer, emailCustomer, addressCustomer);
                listCustomer.add(customer);
            }
        }
        return listCustomer;
    }
}
