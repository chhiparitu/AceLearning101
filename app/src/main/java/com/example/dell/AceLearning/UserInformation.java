package com.example.dell.AceLearning;


public class UserInformation  {

    private String name;
    private String email;
    private String usertype;
    private String password;

    public UserInformation(){

    }

    public UserInformation(String name,String email, String password, String usertype) {
        this.email = email;
        this.name = name;
        this.usertype = usertype;
        this.password=password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype= usertype;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }

}
