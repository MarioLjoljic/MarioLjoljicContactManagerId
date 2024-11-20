/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ice4.Contact;
import com.mycompany.ice4.ContactManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mario
 */


public class ContactManagerTest {
private static ContactManager contactManager;
    
    public ContactManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        contactManager = new ContactManager();
    

    }
    
    @AfterAll
    public static void tearDownClass() {
        contactManager=null;
    }
    
    @BeforeEach
    public void setUp() {
        contactManager.clearContacts();
        Contact[] contacts= {
        new Contact("bill","yonare","bill@money.com"),
        new Contact("john","wick","wick@continental.com"),
        new Contact("Stacy","Fakename","fakename@business.com")};
        for (Contact contact:contacts){
        contactManager.addContact(contact);
        }
    }
    
    @AfterEach
    public void tearDown() {
        contactManager.clearContacts();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}


@Test
public void testFindContactWithNullFields() { 
Contact contactWithNulls = new Contact(null, null, null);
contactManager.addContact(contactWithNulls);
Contact result = contactManager.findContact(null); 
assertNull(result); }


    @Test
    public void testAddNullContact(){
        boolean result = contactManager.addContact(null);
        assertFalse(result);
    }
    @Test
    public void testPartial(){
    Contact result = contactManager.findContact("wick@con");
    assertNull(result);
    }
    
    
    @Test
    public void testClearContacts(){
                Contact[] contacts= {
        new Contact("bill","yonare","bill@money.com"),
        new Contact("john","wick","wick@continental.com"),
        new Contact("Stacy","Fakename","fakename@business.com")};
        contactManager.clearContacts();
        for (Contact contact : contacts){
            assertNull(contactManager.findContact(contact.getEmailAddress()));
        }
    }

    @Test
    public void testEmailNotFound(){
    Contact result=contactManager.findContact("year@.daios");
    assertNull(result);
    }
    @Test
    public void noEmail(){
        Contact result=contactManager.findContact(null);
        assertNull(result);
    }
     @Test
    public void emptyList(){
        contactManager.clearContacts();
        Contact result=contactManager.findContact("wick@continental.com");
        assertNull(result);
    }
      @Test
    public void emptystring(){
        contactManager.clearContacts();
        Contact result=contactManager.findContact("");
        assertNull(result);
    }
}

