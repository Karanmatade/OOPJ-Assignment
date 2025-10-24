import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Empdata1
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_info","root","");
        PreparedStatement stmt = con.prepareStatement("insert into employee values(?, ?, ?)");
        stmt.setInt(1, 101);
        stmt.setString(2, "Sahil");
        stmt.setInt(3, 50000);
        int i = stmt.executeUpdate();
        if(i==1)
        System.out.println(i + " records inserted");
        con.close();    
    }
    
}
