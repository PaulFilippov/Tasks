package labsKorolev.Lab3SwingAndJDBC.DAO;

import labsKorolev.Lab3SwingAndJDBC.Entities.Vus;

import java.util.*;
import java.sql.*;

public class VusDAO extends AbstrDAO {


    public List<Vus> getAllVus(Connection myConn) throws Exception {

        List<Vus> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from Vus");
            while (myRs.next()) {
                Vus tempVus = convertRowToVus(myRs);
                list.add(tempVus);
            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }

    private Vus convertRowToVus(ResultSet myRs) throws SQLException {

        int id = myRs.getInt("id");
        String name = myRs.getString("name");
        String adress = myRs.getString("adress");

        Vus tempVus = new Vus(id, name, adress);

        return tempVus;
    }


}
