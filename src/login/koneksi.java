package login;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ihsan
 */
public class koneksi {
    private static Connection con;
    public static Connection getkoneksi() {
        if (con == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
                System.out.println("Berhasil");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return con;
    }
    public static class con {
        public con() {
        }
    }
}