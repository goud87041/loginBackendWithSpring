package com.login.jdbcConnectivity.servlet;
import java.util.Properties;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

public void init(){
    try{
        Properties dbProperties = new Properties();

        InputStrim inputStrim = getClass()
             .getClassLoader()
             .getResourcesAsStream("application.properties")
        dbProperties.load(inputStrim);

        dbUrl = dbProperties.getProperty("spring.datasource.url")
        dbUserName = dbProperties.getProperty("spring.datasource.username")
        dbPassword = dbProperties.getProperty("spring.datasource.password")

        Properties queryProperties = new Properties();

        InputStrim inputQuery = getClass()
            .getClassLoader()
            .getResourcesAsStream("");

        queryProperties.load(inputQuery);

        validateQuery = queryProperties.getProperty("validation.query");
        insertQuery = queryProperties.getProperty("insert.query")
        deleteQuery = queryProperties.getProperty("delete.query")


    }catch(Exception e){
        throw new   RuntimeException("could not load configuure ", e);
    }
}

@Override
public vodi doPost(

)

}
