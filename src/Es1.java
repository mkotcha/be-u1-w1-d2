import java.util.Scanner;

public class Es1 {

    public static boolean strEvenOdd (String str) {
        int n = str.length();
        return n % 2 == 0;
    }

public static boolean leapYear(int year) {
        if (year % 4==0 ) {
            if (year % 100 ==0) {
                return year % 400 == 0;
            }
            return true;
        }

        return false;
    }
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        String str;
        int year;
        System.out.println("inserisci una stringa");
        str = input.nextLine();
        System.out.println("il numero di caratteri di " + str + " è " + (strEvenOdd(str)? "pari" : "dispari"));

        System.out.println("inserisci un anno");
        year = input.nextInt();
        System.out.println(year + (leapYear(year)? " è bisestile" : " non è bisestile"));
        input.close();
    }

}
