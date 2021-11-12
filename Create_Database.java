import java.sql.*;
public class Create_Database
{
  public static void main(String[] args)
  {
    Connection con;
    Statement st;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
      st=con.createStatement();
      st.execute("create database db5");
      System.out.println("Database created successfully...");
      System.out.println(st.execute("show databases"));
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
