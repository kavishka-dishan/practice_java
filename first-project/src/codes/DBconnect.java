package codes;


import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;





public class DBconnect {
    
    public static Connection conn(){
        
        Connection conn =null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        
        return conn;
        
    }
    
}
