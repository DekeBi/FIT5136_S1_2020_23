package appLayer;

import datalayer.DB_user;

public class User {

    public boolean isValidUserCredentials(String username,String userPassword )
    {

        DB_user db_user = new DB_user();


        return db_user.isValidUserLogin(username,userPassword);
    }

}
