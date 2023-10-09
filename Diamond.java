import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //variable graveyard
    int diamondSize;
int diamond = 1;

    Scanner scan = new Scanner(System.in);
    System.out.println("Insert size:");
    diamondSize = scan.nextInt();

    int halfDiamond = diamondSize/2;

    if(diamondSize > 2 && diamondSize%2 != 0){ //makes sure the diamond is odd, doesn't run if diamond is smaller than 2
      for(int rows = 1; halfDiamond >= rows; ++rows){
          for (diamond = 1; diamond <= rows; ++diamond)
            System.out.print("*");
            System.out.println(" ");
      }
            for (int rows = halfDiamond; rows >= 1; --rows) {
              for (diamond = halfDiamond; rows <= diamond; --diamond)
              System.out.print("*");
              System.out.println(" ");
            }

    scan.close();
    }
    if(diamondSize > 2 && diamondSize%2 == 0 ){ //runs even diamonds, makes sure diamond is big enough
      for(int rows = 1; halfDiamond >= rows; ++rows){
        for (diamond = 1; diamond <= rows; ++diamond)
          System.out.print("* ");
          System.out.println(" ");
    }

     for (int rows = halfDiamond; rows >= 1; --rows) {
      for (diamond = halfDiamond; rows <= diamond; --diamond)
        System.out.print("* ");
          System.out.println(" ");
      }
  }

  }
}
