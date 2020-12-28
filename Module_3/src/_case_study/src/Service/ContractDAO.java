package Service;

import Model.Contract;
import Repository.IContractDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractDAO implements IContractDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy";
    private String jdbcUsername = "root";
    private String jdbcPassword = "nguyen8702";

    private static final String INSERT_CONTRACT_SQL = "INSERT INTO contract" + " (contract_id,contract_start_date," +
            "contract_end_date,contract_deposit,contract_total_money,employee_id,customer_id,service_id)VALUE" +
            "(?,?,?,?,?,?,?,?);";
    //    String contract_id, String contract_start_date, String contract_end_date,
//    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id
    private static final String SELECT_CONTRACT_BY_ID = "select * from contract where contract_id = ?";
    private static final String SELECT_ALL_CONTRACT = "select * from contract";
    private static final String DELETE_CONTRACT_SQL = "delete from contract where contract_id = ?;";
    private static final String UPDATE_CONTRACT_SQL = "update contract set  contract_id=?,contract_start_date=?," +
            "contract_end_date =?,contract_deposit =?,contract_total_money =?,employee_id =?,customer_id =?,service_id= ? where customer_id = ?";
    private static final String SEARCH_CONTRACT_SQL = "select * from contract where name like ?";

    public ContractDAO() {
    }

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
    public void insertContract(Contract contract) throws SQLException {
        System.out.println(INSERT_CONTRACT_SQL);
        // try-with-resource statement will auto close the connection.
        //    String contract_id, String contract_start_date, String contract_end_date,
//    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT_SQL)) {
            preparedStatement.setString(1, contract.getContract_id());
            preparedStatement.setString(2, contract.getContract_start_date());
            preparedStatement.setString(3, contract.getContract_end_date());
            preparedStatement.setString(4, contract.getContract_deposit());
            preparedStatement.setString(5, contract.getContract_total_money());
            preparedStatement.setString(6, contract.getEmployee_id());
            preparedStatement.setString(7, contract.getCustomer_id());
            preparedStatement.setString(8, contract.getService_id());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Contract selectContract(int id) {
        Contract contract = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                //    String contract_id, String contract_start_date, String contract_end_date,
//    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id
                String contract_id = rs.getString("contract_id");
                String contract_start_date = rs.getString("contract_start_date");
                String contract_end_date = rs.getString("contract_end_date");
                String contract_deposit = rs.getString("contract_deposit");
                String contract_total_money = rs.getString("contract_total_money");
                String employee_id = rs.getString("employee_id");
                String customer_id = rs.getString("customer_id");
                String service_id = rs.getString("service_id");
                contract = new Contract(contract_id, contract_start_date, contract_end_date,
                        contract_deposit, contract_total_money, employee_id, customer_id, service_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    @Override
    public List<Contract> selectAllContracts() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Contract> listContract = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String contract_id = rs.getString("contract_id");
                String contract_start_date = rs.getString("contract_start_date");
                String contract_end_date = rs.getString("contract_end_date");
                String contract_deposit = rs.getString("contract_deposit");
                String contract_total_money = rs.getString("contract_total_money");
                String employee_id = rs.getString("employee_id");
                String customer_id = rs.getString("customer_id");
                String service_id = rs.getString("service_id");
                listContract.add(new Contract(contract_id, contract_start_date, contract_end_date,
                        contract_deposit, contract_total_money, employee_id, customer_id, service_id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listContract;
    }

    @Override
    public boolean deleteContract(int id) throws SQLException {
        boolean rowDeleted = true;
        try(Connection connection =getConnection();PreparedStatement preparedStatement= connection.prepareStatement(DELETE_CONTRACT_SQL)) {
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateContract(Contract contract) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CONTRACT_SQL);) {
            preparedStatement.setString(1, contract.getContract_id());
            preparedStatement.setString(2, contract.getContract_start_date());
            preparedStatement.setString(3, contract.getContract_end_date());
            preparedStatement.setString(4, contract.getContract_deposit());
            preparedStatement.setString(5, contract.getContract_total_money());
            preparedStatement.setString(6, contract.getEmployee_id());
            preparedStatement.setString(7, contract.getCustomer_id());
            preparedStatement.setString(8, contract.getService_id());
            System.out.println(preparedStatement);
            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
}
