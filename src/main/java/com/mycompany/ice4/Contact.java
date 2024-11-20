/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

/**
 *
 * @author Mario
 */
public class Contact { 

    private String firstName; 

    private String lastName; 

    private String emailAddress; 
public Contact(String firstName,String lastName, String emailAddress){
this.firstName=firstName;
this.lastName=lastName;
this.emailAddress=emailAddress;}
 
public String getFirstName(){
    return firstName;
}
public void setFirstName(String newFirstName){
    this.firstName=newFirstName;
}
public String getLastName(){
    return lastName;
}
public void setLastName(String newLastName){
    this.lastName=newLastName;
}
public String getEmailAddress(){
    return emailAddress;
}
public void setEmailAddress(String newEmailAddress){
    this.firstName=newEmailAddress;
}


} 
