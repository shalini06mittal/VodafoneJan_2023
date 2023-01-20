package com.sqli.logs.solution;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PresidentDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(PresidentDAO.class);

    public List<President> getByLastName(String lastName){
        LOGGER.debug("Starting");
        Connection connection = DatabaseUtil.getConnection();
        String sql = "select PRESIDENT_ID, FIRST_NAME, MIDDLE_INITIAL, LAST_NAME, EMAIL_ADDRESS from PRESIDENT where LAST_NAME = ?";
        LOGGER.debug("Query string: {}", sql);
        List<President> resultList= new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lastName);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                resultList.add(processResultSet(resultSet));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException sqle) {
            LOGGER.error("Error executing query", sqle);
        }
        LOGGER.debug("Ending with {} results", resultList.size());
        return resultList;
    }


    private President processResultSet(ResultSet resultSet) throws SQLException{
        Long id = resultSet.getLong("PRESIDENT_ID");
        String firstName = resultSet.getString("FIRST_NAME");
        String middleInitial = resultSet.getString("MIDDLE_INITIAL");
        String lastName = resultSet.getString("LAST_NAME");
        String emailAddress = resultSet.getString("EMAIL_ADDRESS");
        President president =  new President(id, firstName, middleInitial, lastName,ObfuscationUtil.obfuscateData(emailAddress));
        LOGGER.info("Resolving president: {}", president);
        return president;
    }


}
