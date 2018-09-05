package labsKorolev.Lab3SwingAndJDBC.DAO;

import labsKorolev.Lab3SwingAndJDBC.Entities.Sotr;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SotrDAO extends AbstrDAO {

    //функция вывода списка всех сотрудников из базы
    public List<Sotr> getAllSotr(Connection myConn) throws Exception {

        //System.out.println("вызвана getallsotr");

        List<Sotr> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from Sotr");
            while (myRs.next()) {
                Sotr tempSotr = convertRowToSotr(myRs);
                list.add(tempSotr);
            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }

    //функция поиска сотрудника по его id
    public List<Sotr> searchSotrs(Connection myConn, int id) throws Exception {
        List<Sotr> list = new ArrayList<>();

        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.prepareStatement("select * from Sotr where id like ?");

            myStmt.setInt(1, id);

            myRs = myStmt.executeQuery();

            while (myRs.next()) {
                Sotr tempSotr = convertRowToSotr(myRs);
                list.add(tempSotr);
            }

            return list;
        } finally {
            close(myStmt, myRs);
        }
    }

    //функция конвертации строки результата запроса(объекта Statement myStmt) в объект-сущность Sotr
    private Sotr convertRowToSotr(ResultSet myRs) throws SQLException {

        int id = myRs.getInt("id");
        int idvus = myRs.getInt("idvus");
        String name = myRs.getString("name");
        String phone = myRs.getString("phone");

        Sotr tempSotr = new Sotr(id, idvus, name, phone);

        return tempSotr;
    }

}
