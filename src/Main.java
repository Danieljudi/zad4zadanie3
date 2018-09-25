import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Witaj");
        System.out.print("Podaj pierwsza liczbe:");
        Scanner scanner= new Scanner(System.in);
        int pierwsza =scanner.nextInt();

        System.out.print("Podaj druga liczbe:");
        Scanner scanner2=new Scanner(System.in);
        int druga =scanner.nextInt();

        System.out.print("Podaj trzecia liczbe:");
        Scanner scanner3=new Scanner(System.in);
        int trzecia =scanner.nextInt();

        if (((pierwsza >100)||(pierwsza<0))||((druga>100)||(druga<0))||((trzecia>100)||(trzecia<0)))
            System.out.println("Niepoprawna wartosc dla jednej z liczb");

        else{
            ArrayList<Integer> liczby= new ArrayList<>();
            liczby.add(pierwsza);
            liczby.add(druga);
            liczby.add(trzecia);
            Collections.sort(liczby);{
                for (int i:liczby){
                    System.out.println(i);
                }
            }




        }


    }
}
