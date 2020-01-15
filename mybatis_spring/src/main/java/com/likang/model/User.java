package com.likang.model;




import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;
    private String userName;
    private Date birthday;
    private String sex;
    private String address;

    public User(int id ,String userName ,Date birthday ,String sex ,String address){
        this.id = id ;
        this.userName = userName;
        this.birthday = birthday;
        this.sex = sex;
        this.address =address;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
