package com.webservice;

import com.webservice.provider.UserAPIImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

//@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ProviderApplication.class, args);
        String address="http://localhost:8080/user/login";
        Endpoint.publish(address,new UserAPIImpl());
    }


}
