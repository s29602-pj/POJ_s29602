//Autorzy:Bartosz Dembowski,Marcin Kunert,Vasyl Malik, Elon Musk

import java.util.ArrayList;

public class ParkMaszynowy {

    public static void main(String[] args) {
        Zad6();
    }

   
/*OPIS: Klasa głowna ParkMaszynowy nie wiem czy dobrze zrozumiałem to zadanie do kazdej klasy stworzyłem dwa obiekty a nastepnie zastosowałem ArrayList do stworzenia listy obiektów (uzywalismy tego w C++ w ubieglym semestrze) oraz dodałem je.
 * Potem stworzyłem petle która użyła danych podanych z maszyny(4) i je wyświetliła pod koniec użyłem metody set żeby zmienić
 * liczbę ostrzy w kosiarce oraz zeby wyswietliła dane kosiarki całej.*/
public static void Zad6() 
         {
        
        Kosiarka kosiarka1 = new Kosiarka("STIHL", "RM 248", 1.9, RodzajSilnika.BENZYNA, false, true, 2);
        Kosiarka kosiarka2 = new Kosiarka("Husqvarna", "Lawn Mower 64", 2.2, RodzajSilnika.DIESEL, true, false, 3);
        
        Lokomotywa lokomotywa1 = new Lokomotywa("PESA", "Gama", 12.7, RodzajSilnika.DIESEL, 0, 3);
        Lokomotywa lokomotywa2 = new Lokomotywa("Siemens", "Vectron", 13.5, RodzajSilnika.ELEKTRYCZNY, 1, 4);
        
        Pojazd pojazd1 = new Pojazd("Porshe", "911", 6.0, RodzajSilnika.BENZYNA, 600, 900);
        Pojazd pojazd2 = new Pojazd("Audi", "A7", 4.0, RodzajSilnika.HYBRYDOWY, 400, 720);


        Samochod samochod1 = new Samochod("BMW", "X5", 3.0, RodzajSilnika.DIESEL, 8, 200, Segment.A, "8DSGA8DF9SDF");
        
        Samochod samochod2 = new Samochod("Mazda", "6", 2.0, RodzajSilnika.BENZYNA, 378, 790, Segment.A, "NFDS7FDSAT8FA");
        

        Jednoslad jednoslad1 = new Jednoslad("Yamaha", "MT-07", 0.7, RodzajSilnika.BENZYNA, 55, 63, TypJednosladu.Motor);
        Jednoslad jednoslad2 = new Jednoslad("Romet", TypJednosladu.Rower);

            ArrayList<Maszyna> kolekcjaMaszyn = new ArrayList <Maszyna>();
            kolekcjaMaszyn.add(kosiarka1);
            kolekcjaMaszyn.add(kosiarka2);
            kolekcjaMaszyn.add(lokomotywa1);
            kolekcjaMaszyn.add(lokomotywa2);
            kolekcjaMaszyn.add(pojazd1);
            kolekcjaMaszyn.add(pojazd2);
            kolekcjaMaszyn.add(samochod1);
            kolekcjaMaszyn.add(samochod2);
            kolekcjaMaszyn.add(jednoslad1);
            kolekcjaMaszyn.add(jednoslad2);
        
            for (Maszyna maszyna : kolekcjaMaszyn) {
                maszyna.wyswietlInformacje();
                System.out.println();
            }
        
            
            kosiarka1.setLiczbaOstrzy(4);
            kosiarka1.wyswietl();
        }
}



//Zad1
/*OPIS:Stworzylem enumeracje rodzaji silników oraz abstrakcyjna klase maszyn chronionych i na tym chyba powinnienem skonczyć to zadanie jednak robiąc nastepne zadania chyba ułatwiłem sobie bo stworzyłem konstruktor oraz wyswietlanie dzieki temu moglem w innych zadaniach dziedzicząc klase maszyna ułatwić sobie robienie konstruktorow oraz wyswietlania.  */
enum RodzajSilnika {
    BENZYNA, DIESEL, ELEKTRYCZNY, HYBRYDOWY
}

abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;

    public Maszyna(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        
    }

    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " litrów");
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
    }
}



//Zad2
/*OPIS:Stworzylem klase Lokomotywa która dziedziczy z maszyny dodajac dwa prywatne atrybuty, a nastepnie konstruktor  gdzie uzylem super zeby wywołać atrybuty z maszyny.W wyswietlaniu takze uzylem super zeby wywołać wyswietlenie informacji z maszyny. */
class Lokomotywa extends Maszyna {
    private int liczbaWarsow;
    private int liczbaWagonow;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, int liczbaWarsow,
            int liczbaWagonow) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.liczbaWarsow = liczbaWarsow;
        this.liczbaWagonow = liczbaWagonow;
    }

    public void wyswietl() {
        super.wyswietlInformacje();
        System.out.println("Liczba warsów: " + liczbaWarsow);
        System.out.println("Liczba wagonów: " + liczbaWagonow);
    }
}



