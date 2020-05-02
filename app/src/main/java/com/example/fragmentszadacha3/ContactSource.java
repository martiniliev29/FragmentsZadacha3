package com.example.fragmentszadacha3;

import java.util.ArrayList;

public class ContactSource {
    ArrayList<Contact> contacts;

    public ContactSource(){
        contacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }
    public boolean addContact(String name,String address){
        return contacts.add(new Contact(name,address));
    }

}
