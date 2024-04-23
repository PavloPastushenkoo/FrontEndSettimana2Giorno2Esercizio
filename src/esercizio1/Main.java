package esercizio1;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer elementiN = 0;
        Boolean continua = false;
        Set elementi = new HashSet();
        do {
            try {
                System.out.println("Digira quanti elementi vuoi inserire");
                elementiN = scanner.nextInt();
                if (elementiN <= 0) {
                    throw new Exception();
                }
                continua = true;
            } catch (Exception e){
                System.out.println("Devi inserire un numero intero");
                continua = false;
            }
        } while (!continua);
        scanner.nextInt();
        for (int i = 0; i < elementiN; i ++){
            System.out.println("Scrivi una parola che vuoi aggiungere - Slot" +(i+1));
            String parola = scanner.nextLine();
            if (elementi.add(parola)) {
                System.out.println(parola);
            }else {
                System.err.println("Duplicato" + parola);
                i--;
            }
        }
        System.out.println("Risultato " + elementi);
    }
}
