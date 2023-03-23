package Electricity;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "aman");
            s = c.createStatement();
            ResultSet rs = s.executeQuery(
                    "select * from tax");

            while (rs.next()) {
                System.out.println(rs.getInt(1));
                rs.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
