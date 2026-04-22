
package prog5121poepart1;

import java.util.Scanner; //scanner for output recieved from users

public class PROG5121POEPart1 {
 
  
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String firstName;
            String lastName;
            String username;
            String password;
            String cellPhoneNumber;
                   
            
            System.out.println("REGISTRATION ");
            
            System.out.print("Enter first name: "); 
            firstName = input.nextLine();          // input field for user to insert name
            
            System.out.print("Enter last name: ");
            lastName = input.nextLine();           // input field for user to insert last name
            
            
            
            System.out.print("Enter username: ");
            username = input.nextLine();           // input field for user to insert username
            
            boolean checkUsername = username.contains ("_") && username.length() <=5;  // boolean checks if requirements for username return true
                    
            if (checkUsername) {
                System.out.println("Username successfully captured."); // if true returns the message
            } else {
                System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            }          // if false returns the message
            
            System.out.print("Enter password: ");
            password = input.nextLine();           // input field for user to password
            
            boolean hasUpper = password.matches(".*[A-Z].*"); //checks if the passowrd has an Uppercase letter

            boolean hasNumber = password.matches(".*[0-9].*");  //checks if the passowrd has atleast one number

            boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*"); //checks if the passowrd has atleast one special character
            
            if (password.length() >= 8 && hasUpper && hasNumber && hasSpecial) {
                System.out.println("Password successfully captured."); //if all conditions for the password are met then this message is displayed
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            } // if atleast one condition is not met then this is displayed 
                      
            
            System.out.print("Enter cell phone number : ");
            cellPhoneNumber = input.nextLine();              // input field for user to insert name
            
            if (cellPhoneNumber.matches ("^\\+27\\d{9}$")) { //conditiond for the cell phone number
                System.out.println("Cell phone number successfully added.");  //if condititons are met this message is displayed
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code."); // if conditions are not met this message is displayed
            }
           
            if (checkUsername && password.length() >= 8 && hasUpper && hasNumber && hasSpecial) { 
                System.out.println("Registration successful"); // if password and username meet the conditions then this message is displayed
            } else {
                System.out.println("Registration unsuccessful"); // if not this message is displayed
            }   
                   
            
            
            System.out.println("LOGIN");
            
            System.out.print("Enter username: ");
            String loginUsername = input.nextLine(); //user name field
            
            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();//passowrd field
            
            if (loginUsername.equals(username) && loginPassword.equals(password)) { // login username needs to be the same as the registration and login password has to be the same as the registration password
                System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!"); // if conditions are met, First Name and last name are displayed with message
            } else {
                System.out.println(" Username or password incorrect, please try again."); // if conditions are not met this message is displayed
            }
        }
    }
}


















    


    

