package datalayer;

import java.sql.*;

public class DB_user {

    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL= "jdbc:mysql://localhost/webapp";

    //Database credentials
    static final String USER = "webappuser";
    static final String PASS = "bideke123456";

    public boolean isValidUserLogin(String email,String password){
        boolean isValidUser = false;

        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        try{
            //Step 2 : Register JDBC Driver
            Class.forName(JDBC_DRIVER);

            //Step 3 : Open connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //Step4 : Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            sql = "SELECT * FROM user WHERE user_email = \""+
                    email + "\" AND user_password = \"" + password + "\"";

            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //Step 5 : Extract data from result set

            if (rs.next()){
                isValidUser = true;
            }

            //Step 6 : Close
            rs.close();
            stmt.close();
            conn.close();

        }catch (SQLException se){
            //errors for JDBC
            se.printStackTrace();
        }catch (Exception e){
            //errors for Class.forName
            e.printStackTrace();
        }finally {
            // close resources
            try{
                if(stmt != null)
                    stmt.close();
            }catch (SQLException se2){
            }

            try{
                if(conn != null)
                    conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Closing DB connection ---Bye");


        return isValidUser;
    }

    public String getRecords(String id){

        Connection conn = null;
        Statement stmt = null;
        String sql = "";
        String result = "";

        try{
            //Step 2 : Register JDBC Driver
            Class.forName(JDBC_DRIVER);

            //Step 3 : Open connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //Step4 : Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            sql = "SELECT * FROM health_criminal WHERE user_identification = \""+
                    id + "\"";

            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //Step 5 : Extract data from result set


            String health = "";
            String criminal = "";
            if (rs.next()){
                health = rs.getString("user_health_record");
                criminal = rs.getString("user_criminal_record");
            }

            result = health + "," +criminal;

            //Step 6 : Close
            rs.close();
            stmt.close();
            conn.close();

        }catch (SQLException se){
            //errors for JDBC
            se.printStackTrace();
        }catch (Exception e){
            //errors for Class.forName
            e.printStackTrace();
        }finally {
            // close resources
            try{
                if(stmt != null)
                    stmt.close();
            }catch (SQLException se2){
            }

            try{
                if(conn != null)
                    conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Closing DB connection ---Bye");

        System.out.println(result);
        return result;
    }
}
