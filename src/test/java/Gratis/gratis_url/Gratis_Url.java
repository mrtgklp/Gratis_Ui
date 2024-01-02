package Gratis.gratis_url;

import Gratis.utilities.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Gratis_Url {
    public  static RequestSpecification spec;

    public static void setUp(){
        spec = new RequestSpecBuilder()
                //.addHeader("Authorization",generateToken())
                .setBaseUri(ConfigReader.getProperty("Gratis_url"))
                .setContentType(ContentType.JSON)
                .build();
    }
}
