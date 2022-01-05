import java.sql.*;


public class InsertJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating a connection 

            String url="jdbc:mysql://localhost:3306/callcenter";
            String username="root";
            String password="senbonzakura!112";

            Connection con = DriverManager.getConnection(url,username,password);

            //creating a query

            String q = "create table table1(tId int(20) primary key auto_increment , From_number varchar(10) not null , Start_time datetime , End_time datetime , Duration int(20))";


            // Create a statement 
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("table created in database");

            con.close();

            


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
