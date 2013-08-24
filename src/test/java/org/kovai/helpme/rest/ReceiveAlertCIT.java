package org.kovai.helpme.rest;

import com.jayway.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.post;
import static name.mlnkrishnan.shouldJ.ShouldJ.it;

public class ReceiveAlertCIT extends BaseIT {
    @Test
    public void shouldReceiveAccidentAlert() {
        Response response = post("/accident");
        it(response.getStatusCode()).shouldBe(200);
        it(response.getBody().asString()).shouldBe("Acknowledged");
    }
}