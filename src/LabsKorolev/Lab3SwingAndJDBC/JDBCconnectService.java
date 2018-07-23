package LabsKorolev.Lab3SwingAndJDBC;

import java.sql.*;

public class JDBCconnectService {

    public Connection connection;

    public Connection connectToBase() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //регистрируем драйвер
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl",
                    "System", "1234"); //устанавливаем соединение с БД
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Нет коннекта к базе: " + ex);
        }
        return connection;
    }


}
