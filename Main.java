import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     String[]mrBarry = new String [10];
    //This is where my mr barry string is
     Scanner scan = new Scanner(System.in);
     //This is where my first scanner is 
     for (int i = 0; i < mrBarry.length; i++)
   {      // this is where my first for loop is 
        System.out.println("Enter name below");
        //this is where the students enter their names 
        mrBarry [i] = scan.next();
    }
       System.out.println("Ms.Benny's new student list");
       String[] msBenny = new String[12];
       //this is my where my ms benny string is 
       for (int i = 0; i < mrBarry.length; i++)
       {//this is where my second for loop is  
        msBenny[i] = mrBarry[i];
       System.out.println("Welcome student " + msBenny[i]);
       } //this is where it says welcome students and it includes their names
       msBenny[10] = "Obama";
       msBenny[11] = "Kevin";
       System.out.println("Welcome student " + msBenny[10]);
       System.out.println("Welcome student " + msBenny[11]);
       //this is where it welcomes the new students
   }
}