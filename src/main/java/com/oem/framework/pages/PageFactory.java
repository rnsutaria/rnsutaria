package com.oem.framework.pages;

public class PageFactory {

    ThreadLocal<LoginPage> loginPageThreadLocal=new ThreadLocal<>();

    public void init(){
        loginPageThreadLocal.set(new LoginPage());
    }
}
