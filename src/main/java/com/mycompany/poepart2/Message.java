
package com.mycompany.poepart2;

import java.io.File; //used to read json file
import java.io.FileWriter; // used to store in json file
import java.io.FileNotFoundException;
import java.io.IOException; // shows error with json file
import java.util.Random; // random number generator used to come up with random numbers for the message ID
import java.util.Scanner; // scanner used output from users 
import org.json.JSONException; // shows error is data in json file
import org.json.JSONObject; // imports json file data 


public class Message { // 
    
String[] sentMessages = new String[100]; // this is an array that stores the text of sent messages 
String[] storedMessages = new String[100]; // this is an array that stores the stored messages 
String[] disregardedMessages = new String[100]; // this is an array that stores disregarded messages
String[] messageHashes = new String[100]; //this is an array that stores message hashes
long[] messageIDs = new long[100]; // this is an array that stores message ids
String[] recipients = new String[100];// this is an array that stores recipient phone numbers

int sentCount = 0; // this counts messages sent
int disregardedCount = 0; // this count messages deleted
int storedCount = 0; // this counts stored messages 
    
    
  public void storeMessage(long messageID, String hash, String recipient, String message)   {
      
      JSONObject storeMessage = new JSONObject(); // json object created

    storeMessage.put("messageID", messageID);// message Id in the json object
    storeMessage.put("recipient", recipient); // recipient phone number in the json object
    storeMessage.put("message", message); // message in json object
    storeMessage.put("hash", hash); //message hash in json object
    
    try (FileWriter file = new FileWriter("storedMessages.json", true)) // java writing to the json file, storing in json file
   
    { file.write(storeMessage.toString()); //writes to json file
    file.write(System.lineSeparator());

     System.out.println("Message stored"); // displays if message is stored to json file

    } catch (IOException e) {
        System.out.println("Error storing message");// displays if message was not stored to json file
   
}
      
  }     
   
