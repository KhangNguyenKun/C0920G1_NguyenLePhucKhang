package Service;

import Model.Employee;
import Repository.IEmployeeDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy";
    private String jdbcUsername = "root";
    private String jdbcPassword = "nguyen8702";

    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee" + "(employee_id," +
            "employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email," +
            "employee_address, position_id, education_degree_id, division_id, user_name)VALUE" +
            "(?,?,?,?,?,?,?,?,?,?,?,? );";

    //        int id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee, String addressEmployee,
//                String mailEmployee, int positionId, String educationDegree, int divisionId, String userNameEmployee
    private static final String SELECT_EMPLOYEE_BY_ID = "select * from employee where employee_id = ?";
    private static final String SELECT_ALL_EMPLOYEE = "select * from employee";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where employee_id = ?;";
    private static final String UPDATE_EMPLOYEE_SQL = "update employee set  employee_name= ?, employee_birthday = ?,employee_id_card = ?,employee_salary = ?," +
            "employee_phone = ?,employee_email = ?," +
            "employee_address = ?, position_id = ?, education_degree_id = ?, division_id = ?, user_name = ? where employee_id = ?";


    public EmployeeDAO(){};

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertEmployee(Employee Employee) throws SQLException {
//        String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,
//                String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee
        System.out.println(INSERT_EMPLOYEE_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, Employee.getId());
            preparedStatement.setString(2, Employee.getNameEmployee());
            preparedStatement.setString(3, Employee.getBirthDay());
            preparedStatement.setString(4, Employee.getIdCard());
            preparedStatement.setString(5, Employee.getSalary());
            preparedStatement.setString(6, Employee.getPhoneEmployee());
            preparedStatement.setString(7, Employee.getMailEmployee());
            preparedStatement.setString(8, Employee.getAddressEmployee());
            preparedStatement.setString(9, Employee.getPositionId());
            preparedStatement.setString(10, Employee.getEducationDegree());
            preparedStatement.setString(11, Employee.getDivisionId());
            preparedStatement.setString(12, Employee.getUserNameEmployee());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee selectEmployee(int id) {


//        employee_id," +
//        "employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email," +
//                "employee_address, position_id, education_degree_id, division_id, user_name
        Employee employee = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String idCustomer = rs.getString("employee_id");
                String nameEmployee = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthday");
                String idCard = rs.getString("employee_id_card");
                String salary = rs.getString("employee_salary");
                String phoneEmployee = rs.getString("employee_phone");
                String mailEmployee = rs.getString("employee_email");
                String addressEmployee = rs.getString("employee_address");
                String positionId = rs.getString("position_id");
                String educationDegree = rs.getString("education_degree_id");
                String divisionId = rs.getString("division_id");
                String userNameEmployee = rs.getString("user_name");
                employee = new Employee(idCustomer, nameEmployee,  birthday, idCard,salary, phoneEmployee, addressEmployee,
                        mailEmployee,positionId, educationDegree,divisionId, userNameEmployee);
            }
        } catch (SQLException e) {

        }
        return employee;
    }

    @Override
    public List<Employee> selectAllEmployees() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Employee> listEmployee = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);) {

            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            //        employee_id," +
//        "employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email," +
//                "employee_address, position_id, education_degree_id, division_id, user_name
            while (rs.next()) {
                String idCustomer = rs.getString("employee_id");
                String nameEmployee = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthday");
                String idCard = rs.getString("employee_id_card");
                String salary = rs.getString("employee_salary");
                String phoneEmployee = rs.getString("employee_phone");
                String mailEmployee = rs.getString("employee_email");
                String addressEmployee = rs.getString("employee_address");
                String positionId = rs.getString("position_id");
                String educationDegree = rs.getString("education_degree_id");
                String divisionId = rs.getString("division_id");
                String userNameEmployee = rs.getString("user_name");

                listEmployee.add(new Employee( idCustomer, nameEmployee,  birthday, idCard,salary, phoneEmployee, addressEmployee,
                        mailEmployee,positionId, educationDegree,divisionId, userNameEmployee));
            }
            System.out.println(preparedStatement);
        } catch (SQLException e) {
        }
        return listEmployee;
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        boolean rowDeleted = true;
        try(Connection connection =getConnection();PreparedStatement preparedStatement= connection.prepareStatement(DELETE_EMPLOYEE_SQL)) {
            preparedStatement.setInt(1,id);
            rowDeleted = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);) {
            preparedStatement.setString(1, employee.getNameEmployee());
            preparedStatement.setString(2, employee.getBirthDay());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setString(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhoneEmployee());
            preparedStatement.setString(6, employee.getMailEmployee());
            preparedStatement.setString(7, employee.getAddressEmployee());
            preparedStatement.setString(8, employee.getPositionId());
            preparedStatement.setString(9, employee.getEducationDegree());
            preparedStatement.setString(10, employee.getDivisionId());
            preparedStatement.setString(11, employee.getUserNameEmployee());
            preparedStatement.setString(12, employee.getId());
            System.out.println(preparedStatement);
            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
}
