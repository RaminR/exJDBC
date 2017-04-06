package com.resud.core;

/**
 * Created by RRM on 06.04.17.
 */
public class User {

    private int id;
    private String name;
    private String email;

    public User(){

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "USER: [ID: " + id + ". NAME: " + name + " E-MAIL: " + email + " ]";
    }

}
