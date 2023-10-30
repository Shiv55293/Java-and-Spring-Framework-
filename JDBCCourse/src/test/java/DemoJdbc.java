import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
          import package
          load and register
          create connection
          create statement
          execute statement
          process the result
          close
        */
        String url = "jdbc:postgresql://localhost:5432/practice";
        String uname = "postgres";
        String pass = "0000";
       // String sql = "SELECT* FROM EMPLOYEES;";
        //String sql = "INSERT INTO EMPLOYEES VALUES (7, 'MARK', 'WOOD', ARRAY['BigData, Spring']);" ;
        //String sql = "UPDATE EMPLOYEES SET FIRST_NAME = 'MARRY' WHERE EMPLOYEE_ID = 7;";
        String sql = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = 7;";
      // Class.forName("org.postgresql.Driver");   //load
       Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
       Statement st = con.createStatement();
      // ResultSet rs = st.executeQuery(sql);
//       rs.next();
//       String name = rs.getString("first_name");
//       System.out.println("Name of the employee is : " + name);

//   ****************** ACCESSEING DATA *******************************
//       while(rs.next())
//       {
//           System.out.print(rs.getInt(1)+ " , ");
//           System.out.print(rs.getString(2)+ " , ");
//           System.out.println(rs.getString(3));
//
//       }

       //***************CRUD**************************
//       boolean status = st.execute(sql);
//       System.out.println(status);
         st.execute(sql);

       con.close();
        System.out.println("Connection closed");

    }
}
