/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class MessageTest {
    
    public MessageTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of messagingPlatform method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testMessagingPlatform() {
        System.out.println("messagingPlatform");
        Message instance = new Message();
        instance.messagingPlatform();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of howManyMessages method, of class Message.
     */
    @org.junit.jupiter.api.Test
    public void testHowManyMessages() {
        System.out.println("howManyMessages");
        Message instance = new Message();
        instance.howManyMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        long messageID = 0L;
        String hash = "";
        String recipient = "";
        String message = "";
        Message instance = new Message();
        instance.storeMessage(messageID, hash, recipient, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessagesFromJSON method, of class Message.
     */
    @Test
    public void testMessagesFromJSON() {
        System.out.println("MessagesFromJSON");
        Message instance = new Message();
        instance.MessagesFromJSON();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storedMessagesOptions method, of class Message.
     */
    @Test
    public void testStoredMessagesOptions() {
        System.out.println("storedMessagesOptions");
        Message instance = new Message();
        instance.storedMessagesOptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SenderRecipient method, of class Message.
     */
    @Test
    public void testSenderRecipient() {
        System.out.println("SenderRecipient");
        Message instance = new Message();
        instance.SenderRecipient();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longestStoredMessage method, of class Message.
     */
    @Test
    public void testLongestStoredMessage() {
        System.out.println("longestStoredMessage");
        Message instance = new Message();
        instance.longestStoredMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchMessageID method, of class Message.
     */
    @Test
    public void testSearchMessageID() {
        System.out.println("searchMessageID");
        Message instance = new Message();
        instance.searchMessageID();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchRecipient method, of class Message.
     */
    @Test
    public void testSearchRecipient() {
        System.out.println("searchRecipient");
        Message instance = new Message();
        instance.searchRecipient();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMessage method, of class Message.
     */
    @Test
    public void testDeleteMessage() {
        System.out.println("deleteMessage");
        Message instance = new Message();
        instance.deleteMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AllStoredMessages method, of class Message.
     */
    @Test
    public void testAllStoredMessages() {
        System.out.println("AllStoredMessages");
        Message instance = new Message();
        instance.AllStoredMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