    public void messagingPlatform() {
        
  
        
        int optionList; //option lists only accept integers 

        try (Scanner input = new Scanner(System.in)) {
        
                
         do {
            System.out.println("What would you like to do:"); // This displays the options the users has to pick from
            System.out.println("1.Send Messages");
            System.out.println("2.Show recent messages");
            System.out.println("3.Quit");
            System.out.println("4.Stored Messages");
       
            
            System.out.print("Enter choice: ");
            optionList = input.nextInt(); // Input field for above options, users can insert numbers 1 to 3
                       
             switch (optionList) {
                 case 1 -> howManyMessages(); // if 1 is selected, user is then redirected to method howManyMessages
                 case 2 -> System.out.println ("Coming soon"); // if 2 is selected "coming soon message pops up
                 case 3 -> System.out.println ("See you soon!"); // if 3 is selected a goodbye message is displayed
                 case 4 -> storedMessagesOptions();
                 default -> System.out.println("Please select options 1,2,3 or 4");// if an invalid input is inserted then this is diaplyed and user is taken back to option list
                 
                 }
            
                                      
   
         } while( optionList !=3); // if 3 is slected then the program stops running and quits application
    }
}
 
      
        public void howManyMessages() { //this is a method for if the user chooses to send messages 
        
      
        Scanner input = new Scanner(System.in); 
            String message; 
            String recipient;
            String hash = null;
        
        System.out.print("How many messages would you like to send today? "); // asks how many messages the user would like to send 

                     
        int numberOfMessages = input.nextInt();
        input.nextLine(); // input field for how many messages user would like to send 
        
         do {
                System.out.print("Enter recipient number : "); // field to enter the phone number of the recipient
                 recipient = input.nextLine();
                         
    
            if (!recipient.matches("^\\+27\\d{9}$")) { //recipient number should match these conditions inorder to be accepted
         System.out.println("Invalid Phone number.");
  
            }

           } while (!recipient.matches("^\\+27\\d{9}$")); // if recpient number does not meet conditions this message is displayed
           

        int numberMess = 0; // counts and keeps track of numbers sent
        
        for (int a = 1; a <= numberOfMessages; a++ ){ // for loop so the code inside of it is repeated 
            
            Random ID = new Random ();
          
          
         long messageID=  1000000000L
        + (long)(ID.nextDouble()* 9000000000L); // generates random 10 digit number
         
            System.out.println( messageID );
            
            System.out.println( recipient ); 
            
                              
           int messOptions;
                   
             System.out.print("Message: ");
                    message = input.nextLine();
                    
                do {
            System.out.println("Send Message - press 1"); // option list after typing out message 
            System.out.println("Press 0 to delete message");
            System.out.println("Stored message - press 2");
            System.out.print("Enter choice: ");
            
            messOptions = input.nextInt();
            input.nextLine(); // input field for option list
                    
                } while( messOptions < 0 || messOptions > 2); // input must be 0, 1 or 2
                      
             switch (messOptions) {
                 case 1 -> { if (message.length() <= 250) { //length of message should not be longer than 250 characters 
                numberMess++;                  // message counter to see how many messages user has sent 
             System.out.println("Message sent" + " " + numberMess);  // displays the message and what number message 
              String idString = String.valueOf(messageID); // converting messgageID to string
            String[] mess = message.split(" ");        //spliting the message sting so each word is counted individually
           hash = idString.substring(0 , 2) + ":" + numberMess + ";" + mess[0] + mess [mess.length-1]; // displays first two numbers of messageID, what number message and, the first and last words of the message 
           System.out.println(hash);
                   
            sentMessages[sentCount] = message; // it saves into the sentMessage array while keepin count of input
            messageIDs[sentCount] = messageID;// it saves into the messageID array while keeping count of input
            recipients[sentCount] = recipient; // saves into the recipeient array while keeping count of input
            messageHashes[sentCount] = hash; //it saves into the messageHashes array while keeping count of input
            sentCount++; //counts by 1
            
                            
        } else {
            System.out.println("Please enter a message of less than 250 characters"); // if message is longer than 250 characters this is displayed
           
                 } 
                 }
                 case 0 -> {disregardedMessages[disregardedCount] = message; //it saves into the disregardedMessages array while keeping count of input
                            disregardedCount++; //count by 1
                           System.out.println ("Message Deleted");} // this is displayed if 0 is selctecd for the message to be deleted
                 case 2 -> {storedMessages[storedCount] = message; // it saves into the storedMessage array while keeping count of input
                             messageIDs[sentCount] = messageID;
                            recipients[sentCount] = recipient;
                             
                             storedCount++;
                          storeMessage(messageID, hash, recipient, message);} // this is displayed if 2 is selected and is chosen to be stored 
                 default -> System.out.println("Please select options 1,2 or 3"); // if invalid prompt is entered
                 
                 }    
                    
                    
           System.out.println( numberOfMessages ); // this shows the number of messages the user selected in the beginning
                  
                 }
        }
        
