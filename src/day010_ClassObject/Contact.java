package day010_ClassObject;

public class Contact {
    String name ="Semra";
    int phoneNumber =1234567890;
    String email="semrasudeavci@gmail.com";
     public void call(){
         System.out.println("You are calling " + phoneNumber);
     }
     public void sendMessage(){
         System.out.println("You are sending a message to " + email);
     }
     public void sendEmail(){
         System.out.println("You are sending an email to " + email);

     }
}
