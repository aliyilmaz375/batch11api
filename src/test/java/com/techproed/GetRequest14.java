package com.techproed;

import TestBase.TestBaseDummy;
import TestData.DummyTestData;
import io.restassured.response.Response;
import org.junit.Test;

import java.awt.image.RescaleOp;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetRequest14 extends TestBaseDummy {

    	/*
	 	When
	 		I send a request to http://dummy.restapiexample.com/api/v1/employees
	 	Then
	 		Status code is 200
	 		And the highest salary is 725000
	 		And the minimum age is 19
	 		And the second lowest salary is 675000
	*/
    @Test
    public void get01(){
        // Url olustur
        spec03.pathParam("employeesPath","employees");

        // Beklenen Datayı olustur
        DummyTestData expectedObj = new DummyTestData();
        Map<String,Integer> expectedDataMap = expectedObj.setUpData2();
        System.out.println(expectedDataMap);

        // 4. request olustur
        Response response = given().
                                  spec(spec03).
                                           when().
                                               get("/{employeesPath}");
        response.prettyPrint();
        // 4. Assertion
        // 1.yol jsonPath
        // 2. yol De-Serialization


    }
}
