import java.util.Scanner;

public class Es3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while(!quit) {
            String str;
            System.out.println("inserisci una stringa (:q per uscire)");
            str= input.nextLine();
            if (str.equals(":q")) {
                System.out.println("exit.");
                quit = true;
            }
            else {
                str = str.replaceAll(" ", "") ;
                str = str.replaceAll("", ",") ;
                str = str.substring(1, str.length() - 1);
                System.out.println(str);
            }
        }
        input.close();
    }


}