//Zad3
/*OPIS:Stworzylem klase Kosiarka, która dziedziczy z maszyny dodajac trzy prywatne atrybuty a nastepnie konstruktor gdzie ponownnie uzylem super zeby wywołac z maszyny atrybuty tak z samo jak wyswietlanie.Dodałem także metode set do dodanych atrybutów w tej klasie. */
class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
            boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        super.wyswietlInformacje();
        System.out.println("Czy ma melekser: " + czyMelekser);
        System.out.println("Czy ma napęd: " + czyNaped);
        System.out.println("Liczba ostrzy: " + liczbaOstrzy);
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }
}



//Zad4
/*OPIS:Stworzylem klase Pojazd, która dziedziczy z maszyny dodajac pięć atrybutów, a nastepnie konstruktor gdzie ponownnie uzylem super zeby wywołac z maszyny atrybuty oraz dodałem numer pojazdu zeby zwiekszał sie co jeden i maksymalnie do 50 tak z samo jak wyswietlanie. */
class Pojazd extends Maszyna {
    private static int maxLiczbaPojazdow = 50;
    private static int nrPojazdu = 1;
    protected double moc;
    protected double momentObrotowy;
    private int numer;

    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
            double moc, double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        this.numer = nrPojazdu;
        nrPojazdu++;
    }

     
    

    public void wyswietl() {
        System.out.println("Pojazd " + numer + " z " + maxLiczbaPojazdow + ":");
        super.wyswietlInformacje();
        System.out.println("Moc: " + moc);
        System.out.println("Moment obrotowy: " + momentObrotowy);
    }
}


//Zad5
/*OPIS:Stworzyłem enumeracje segmentowa samochodow utworzylem klase samochod dziedziczac z klasy pojazd dodajac 5 atrybutów musiałem dodać 3 te samo bo nie wiem czemu ale mi nie działały dwa nowe sa prywatne, a nastepnie utworzyłem konstruktor gdzie także używałem super żeby wywołać tym razem z klasy pojazd atrybuty tak samo przy wyswietlaniu.Stworzyłem enumeracje do typow jednosladu oraz klase jednoslad ktora także dziedziczy z klasy pojazd tworząc tym razem dwa konstruktory jeden z typem jednosladu z silnikiem a drugi gdy go nie ma np.rower, a nastepnie mamy warunek jeżeli jest nazwa to wypisuje wszytskie dane poniewaz posiada ta jednostka silnik a jezeli nie ma nazwy ozacza to pojazd bez silnika.*/
enum Segment {
    A, B, C, D, E, F, SUV
}
class Samochod extends Pojazd {
    private static int maxLiczbaPojazdow = 50;
    private static int nrPojazdu = 1;
    private Segment segment;
    private String VIN;
    private int numer;

    public Samochod(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
            double moc, double momentObrotowy, Segment segment, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
        this.numer = nrPojazdu;
        nrPojazdu++;
    }

    public void wyswietl() {
        System.out.println("Pojazd " + numer + " z " + maxLiczbaPojazdow + ":");
        super.wyswietlInformacje();
        System.out.println("Segment: " + segment);
        System.out.println("VIN: " + VIN);
    }

}

 enum TypJednosladu {
    Rower, Hulajnoga, Skuter, Motorower , Motor
}

class Jednoslad extends Pojazd {
    private static int maxLiczbaPojazdow = 50;
    private static int nrPojazdu = 1;
    private TypJednosladu typ;
    private int numer;
    

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
            double moc, double momentObrotowy, TypJednosladu typ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
        this.numer = nrPojazdu;
        nrPojazdu++;
    }

    public Jednoslad(String marka, TypJednosladu typ) {
        super(null, null, 0, null, 0, 0);
        this.marka = marka;
        this.typ = typ;
        this.numer = nrPojazdu;
        this.nazwa = null;
        nrPojazdu++;
    }
    

    public void wyswietl() {
        System.out.println("Pojazd " + numer + " z " + maxLiczbaPojazdow + ":");
        if (nazwa != null) {
            super.wyswietlInformacje();
            System.out.println("Typ: " + typ);}
             else {
              System.out.println("Nazwa: " + nazwa);
              System.out.println("Typ: " + typ);
            }
        }
    }
    

