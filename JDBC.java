import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sound.midi.SysexMessage;
class JDBC{
    public static void main(String args[]){
        try{
            //Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating a connection 

            String url="jdbc:mysql://localhost:3306/callcenter";
            String username="root";
            String password="senbonzakura!112";

            Connection con = DriverManager.getConnection(url,username,password);
            
            
            if(con.isClosed()){
                System.out.println("Connection is Closed");

            }
            else{
                System.out.println("Connection Created....");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}   