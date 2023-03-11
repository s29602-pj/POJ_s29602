import java.util.Scanner;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Zad1();
        //Zad2();
        //Zad3();
        //Zad4();
        //Zad5();
        //Zad6();
        //Zad7();
        //Zad8();
        //Zad9();
        //Zad10();
        //Zad11();brak
        //Zad12();
        //Zad13();
        //Zad14();
        //Zad15();
         

    }


     public static void Zad1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku: ");
        int a = scan.nextInt();
        System.out.println("Podaj długość drugiego boku: ");
        int b = scan.nextInt();
        int wynik = a * b;
        System.out.println("Pole tego czworokąta wynosi:" + (wynik));
    }

    public static void Zad2() {
        System.out.println("Liczba Pi wynosi: " + (Math.PI));
        double wynik = (Math.round(Math.sqrt(Math.PI) * 100));
        System.out.println("Liczb Pi z pierwiastkowana wynosi: " + (wynik / 100));
    }

    public static void Zad3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy tekst: ");
        String napis1 = scan.nextLine();
        System.out.println("Podaj drugi tekst: ");
        String napis2 = scan.nextLine();
        System.out.println((napis1) + " " + (napis2));
    }

    public static void Zad4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku: ");
        int bok1 = scan.nextInt();
        System.out.println("Podaj długość drugiego boku: ");
        int bok2 = scan.nextInt();
        System.out.println("Podaj długość trzeciego boku: ");
        int bok3 = scan.nextInt();
        if (bok1 < 0 || bok2 < 0 || bok3 < 0) {
            System.out.println("BLAD");
        } else if (bok1 >= bok2 + bok3 || bok2 >= bok1 + bok3 || bok3 >= bok1 + bok2) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
        }
    }

    public static void Zad5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj który miesiąc: ");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                System.out.println("Styczeń: 31dni");
                break;
            case 2:
                System.out.println("Luty: 28dni");
                break;
            case 3:
                System.out.println("Marzec: 31dni");
                break;
            case 4:
                System.out.println("Kwiecień: 30dni");
                break;
            case 5:
                System.out.println("Maj: 31dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30dni");
                break;
            case 7:
                System.out.println("Lipiec: 31dni");
                break;
            case 8:
                System.out.println("Sierpień: 31dni");
                break;
            case 9:
                System.out.println("Wrzesień: 30dni");
                break;
            case 10:
                System.out.println("Październik: 31dni");
                break;
            case 11:
                System.out.println("Listopad: 30dni");
                break;
            case 12:
                System.out.println("Grudzień: 31dni");
                break;
            default:
                System.out.println("BLAD");
        }
    }

    public static void Zad6() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę rzeczywistą: ");
        double a = scan.nextDouble();
        System.out.println("Podaj drugą liczbę rzeczywistą: ");
        double b = scan.nextDouble();
        System.out.println("Podaj trzecią liczbę rzeczywistą: ");
        double c = scan.nextDouble();
        if (a >= b && a >= c) {
            System.out.println("Od największej: " + (a) + (",") + (Math.max(c, b)) + (",") + (Math.min(c, b)));
            System.out.println("Od najmniejszej: " + (Math.min(c, b)) + (",") + (Math.max(c, b)) + (",") + (a));
        } else if (b >= a && b >= c) {
            System.out.println("Od największej: " + (b) + (",") + (Math.max(c, a)) + (",") + (Math.min(c, a)));
            System.out.println("Od najmniejszej: " + (Math.min(c, a)) + (",") + (Math.max(c, a)) + (",") + (b));
        } else if (c >= a && c >= a) {
            System.out.println("Od największej: " + (c) + (",") + (Math.max(a, b)) + (",") + (Math.min(a, b)));
            System.out.println("Od najmniejszej: " + (Math.min(a, b)) + (",") + (Math.max(a, b)) + (",") + (c));
        }

    }

    public static void Zad7() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę elementów tablicy A: ");
        int n = scan.nextInt();
        int[] tablicaA = new int[n];

        System.out.println("Podaj elementy tablicy A: ");
        for (int i = 0; i < n; i++) {
            tablicaA[i] = scan.nextInt();
        }

        System.out.println("Podaj liczbę elementów tablicy B: ");
        int m = scan.nextInt();
        int[] tablicaB = new int[m];
        if (n != m) {
            System.out.println("BLAD");
        } else {
            System.out.println("Podaj elementy tablicy B: ");
            for (int i = 0; i < m; i++) {
                tablicaB[i] = scan.nextInt();
            }
        }

        int Skalar = 0;
        for (int i = 0; i < Math.min(n, m); i++) {
            Skalar += tablicaA[i] * tablicaB[i];
        }

        System.out.println("Iloczyn skalarny tablic A i B wynosi: " + (Skalar));
    }

    public static void Zad8() {
        Scanner scan = new Scanner(System.in);
        float n;
        do {
            System.out.println("Podaj liczbę naturalną n: ");
            n = scan.nextFloat();
        } while (n < 0);
        if (n >= 0) {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
            System.out.println("***");
            System.out.println(" **");
            System.out.println("  *");
            System.out.println("  *");
            System.out.println(" **");
            System.out.println("***");
        }
    }

    public static void Zad9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz slowo zeby sprawdzic czy jest plaindromem: ");
        String slowo = scan.nextLine();

        
        
        if (palindrom(slowo)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    static boolean palindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void Zad10() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe wierszy: ");
        int W = scan.nextInt();
        System.out.print("Podaj liczbe kolumn: ");
        int K = scan.nextInt();

        if (W <= 0 || K <= 0) {
            System.out.println("BLAD");
            return;
        }

        int[][] macierz = new int[W][K];

        System.out.println("Podaj " + (W) * (K) + " liczb:");
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < K; j++) {
                macierz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Transpozycja macierzy:");
        for (int j = 0; j < K; j++) {
            for (int i = 0; i < W; i++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }

   

    public static void Zad12() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe planety na ktorej chcesz poznac swoj wiek: ");
        String planety = scan.nextLine();
        System.out.println("Podaj wiek w sekundach: ");
        int x = scan.nextInt();

        switch (planety) {
            case "ziemia":
            double wynik = (Math.round((x / 31557600)*100));
                System.out.println("Na ziemi masz: " + (wynik/100) + "lat");
                break;
            case "merkury":
            double a = ((Math.round(((x / 31557600) / 0.2408467) * 100)));
                System.out.println("Na merkurym masz: " + (a/100) + "lat");
                break;
            case "wenus":
            double b = ((Math.round(((x / 31557600) / 0.61519726) * 100)));
                System.out.println("Na wenus masz: " + (b/100) + "lat");
                break;
            case "mars":
            double c = ((Math.round(((x / 31557600) / 1.8808158) * 100)));
                System.out.println("Na mars masz: " + (c/100) + "lat");
                break;
            case "jowisz":
            double d = ((Math.round(((x / 31557600) / 11.862615) * 100)));
                System.out.println("Na jowisz masz: " + (d/100) + "lat");
                break;
            case "satrun":
            double e = ((Math.round(((x / 31557600) / 29.447498) * 100)));
                System.out.println("Na saturn masz: " + (e/100) + "lat");
                break;
            case "uran":
            double f = ((Math.round(((x / 31557600) / 84.016846) * 100)));
                System.out.println("Na uran masz: " + (f/100) + "lat");
                break;
            case "neptun":
            double g = ((Math.round(((x / 31557600) / 164.79132) * 100)));
                System.out.println("Na nepturn masz: " + (g/100) + "lat");
                break;
            default:
                System.out.println("BLAD");
        }
    }
    public static void Zad13() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Podaj rozmiar tablicy: ");
        int rozmiar = scan.nextInt();
        
        int[] a = new int[rozmiar];
        
        System.out.println("Podaj liczby w tablicy: ");
        for (int i = 0; i < rozmiar; i++) {
            a[i] = scan.nextInt();
        }
        int naj = findMax(a, rozmiar);
        System.out.println("Najwiekszy liczba w tablicy to: " + (naj));
    }
    
    public static int findMax(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }
        int naj = findMax(a, n - 1);
        return Math.max(naj, a[n - 1]);
    }
    public static void Zad14() {
        System.out.println("Hello world!");
        /*Użyłem tego na prostym przykładzie. 
        Skompilowałem go za pomocą polecenia 
        "javac src/Main.java" w terminalu, a 
        następnie uruchomiłem program za pomocą 
        polecenia "java src/Main" również w terminalu.
        Program wyświetlił napis "Hello, World!". */
      }
      public static void Zad15() {
        System.out.println("15 zdanie zostanie zrobione, jeśli wykładowca otrzyma-");
        System.out.println("link do Git.Huba z moimi zadaniami.");
}
}



