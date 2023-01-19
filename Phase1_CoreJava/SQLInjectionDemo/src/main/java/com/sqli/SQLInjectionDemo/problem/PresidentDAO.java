package com.sqli.SQLInjectionDemo.problem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PresidentDAO {

    public List<President> getByLastName(String lastName){
        Connection connection = DatabaseUtil.getConnection();
        String sql = String.format("select PRESIDENT_ID, FIRST_NAME, MIDDLE_INITIAL, LAST_NAME, EMAIL_ADDRESS from PRESIDENT where LAST_NAME = '%s'", lastName);
        List<President> resultList= new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                resultList.add(processResultSet(resultSet));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return resultList;
    }


    private President processResultSet(ResultSet resultSet) throws SQLException{
        Long id = resultSet.getLong("PRESIDENT_ID");
        String firstName = resultSet.getString("FIRST_NAME");
        String middleInitial = resultSet.getString("MIDDLE_INITIAL");
        String lastName = resultSet.getString("LAST_NAME");
        String emailAddress = resultSet.getString("EMAIL_ADDRESS");
        return new President(id, firstName, middleInitial, lastName, emailAddress);
    }


}