        public void MessagesFromJSON() { // this imports json messages so they can be searched 
    storedCount = 0;

    try {
        File file = new File("storedMessages.json"); // 
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                
                String line = reader.nextLine(); //read line in json file
                JSONObject obj = new JSONObject(line);
                
                messageIDs[storedCount] = obj.getLong("messageID"); //searches json file and json object for messageID 
                recipients[storedCount] = obj.getString("recipient"); //searches json file and json object for recipient phone number
                storedMessages[storedCount] = obj.getString("message"); //searches json file and json object for Message

                
                storedCount++;
            }
        } catch (FileNotFoundException ex) { // if not found in json it runs next line
            System.getLogger(Message.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex); // added by program
        }

    } catch (JSONException e) { //if json data not valid then this is ran
        System.out.println("Error reading JSON file.");// then this is diplayed 
    }
}
        
        public void storedMessagesOptions() { //method declaration
                
                MessagesFromJSON();// calls on another method
    
            int optionList; //option lists only accept integers  
         Scanner input = new Scanner(System.in); {

            
    System.out.println("1. Display recipient"); // list of options
    System.out.println("2. Search for longest stored message");
    System.out.println("3. Search by Message ID");
    System.out.println("4. Search by Recipient");
    System.out.println("5. Delete Message");
    System.out.println("6. All stored messages");
    
     System.out.print("Enter choice: "); // insert option number 
            optionList = input.nextInt(); 
            
             switch (optionList) {
                 case 1 -> SenderRecipient();
                 case 2 -> longestStoredMessage();
                 case 3 -> searchMessageID();
                 case 4 -> searchRecipient();
                 case 5 -> deleteMessage();
                 case 6 -> AllStoredMessages();
                 default -> System.out.println("Please select between 1 and 6");
                 
                 }
        }     
                    
}
        
        public void SenderRecipient() { // if option one is selected 

    for (int i = 0; i < storedCount; i++) { //goes through the stored json objects and finds recipients

        
        System.out.println("Recipient  : " + recipients[i]); // returns and displays recipients phone number
        
    }
        }
    
    
    public void longestStoredMessage() { //method used for option 2

    if (storedCount == 0) { // checks if there are no stored messages
        System.out.println("No stored messages."); // displays this if there are no stored messages
        return;  
    }

    int longest = 0; //assumes first message is the longest

    for (int i = 1; i < storedCount; i++) { //loop that searches for the longest message starting from second message, searches all messages 

        if (storedMessages[i].length() > storedMessages[longest].length()) {
            longest = i;
        }
    }

    System.out.println("Longest Message");
    System.out.println("ID: " + messageIDs[longest]);         //displays messageID of longest message
    System.out.println("Recipient: " + recipients[longest]);  //displays recipient cell of longest message
    System.out.println("Message: " + storedMessages[longest]); // display long message
}
  
    
    public void searchMessageID() { //method for option 3 

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Message ID: ");  
    long id = input.nextLong();   //reads messageId inserted 

    for (int i = 0; i < storedCount; i++) { //

        if (messageIDs[i] == id) { //checks if there is a matching messageID in the stored json file

            System.out.println("Message Found");
            System.out.println("Recipient: " + recipients[i]);
            System.out.println("Message: " + storedMessages[i]);

            return;
        }
    }

    System.out.println("Message not found.");
}
    
    public void searchRecipient() { // method for option 4 

    Scanner input = new Scanner(System.in);

    System.out.print("Enter recipient number: ");  
    String number = input.nextLine();

    boolean found = false;  //starts of false then searches

    for (int i = 0; i < storedCount; i++) { 

        if (recipients[i].equals(number)) { //checks if number entered is the same as stored recipient cell

            
            System.out.println("Message ID: " + messageIDs[i]);
            System.out.println("Recipient: " + recipients[i]);
            System.out.println("Message: " + storedMessages[i]);
            

            found = true; //changes to true if matching recipient cell is found
        }
    }

    if (!found) { // if found is false
        System.out.println("Recipient not found."); // displays this
    }
}

    
    public void deleteMessage() {  //method used for option 5

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Message ID to delete: ");
    long id = input.nextLong();   

    for (int i = 0; i < storedCount; i++) {

        if (messageIDs[i] == id) { //checks to match messageID

            for (int j = i; j < storedCount - 1; j++) {

                messageIDs[j] = messageIDs[j + 1];
                recipients[j] = recipients[j + 1];
                storedMessages[j] = storedMessages[j + 1];
       
            }


            System.out.println("Message deleted.");
            return;
        }
    }

    System.out.println("Message not found.");
}
    
    public void AllStoredMessages() {

    if (storedCount == 0) { // starts by assuming there are no stored messages 
        System.out.println("No stored messages.");
        return;
    }

    for (int i = 0; i < storedCount; i++) { // returns all stored messages 

                System.out.println("Message ID : " + messageIDs[i]);
        System.out.println("Recipient  : " + recipients[i]);
        System.out.println("Message    : " + storedMessages[i]);
        
}
    
    }
    
}