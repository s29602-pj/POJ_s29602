import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        
        //Zad1();
         //Zad2();
         //Zad3();
         //Zad4();
        //Zad5();
        Zad6();
    }
/*Opis:W pierwsze zadaniu uzylem implementacji TreeSet<Integer oraz storzylem obiekt ktory uporzadkowuje liczby od najmniejszej do najwiekszej nastepnie prosze o podanie liczb i gdy skonczymy o wpisanie z(mozemy uzyc kazdego innego znaku ktory nie jest liczba całkowita). Nastepnie mamy petle while ktora własnie tworzy nam ta zależnosc do wypisywania tylko liczb i ktora konczy swoje działanie gdy nie bedziemy ich juz wpisywac dodadjac wszystkie liczby do zbioru 'liczba'.Na koniec pokazuje nam posortowany zbior bez duplikatow gdzie została uzyta petla ktora pokazuje nam w terminalu liczby.*/
    public static void Zad1() {
        Scanner scan = new Scanner(System.in);
        Set<Integer> liczby = new TreeSet<>();
    
        System.out.println("Podaj liczby (wpisz z aby zakończyć):");
    
        while (scan.hasNextInt()) {
            int liczba = scan.nextInt();
            liczby.add(liczba);
        }
    
        System.out.println("Posortowany zbiór od najmniejszej do najwiekszej:");
    
        for (int liczba : liczby) {
            System.out.println(liczba);
        }
    }
/*Opis:W drugim zadani także uzylem implemetacji ale tym razem HashSet poniewaz nie potrzebuje posortowanych elementów tworzac dwa obiekty poniewaz beda dwa zbiory i prosze odbiorece o podanie zbiorow.Nastepnie mamy dzielenie liczb  dzieki split ktory odziela liczby spacja i dodaje je do zbioru.Kolejnie tworze dwie petle do tych dzialan na zbiorach oraz wyswietlam wynik.*/
public static void Zad2() {
    Scanner scanner = new Scanner(System.in);
    Set<Integer> ZbiorA = new HashSet<>();
    Set<Integer> ZbiorB = new HashSet<>();

    System.out.print("Podaj elementy pierwszego zbioru, oddzielone spacją: ");
    String Zbior1 = scanner.nextLine();
    System.out.print("Podaj elementy drugiego zbioru, oddzielone spacją: ");
    String Zbior2 = scanner.nextLine();

    
    for (String liczby : Zbior1.split(" ")) {
        ZbiorA.add(Integer.valueOf(liczby));
    }
    for (String liczby : Zbior2.split(" ")) {
        ZbiorB.add(Integer.valueOf(liczby));
    }

    
    Set<Integer> wynik = new HashSet<>();
    for (Integer liczby : ZbiorA) {
        if (!ZbiorB.contains(liczby)) {
            wynik.add(liczby);
        }
    }
    for (Integer liczby : ZbiorB) {
        if (!ZbiorA.contains(liczby)) {
            wynik.add(liczby);
        }
    }

    
    System.out.println("Wynik operacji (A - B) \\ (B - A): " + wynik);
}
/*Opis:W trzecim zadaniu prosze o wprowadzenie ciagu znakow i przypisuje go do zminnej zdanie i slowa przypisane do zminnej 'zdanie' zostaja sprawdzona oraz usuniete wszystkie znaki ktore nie sa literami oraz spacjami dzieki tej negacji ^ a toLowerCase zmniejsza wszytskie litery na male. Nestepnie stosuje znowu split ktory odziela slowa dzieki spacji i dzieki s+ mamy dowolna ilosc spacji. Tworze obiekt mapy ktora bedzie przechowywala zliczenia wystapien poszczegolnych slow.Na koncu mamy petle ktora podlicza slowa i przechowuje w mapie.*/
public static void Zad3() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Wprowadź ciąg znaków: ");
    String zdanie = scanner.nextLine();

    zdanie = zdanie.replaceAll("[^a-zA-Z ]", "").toLowerCase();

    String[] slowa = zdanie.split("\\s+");

    Map<String, Integer> liczbaS = new TreeMap<>();

    for (String slowo : slowa) {
        if (liczbaS.containsKey(slowo)) {
            int count = liczbaS.get(slowo);
            liczbaS.put(slowo, count + 1);
        } else {
            liczbaS.put(slowo, 1);
        }
    }

    
    System.out.println("Dane wyjściowe: " + liczbaS);
}
/*Opis:W czwartym zadaniu tworze tablice z wynikami z testow oraz tworze obiekt punkty i obliczam srednia wytnikow testu .Nastepnie tworze klase PunktyTest oraz konstruktor do niego i tworze petle ktora bedzie sprawdzla wyniki.Działanie zaczynamy od zminnej suma ktora jest 0 nastepnie tworzymy petle do kazdego elementu punkt z tablicy punkty dodawana jest wartosc do zminnej suma warunkiem sprawdzamy czy miesci sie od 0 do 100 jezeli nie wyrzuca blad jezeli tak oblicza nam srednia.*/

public static void Zad4() {
    Scanner scanner = new Scanner(System.in);
    int[] punktyTest = { 90, 10, 95, 78, 87 };

    PunktyTest punkty = new PunktyTest(punktyTest);

    double wynik = punkty.Obliczenia();

    System.out.println("Średnia wyników z testu: " + wynik);
}

public static class PunktyTest {
     int[] punkty;

    public PunktyTest(int[] punkty) {
        this.punkty = punkty;
    }

