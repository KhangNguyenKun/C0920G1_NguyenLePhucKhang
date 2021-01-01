package Service;


import Model.Pattern;
import Repository.IPatternDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatternDAO implements IPatternDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/thiModule3";
    private String jdbcUsername = "root";
    private String jdbcPassword = "nguyen8702";

    private static final String INSERT_PATTERN_SQL = "INSERT INTO listPatterns3" + "(id," +
            "maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien)VALUE" +
            "(?,?,?,?,?,?,?);";
    //        String id, String maBenhAn, String maBenhNhan,
//                String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien
    private static final String SELECT_PATTERN_BY_ID = "select * from listPatterns3 where id = ?";
    private static final String SELECT_ALL_PATTERN = "select * from listPatterns3";
    private static final String DELETE_PATTERN_SQL = "delete from listPatterns3 where id = ?;";
    private static final String UPDATE_PATTERN_SQL = "update listPatterns3 set maBenhAn =?,maBenhNhan=?," +
            "tenBenhNhan=?,ngayNhapVien=?,ngayRaVien=?,lyDoNhapVien=? where id = ?";


    public PatternDAO() throws SQLException {
    };

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
    public void insertPattern(Pattern pattern) throws SQLException {
        System.out.println(INSERT_PATTERN_SQL);
//        String id, String maBenhAn, String maBenhNhan,
//                String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PATTERN_SQL)) {
            preparedStatement.setString(1, pattern.getId());
            preparedStatement.setString(2, pattern.getMaBenhAn());
            preparedStatement.setString(3, pattern.getMaBenhNhan());
            preparedStatement.setString(4, pattern.getTenBenhNhan());
            preparedStatement.setString(5, pattern.getNgayNhapVien());
            preparedStatement.setString(6, pattern.getNgayRaVien());
            preparedStatement.setString(7, pattern.getLyDoNhapVien());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pattern selectPattern(int idPattern) {
        Pattern pattern = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PATTERN_BY_ID);) {
            preparedStatement.setInt(1, idPattern);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
//            String id, String maBenhAn, String maBenhNhan,
//                    String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String id = rs.getString("id");
                String maBenhAn = rs.getString("maBenhAn");
                String maBenhNhan = rs.getString("maBenhNhan");
                String tenBenhNhan = rs.getString("tenBenhNhan");
                String ngayNhapVien = rs.getString("ngayNhapVien");
                String ngayRaVien = rs.getString("ngayRaVien");
                String lyDoNhapVien = rs.getString("lyDoNhapVien");
                pattern = new Pattern(id, maBenhAn, maBenhNhan,
                        tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pattern;
    }

    @Override
    public List<Pattern> selectAllPatterns() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Pattern> listPattern = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PATTERN);) {

            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            //        employee_id," +
//        "employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email," +
//                "employee_address, position_id, education_degree_id, division_id, user_name
            while (rs.next()) {
                String id = rs.getString("id");
                String maBenhAn = rs.getString("maBenhAn");
                String maBenhNhan = rs.getString("maBenhNhan");
                String tenBenhNhan = rs.getString("tenBenhNhan");
                String ngayNhapVien = rs.getString("ngayNhapVien");
                String ngayRaVien = rs.getString("ngayRaVien");
                String lyDoNhapVien = rs.getString("lyDoNhapVien");
                listPattern.add(new Pattern(id, maBenhAn, maBenhNhan,
                        tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien));
            }
            System.out.println(preparedStatement);
        } catch (SQLException e) {
        }
        return listPattern;
    }

    @Override
    public boolean deletePattern(int id) throws SQLException {
        boolean rowDeleted = true;
        try(Connection connection =getConnection();PreparedStatement preparedStatement= connection.prepareStatement(DELETE_PATTERN_SQL)) {
            preparedStatement.setInt(1,id);
            rowDeleted = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updatePattern(Pattern pattern) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PATTERN_SQL);) {

            preparedStatement.setString(1, pattern.getMaBenhAn());
            preparedStatement.setString(2, pattern.getMaBenhNhan());
            preparedStatement.setString(3, pattern.getTenBenhNhan());
            preparedStatement.setString(4, pattern.getNgayNhapVien());
            preparedStatement.setString(5, pattern.getNgayRaVien());
            preparedStatement.setString(6, pattern.getLyDoNhapVien());
            preparedStatement.setString(7, pattern.getId());
            System.out.println(preparedStatement);
            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
}

