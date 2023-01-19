package com.sqli.SQLInjectionDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sqli.SQLInjectionDemo.solution.DatabaseUtil;
import com.sqli.SQLInjectionDemo.solution.President;
import com.sqli.SQLInjectionDemo.solution.PresidentDAO;

public class PresidentDAOTestSolution {

    @BeforeClass
    public static void setUp() throws Exception {
        DatabaseUtil.loadFile("sql/schema.sql");
        DatabaseUtil.loadFile("sql/data.sql");
    }

    @Test
    public void getByLastName() {
        PresidentDAO dao = new PresidentDAO();
        List<President> results = dao.getByLastName("Washington");
        assertNotNull(results);
        assertEquals(1, results.size());
        assertEquals("George", results.get(0).getFirstName());
    }

    @Test
    public void getByLastName_Injections(){
        PresidentDAO dao = new PresidentDAO();
        List<President> results = dao.getByLastName("Trump' or '1' = '1");
        assertNotNull(results);
        assertEquals(0, results.size());
    }
}