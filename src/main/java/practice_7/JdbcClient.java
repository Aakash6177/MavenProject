package practice_7;

import java.sql.*;

public class JdbcClient {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("jdbc:postgresql://dpg-chnp60ik728jv5cg9cs0-a.oregon-postgres.render.com/akly_db", "dbuser", "hwmeCYShoFiWJ8cYFxTxkNyQ4yHAUX8W");
            st = conn.createStatement();
            rs = st.executeQuery("select empno, firstName, lastName, salary, email from emp");

            while(rs.next()){
                int empno = rs.getInt("empno");
                String fname = rs.getString("firstName");
                String lname = rs.getString("lastName");
                double salary = rs.getDouble("salary");
                String email = rs.getString("email");

                // printing the data from the database
                System.out.println("Employee No. " + empno);
                System.out.println("First Name " + fname);
                System.out.println("Last Name "+ lname );
                System.out.println("Salaray "+salary);
                System.out.println("Emai: "+email);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();

                }
                if(conn != null){
                    conn.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}
