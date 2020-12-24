package Repository;

import Model.Contract;
import Model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceDAO {
    public void insertService (Service service) throws SQLException;

    public Service selectService(int id);

    public List<Service> selectAllServices();

    public boolean deleteService(int id) throws SQLException;

    public boolean updateService(Service service) throws SQLException;
}
