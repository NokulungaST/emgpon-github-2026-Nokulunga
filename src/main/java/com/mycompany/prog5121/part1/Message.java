
package com.mycompany.prog5121.part1;


import java.util.Random;

        import java.util.Scanner;



public class Message {
    
    
    public void messagingPlatform() {
        
  
        
        int optionList;

        try (Scanner input = new Scanner(System.in)) {
        
                
         do {
            System.out.println("What would you like to do:");
            System.out.println("1.Send Messages");
            System.out.println("2.Show recent messages");
            System.out.println("3.Quit");
            System.out.print("Enter choice: ");
        
            optionList = input.nextInt();
                       
             switch (optionList) {
                 case 1 -> howManyMessages();
                 case 2 -> System.out.println ("Coming soon");
                 case 3 -> System.out.println ("See you soon!"); 
                 default -> System.out.println("Please select options 1,2 or 3");
                 
                 }
                                      
   
         } while( optionList !=3);
    }
}
 
      
        public void howManyMessages() {
        
      
        Scanner input = new Scanner(System.in); 
            String message; 
            String recipient;
        
        System.out.print("How many messages would you like to send today? ");

                     
        int numberOfMessages = input.nextInt();
        input.nextLine();
        
         do {
                System.out.print("Enter recipient number : ");
                 recipient = input.nextLine();
                         

    
            if (!recipient.matches("^\\+27\\d{9}$")) {
         System.out.println("Invalid Phone number.");
  
            }

           } while (!recipient.matches("^\\+27\\d{9}$"));
           

        int numberMess = 0;
        
        for (int a = 1; a <= numberOfMessages; a++ ){
            
            Random ID = new Random ();
          
          
         long messageID=  1000000000L
        + (long)(ID.nextDouble()* 9000000000L);
         
            System.out.println( messageID );
            
            System.out.println( recipient ); 
            
                              
           int messOptions;
                   
             System.out.print("Message: ");
                    message = input.nextLine();
                    
                do {
            System.out.println("Send Message - press 1");
            System.out.println("Press 0 to delete message");
            System.out.println("Stored message - press 2");
            System.out.print("Enter choice: ");
            
            messOptions = input.nextInt();
            input.nextLine();
                    
                } while( messOptions < 0 || messOptions > 2);
                      
             switch (messOptions) {
                 case 1 -> { if (message.length() <= 250) {
                numberMess++;
             System.out.println("Message sent" + " " + numberMess); 
              String idString = String.valueOf(messageID);
            String[] mess = message.split(" ");
            System.out.println( idString.substring(0 , 2) + ":" + numberMess + ";" + mess[0] + mess [mess.length-1]);

                            
        } else {
            System.out.println("Please enter a message of less than 250 characters");
           
                 } 
                 }
                 case 0 -> System.out.println ("Message Deleted");
                 case 2 -> System.out.println ("Message stored"); 
                 default -> System.out.println("Please select options 1,2 or 3");
                 
                 }    
                    
                    
           System.out.println( numberOfMessages ); 
                  
                 }
        }
}
        
    

