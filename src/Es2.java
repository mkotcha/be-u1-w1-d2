import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("inserisci un numero compreso fra 0 e 3");
        n=input.nextInt();
        switch (n) {
            case 0 : {
                System.out.println("zero");
                break;
            }
            case 1 : {
                System.out.println("uno");
                break;
            }
            case 2 : {
                System.out.println("due");
                break;
            }
            case 3 : {
                System.out.println("tre");
                break;
            }
            default:
                System.out.println("error!");
                break;
        }
        input.close();
    }
}
