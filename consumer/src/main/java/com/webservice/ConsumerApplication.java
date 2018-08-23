package com.webservice;

import com.webservice.api.UserAPI;
import com.webservice.provider.UserAPIImpl;
import com.webservice.provider.UserAPIImplService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ConsumerApplication.class, args);
        UserAPIImplService userAPIImplService=new UserAPIImplService();
        UserAPIImpl userAPI=userAPIImplService.getUserAPIImplPort();
        userAPI.login(null);
    }
}
