    //Guest.java
    class Message {
         public static void main(String [] args) {
             System.out.println("Welcome! " + args[1]);
         }
    }
     
    public class Guest {
         public static void main(String [] args) {
             Message.main(args);
         }
    }