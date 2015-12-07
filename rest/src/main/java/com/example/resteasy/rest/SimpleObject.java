package com.example.resteasy.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ron on 7-12-2015.
 */
@XmlRootElement
public class SimpleObject {
    private  String firstname;
    private  String lastname;

    public SimpleObject() {
    }

    public SimpleObject(String voornaam, String achternaam) {
        this.firstname = voornaam;
        this.lastname = achternaam;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
