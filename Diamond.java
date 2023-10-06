import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //variable graveyard
    int diamondSize;
    int increment = 0;

    // make sure code doesn't work for Less Than 2
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert size:");
    diamondSize = scan.nextInt();
    if (diamondSize > 2);{
      for(diamondSize%2==1;);{
        System.out.println("+");
        increment++;
      }
    }
    scan.close();

  }
}
