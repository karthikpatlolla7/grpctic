import java.sql.*;
//this are comments
public class Jdbc {
    public static void main(String args[]) throws Exception
    {
        try {


            String url = "jdbc:mysql://localhost:3306/example";
            String user = "root";
            String pass = "root1101";
            String query = "select * from student";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String ans = rs.getInt(1) +" "+ rs.getString(2);
                System.out.println(ans);
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }

}
