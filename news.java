package sample;
import java.sql.*;


public class news {



     public boolean mutationList() {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String password = "Sveners3j5321!";
        String select = "SELECT * FROM cdb.mutation";

        try (Connection con = DriverManager.getConnection(url, null, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(select)) {

            while (rs.next()) {

                String type = rs.getString("type");
                String registerDate = rs.getString("registerDate");

                System.out.println("type:" + type
                        +"registerDate:" + registerDate);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }


}
