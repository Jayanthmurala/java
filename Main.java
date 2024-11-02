import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 1: ");
        int b = sc.nextInt();
        System.out.println("1.+\n2.-\n3.*\n4./\n5.%");
        System.out.println("Selet from above choose");
        int ip= sc.nextInt();
    
      switch (ip) {
        case 1:
          System.out.println(a+b);
          break;
        case 2:
          System.out.println(a-b);
          break;
        case 3:
          System.out.println(a*b);
          break;
        case 4:
          System.out.println(a/b);
          break;
        case 5:
          System.out.println(a%b);
          break;
        default:
          System.out.println("invalied input");
          break;
   
      }
      sc.close();
    }
  }
  