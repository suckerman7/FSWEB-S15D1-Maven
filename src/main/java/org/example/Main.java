package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone(new ArrayList<>(), "23435464357");
        mobilePhone.addNewContact(new Contact("emrah", "325136546357357"));
        mobilePhone.addNewContact(new Contact("emrah", "325136546357357"));
        mobilePhone.addNewContact(new Contact("emrah", "325136546357357"));
        mobilePhone.addNewContact(new Contact("mert", "325165667835357"));
        mobilePhone.printContacts();
    }
}
