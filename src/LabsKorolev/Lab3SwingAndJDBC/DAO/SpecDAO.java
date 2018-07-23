package LabsKorolev.Lab3SwingAndJDBC.DAO;

import LabsKorolev.Lab3SwingAndJDBC.Entities.Spec;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SpecDAO extends AbstrDAO {

    public List<Spec> getAllSpec(Connection myConn) throws Exception {

        List<Spec> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from Spec");
            while (myRs.next()) {
                Spec tempSpec = convertRowToSpec(myRs);
                list.add(tempSpec);
            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }


    private Spec convertRowToSpec(ResultSet myRs) throws SQLException {

        int id = myRs.getInt("id");
        int idvus = myRs.getInt("idvus");
        String name = myRs.getString("name");
        String info = myRs.getString("INFO");

        Spec tempSpec = new Spec(id, idvus, name, info);

        return tempSpec;
    }

}
