package datalayer;

import java.sql.*;

public class DB_insert_user {


        //JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL= "jdbc:mysql://localhost/webapp";

        //Database credentials
        static final String USER = "webappuser";
        static final String PASS = "bideke123456";

        public void createUser(String email,String password,String dob,String nationality,String id,String gender
        ,String allergy,String food,String qualification,String exp,String occupation,String skill,String language,String name){

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

                sql = "INSERT INTO user(`user_email`, `user_password`, `user_dob`, `user_nationality`, " +
                        "`user_identification`, `user_gender`, `user_allergy`, `user_food`, `user_qualification`, `user_work_exp`, " +
                        "`user_occupation`, `user_skill`, `user_language`, `user_name`) " +
                        "VALUES ('"+email+"', '"+password+"', '"+dob+"', '"+nationality+"', '"+id+"', '"+gender+"', '"+allergy+"', " +
                        "'"+food+"', '"+qualification+"', '"+exp+"', '"+occupation+"', '"+skill+"', '"+language+"', " +
                        "'"+name+"');";

                System.out.println(sql);

                stmt.executeUpdate(sql);

                stmt.close();
                conn.close();

            }catch (SQLException se){
                //errors for JDBC
                se.printStackTrace();
            }catch (Exception e){
                //errors for Class.forName
                e.printStackTrace();
                System.out.println("HAHAHAHA");
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


        }
    }


