package Service;

import Model.Service;
import Repository.IServiceDAO;

import java.sql.SQLException;
import java.util.List;

public class ServiceDAO implements IServiceDAO {
    @Override
    public void insertService(Service service) throws SQLException {

    }

    @Override
    public Service selectService(int id) {
        return null;
    }

    @Override
    public List<Service> selectAllServices() {
        return null;
    }

    @Override
    public boolean deleteService(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateService(Service service) throws SQLException {
        return false;
    }
}
