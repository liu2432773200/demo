package com.webservice.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UserAPI {
    @WebMethod
    String login(String loginName);
}
