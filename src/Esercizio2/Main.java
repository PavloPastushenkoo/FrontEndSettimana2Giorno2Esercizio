package Esercizio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n1 = 0;
        Boolean continua = false;
        do {
            System.out.println("Quanti numeri casuali vuoi?");
            try {
                n1 = scanner.nextInt();
                if (n1 < 0 | n1 > 100) {
                    throw new Exception();
                } else if (n1 == 0) {
                    System.out.println("Hai deciso di interrompere il programma");
                    break;
                }
                continua = true;
            } catch(InputMismatchException e) {
                System.out.println("Devi inserire un numero");
                scanner.nextLine();
                continua = false;
            } catch (Exception e) {
                System.err.println("Devi inserire un intero maggiore di 0 e inferiore a 101");
                scanner.nextLine();
                continua = false;
            }
        } while (!continua);
        if (n1 > 0) {
            ArrayList lista = Lista.numeriCasuali(n1);
            System.out.println("Lista: "+lista);
        }
    }
}