    public double Obliczenia() {
        int suma = 0;
        for (int punkt : punkty) {
            if (punkt < 0 || punkt > 100) {
                throw new IllegalArgumentException("Złe podane punkty: " + punkt);
            }
            suma += punkt;
        }
        return (double) suma / punkty.length;
    }
}

/*Opis:Na poczatku mamy petle ktora pozwala nam na tylko 3 chomiki nastepnie petle ktora sprawda poprawnosc identyfikatora a nastepna petla sprawdza poprawnosc imiona.
Tworze nowy obiekt oraz konstruktor i slowo klucz do mapy oraz do kluczy.Nastepnie tworzymy klase homik oraz dodaje get/set i na koniec tworze klase Printer gdzie 
PrintAll służy do wyswietlenia wszystkich informacji o chomikach.*/
/*public static void Zad5() {
    Map<String, Hamster> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
        String imie;
        int identyfikator;
        
        while (true) {
            try {
                System.out.print("Podaj identyfikator: ");
                identyfikator = scanner.nextInt();
                scanner.nextLine(); 
                
                if (identyfikator < 0) {
                    throw new IllegalArgumentException("Identyfikator nie może być ujemny");
                }
                
                break; 
            } catch (Exception e) {
                System.out.println("Nieprawidłowe dane. Spróbuj ponownie.");
                scanner.nextLine(); 
            }
        }
        
        while (true) {
            try {
                System.out.print("Podaj imię: ");
                imie = scanner.nextLine();
                
                if (imie.isEmpty()) {
                    throw new IllegalArgumentException("Imię nie może być puste");
                }
                
                break; 
            } catch (Exception e) {
                System.out.println("Nieprawidłowe dane. Spróbuj ponownie.");
            }
        }
        
        Hamster hamster = new Hamster(identyfikator);
        hamster.setImie(imie);
        map.put(imie, hamster);
    }

    Printer.printAll(map);

    
    for (String imie : map.keySet()) {
        System.out.println("Klucz: " + imie);
    }
}


static class Hamster {
    private int hamsterNumber;
    private String imie;

    Hamster(int i) {
        hamsterNumber = i;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String hamsterNumber() {
        return "To jest chomik numer " + hamsterNumber;
    }
}

static class Printer {
    static void printAll(Map<String, Hamster> map) {
        for (String imie : map.keySet()) {
            Hamster hamster = map.get(imie);
            System.out.println(hamster.hamsterNumber() + ", Imie: " + hamster.getImie());
        }
    }
}
}*/

/*Opis:wszytsko tak samo jak w piatym oprocz tego ze mamy teraz mozliwosc przegladac zawartosc printAll uzywajac interatora,metody usuwania z listy za uzyciem iteratora 274(uzycie!) oraz caly system 290 wersy oraz metode sortowania w 280 oraz 301 wersie ogolnie wiekszosc bez zmian w porownaniu do 5 zadania.*/
   public static void Zad6() {
   
    Map<String, Hamster> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
        String imie;
        int identyfikator;

        while (true) {
            try {
                System.out.print("Podaj identyfikator: ");
                identyfikator = scanner.nextInt();
                scanner.nextLine(); 

                if (identyfikator < 0) {
                    throw new IllegalArgumentException("Identyfikator nie może być ujemny");
                }

                break; 
            } catch (Exception e) {
                System.out.println("Nieprawidłowe dane. Spróbuj ponownie.");
                scanner.nextLine(); 
            }
        }

        while (true) {
            try {
                System.out.print("Podaj imię: ");
                imie = scanner.nextLine();

                if (imie.isEmpty()) {
                    throw new IllegalArgumentException("Imię nie może być puste");
                }

                break; 
            } catch (Exception e) {
                System.out.println("Nieprawidłowe dane. Spróbuj ponownie.");
            }
        }

        Hamster hamster = new Hamster(identyfikator);
        hamster.setImie(imie);
        map.put(imie, hamster);
    }

    Printer.printAll(map);

    
    Iterator<String> iterator = map.keySet().iterator();
    while (iterator.hasNext()) {
        String imie = iterator.next();
        System.out.println("Klucz: " + imie);
    }

    
    removeUsingIterator(map, "Chomiczek A"); 

    System.out.println("Mapa po usunięciu:");
    Printer.printAll(map);

    
    List<String> sortedKeys = new ArrayList<>(map.keySet());
    Collections.sort(sortedKeys);

    System.out.println("Posortowana mapa:");
    for (String key : sortedKeys) {
        System.out.println("Klucz: " + key + ", " + map.get(key).hamsterNumber() + ", Imie: " + map.get(key).getImie());
    }
}


static void removeUsingIterator(Map<String, Hamster> map, String key) {
    Iterator<Map.Entry<String, Hamster>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, Hamster> entry = iterator.next();
        if (entry.getKey().equals(key)) {
            iterator.remove();
            break;
        }
    }
}

static class Hamster implements Comparable<Hamster> {
    private int hamsterNumber;
    private String imie;

    Hamster(int i) {
        hamsterNumber = i;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String hamsterNumber() {
        return "To jest chomik numer " + hamsterNumber;
    }

  
   
}

static class Printer {
    static void printAll(Map<String, Hamster> map) {
        for (String imie : map.keySet()) {
            Hamster hamster = map.get(imie);
            System.out.println(hamster.hamsterNumber() + ", Imie: " + hamster.getImie());
        }
    }
}
}