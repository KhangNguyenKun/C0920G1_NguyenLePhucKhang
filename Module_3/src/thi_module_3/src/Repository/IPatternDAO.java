package Repository;

import Model.Pattern;

import java.sql.SQLException;
import java.util.List;

public interface IPatternDAO {
    public void insertPattern (Pattern pattern) throws SQLException;

    public Pattern selectPattern(int id);

    public List<Pattern> selectAllPatterns();

    public boolean deletePattern(int id) throws SQLException;

    public boolean updatePattern(Pattern pattern) throws SQLException;
}
