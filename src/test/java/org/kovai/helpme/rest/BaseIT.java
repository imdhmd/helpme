package org.kovai.helpme.rest;

import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BaseIT {
    @BeforeClass
    public static void beforeAllITs(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 9979;
    }
}
