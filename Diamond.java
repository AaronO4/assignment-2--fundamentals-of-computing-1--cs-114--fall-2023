import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //variable graveyard
    int diamondSize;


    Scanner scan = new Scanner(System.in);
    System.out.println("Insert size:");
    diamondSize = scan.nextInt();
    if(diamondSize%2!=0 && diamondSize > 2){ //makes sure the diamond is odd, doesn't run if diamond is smaller than 2
      for(int i = 0; diamondSize > i; i++){
        System.out.println("+");
      }
    scan.close();
    }
    else if(diamondSize > 2){ //runs even diamond sizes, makes sure diamond is big enough
      for(int i = 0; diamondSize > i; i++){
        System.out.println("++");
    }
  }


  }
}
