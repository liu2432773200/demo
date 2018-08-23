package com.webservice.provider;

import com.webservice.api.UserAPI;

import javax.jws.WebService;

@WebService
public class UserAPIImpl implements UserAPI {
    @Override
    public String login(String loginName) {
        String str=loginName!=null||loginName.length()!=0?"欢迎你,"+loginName+"!":"未登录!";
        System.out.println("str:"+str);
        return str;
    }
}
