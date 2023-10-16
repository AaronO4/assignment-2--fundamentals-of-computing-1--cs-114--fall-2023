import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //variable graveyard
    int diamondSize;
    int asterisk = 1;
    //int column; // HEY THIS IS YOUR CUE TO FIGURE OUT THE COLUMN THING

    Scanner scan = new Scanner(System.in);
    System.out.println("Insert size:");
    diamondSize = scan.nextInt(); // user input, diamond size

    if(diamondSize > 2 && diamondSize%2 != 0){ //makes sure the diamond is odd, doesn't run if diamond is smaller than 2
      for(int rows = 1; rows <= diamondSize/2 + 1; ++rows){
        for (int spaces = 1; spaces <= diamondSize/2 + 1 - rows; spaces++)
          System.out.print(" ");

            for (asterisk = 1; asterisk <= rows*2 - 1; asterisk++) // increases by 2 because it's odd (?)
              System.out.print("*");
              System.out.println(" ");
      }
            for (int rows = diamondSize/2; 1 <= rows; --rows) { // decrementing
               for (int spaces = 1; spaces <= diamondSize/2 + 1 - rows; spaces++)
                  System.out.print(" ");

              for (asterisk = 1; asterisk <= rows*2 - 1; asterisk += 2)
                System.out.print("*");
                System.out.println(" ");
          }
    scan.close();
    }

    if(diamondSize > 2 && diamondSize%2 == 0){ //runs even diamonds, makes sure diamond is big enough
      for(int rows = 1; diamondSize/2 + 1 >= rows; ++rows){
        for (int spaces = 1; spaces <= diamondSize/2 + 1 - rows; spaces++)
          System.out.print(" ");

            for (asterisk = 1; asterisk <= rows*2 - 1; asterisk += 2)
              System.out.print(" *");
              System.out.println(" ");
      }
              //bottom half, decrementing
      for (int rows = diamondSize/2; 1 <= rows; --rows) {
        for (int spaces = 1; spaces <= diamondSize/2 + 1 - rows; spaces++)
          System.out.print(" ");

      for (asterisk = 1; asterisk <= rows*2 - 1; asterisk += 2) // because its even, asterisk must decrease by 1
        System.out.print(" *");
        System.out.println(" ");
    }
  }
  }
}
