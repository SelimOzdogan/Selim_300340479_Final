package Final;

import java.sql.SQLException;
import java.util.List;

public interface SavingInterface {
    public void add(Saving saving) throws ClassNotFoundException, SQLException;
    public Saving edit(Saving saving, String custno) throws SQLException, ClassNotFoundException;
    public void delete(String custno) throws SQLException;
    public List<Saving> display() throws ClassNotFoundException, SQLException;
}
