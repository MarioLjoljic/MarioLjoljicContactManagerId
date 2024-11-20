/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

/**
 *
 * @author Mario
 */
public class ContactManager {
    
     private Contact[] contacts; 
     private int contactCount;
    public ContactManager(){
        this.contacts=new Contact[10];
        this.contactCount = 0;
    }
 
    public boolean addContact(Contact contact) { 
        if (contactCount < contacts.length) {
            contacts[contactCount] = contact;
            contactCount++; return true;
        } 
        else {
            System.out.println("Contact list is full.");
            return false;
        } 
    }

    /* 

Locate a Contact record that matches the email address provided. 

Returns the Contact record if found, null if not found. 

    */ 

    public Contact findContact(String emailAddress){
        for (Contact contact:contacts){
            if (contact!=null && contact.getEmailAddress().equals(emailAddress)){
                return contact;
            }
        }
        return null;
    }

 //comment

    /* Removes all contacts */ 

    public void clearContacts(){
        for (int i =0;i<contacts.length;i++){
            contacts[i]=null;
        }
    }
}

 



