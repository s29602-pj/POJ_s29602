public class Main2 {

    public static void main(String[] args) {

        // Zad1();
        // Zad2();
        // Zad3();
        // Zad4();
        // Zad5();
        // Zad6();

    }
    // Autor:Marcin Pietraszek,Marcin Kunert,Bartosz Dembowski
    /*
     * Na początku storzylem trzy obiekty gdzie mozna zmieniac kolor i wartosc oraz
     * nastepnie mozna je wyswietlic w konsoli. Tworzę enum dla przechowywania
     * wartosci i koloru czyli typ wyliczeniowy został użyty, tworzymy klase
     * pojedyncza karte z talii z prywatnym kolorem i wartoscia, tworzymy
     * konstruktor ktory bedzie tworzyl obiekty,Nastepnie stworzylym
     * getkolor,getwartosc i tostring, ktore nie jest potrzebne ale czytalem ze
     * dobrze sie przyzwyczajac do tych metod dla innych zadan kolejnych.
     */

    public static void Zad1() {
        Karta karta1 = new Karta(kolor.Kier, wartosc.Dama);
        Karta karta2 = new Karta(kolor.Karo, wartosc.AS);
        Karta karta3 = new Karta(kolor.Pik, wartosc.Cztery);

        System.out.println(karta1);
        System.out.println(karta2);
        System.out.println(karta3);
    }

    public enum kolor {
        Kier, Karo, Pik, Trefl
    };

    public enum wartosc {
        Dwa, Trzy, Cztery, Piec, Szesc, Siedem, Osiem, Dziewiec, Dziesiec, Walet, Dama, Krol, AS
    };

    public static class Karta {
        private kolor kolor;
        private wartosc wartosc;

        public Karta(kolor kolor, wartosc wartosc) {
            this.kolor = kolor;
            this.wartosc = wartosc;
        }

        public kolor getkolor() {
            return kolor;
        }

        public wartosc getwartosc() {
            return wartosc;
        }

        public String toString() {
            return wartosc + "|" + kolor;
        }
    }

    // Autor:Vasyl Malik,Marcin Kunert,Bartosz Dembowski
    /*
     * Na poczatku stworzylem trzy obiekty gdzie mozna zmieniac imie,nazwisko,numer
     * indeksu,ocene i obecnosc w ostatnim obiekcie dzieki metodzie get/set w
     * ostatnim obiekcie mozna je dodać.Nastepnie mamy wersy ktore pokazuja nam sie
     * w terminalu. Tworze klase student i tworze dwa konstruktory do dwoch
     * przypadkow
     * z imieniem i nazwiskiem oraz bez gdzie bedzie wpisywane slowo unknow.Pozniej
     * zostaje nam juz tylko zaprogramowanie metody get i set oraz dodanie warunku
     * ktory sprawdza obecnosc
    
     */

    public static void Zad2() {

        Student student1 = new Student("Jan", "Kowalski", "123456", 4, 75);
        Student student2 = new Student("Anna", "Nowak", "123457", 3, 40);
        Student student3 = new Student("123458", 5, 90);
        // student3.setImie("Gosia");
        // student3.setNazwisko("Przybylska");

        System.out.println("Student 1:");
        System.out.println("Imię: " + student1.getImie());
        System.out.println("Nazwisko: " + student1.getNazwisko());
        System.out.println("Numer indeksu: " + student1.getNumerIndeksu());
        System.out.println("Ocena z POJ: " + student1.getOcena());
        System.out.println("Obecność: " + student1.getObecnosc() + "%");
        System.out.println("Ocena końcowa: " + student1.ocenaKoncowa());

        System.out.println("Student 2:");
        System.out.println("Imię: " + student2.getImie());
        System.out.println("Nazwisko: " + student2.getNazwisko());
        System.out.println("Numer indeksu: " + student2.getNumerIndeksu());
        System.out.println("Ocena z POJ: " + student2.getOcena());
        System.out.println("Obecność: " + student2.getObecnosc() + "%");
        System.out.println("Ocena końcowa: " + student2.ocenaKoncowa());

        System.out.println("Student 3:");
        System.out.println("Imię: " + student3.getImie());
        System.out.println("Nazwisko: " + student3.getNazwisko());
        System.out.println("Numer indeksu: " + student3.getNumerIndeksu());
        System.out.println("Ocena z POJ: " + student3.getOcena());
        System.out.println("Obecność: " + student3.getObecnosc() + "%");
        System.out.println("Ocena końcowa: " + student3.ocenaKoncowa());
    }

    public static class Student {
        String imie;
        String nazwisko;
        String numerIndeksu;
        int ocena;
        double obecnosc;

        public Student(String imie, String nazwisko, String numerIndeksu, int ocena, double obecnosc) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.numerIndeksu = numerIndeksu;
            this.ocena = ocena;
            this.obecnosc = obecnosc;
        }

        public Student(String numerIndeksu, int ocena, double obecnosc) {
            this.imie = "Unknown";
            this.nazwisko = "Unknown";
            this.numerIndeksu = numerIndeksu;
            this.ocena = ocena;
            this.obecnosc = obecnosc;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public String getNumerIndeksu() {
            return numerIndeksu;
        }

        public void setNumerIndeksu(String numerIndeksu) {
            this.numerIndeksu = numerIndeksu;
        }

        public int getOcena() {
            return ocena;
        }

        public void setOcena(int ocena) {
            this.ocena = ocena;
        }

        public double getObecnosc() {
            return obecnosc;
        }

        public void setObecnosc(double obecnosc) {
            this.obecnosc = obecnosc;
        }

        public int ocenaKoncowa() {
            if (obecnosc < 50) {
                return 2;
            } else {
                return ocena;
            }
        }

    }

    // Autor:Marcin Kunert,Elon Musk,Bartosz Dembowski
    /*
     * Na poczatku stworzylem jeden obiekt w ktorym dzieki metodzie get/set mozna
     * ustawiac rok,miesiac i dzien wywolywana jest tam takze metoda displayDate.
     * Tworze klase Mydate oraz konstruktor, ktory sprawdza poprawnosc wpisanego
     * miesiaca,dnia i roku.Nastepnie dodajen metode get/set jednak teraz do
     * metody set dodaje warunek ktory sprawdz poprawnosc daty.Na koncu mamy metode
     * displayData ktora powoduje wyswietlanie daty. Zostal tam uzyty % ktory
     * powoduje ze wartosc jest liczba, literka d powoduje ze liczba jest calkowita,
     * liczba 02 oznacza ze liczba musi zajmowac dwa miejsca z zerami na poczatku.
     * W roku tak samo uzylem 04 chodz uwazam ze jest raczej nie potrzebne
     
     */
    public static void Zad3() {
        MyDate date = new MyDate(3, 21, 2051);
        date.setMiesiac(12);
        date.setDzien(31);
        date.setRok(21);
        date.displayData();
    }

    public static class MyDate {
        int miesiac;
        int dzien;
        int rok;

        public MyDate(int miesiac, int dzien, int rok) {
            if (miesiac < 1 || miesiac > 12) {
                System.out.println("Nie istnieje taki miesiąc. Podaj miesiąc pomiędzy 1-12");
            }
            if (dzien < 1 || dzien > 31) {
                System.out.println("Nie istnieje taki dzien. Podaj dzien pomiędzy 1-31");
            }
            if (rok < 1990 || rok > 2050) {
                System.out.println("Nie istnieje taki rok. Podaj rok pomiędzy 1990-2050");
            }
            this.miesiac = miesiac;
            this.dzien = dzien;
            this.rok = rok;
        }

        public int getMiesiac() {
            return miesiac;
        }

        public int getDzien() {
            return dzien;
        }

        public int getRok() {
            return rok;
        }

        public void setMiesiac(int miesiac) {
            if (miesiac < 1 || miesiac > 12) {
                System.out.println("Nie istnieje taki miesiąc. Podaj miesiąc pomiędzy 1-12.");
            }
            this.miesiac = miesiac;
        }

        public void setDzien(int dzien) {
            if (dzien < 1 || dzien > 31) {
                System.out.println("Nie istnieje taki dzien. Podaj dzien pomiędzy 1-31");
            }
            this.dzien = dzien;
        }

        public void setRok(int rok) {
            if (rok < 1990 || rok > 2050) {
                System.out.println("Nie istnieje taki rok. Podaj rok pomiędzy 1990-2050");
            }
            this.rok = rok;
        }

        public void displayData() {
            System.out.printf("%02d/%02d/%04d", miesiac, dzien, rok);
        }
    }

    // Autor:Marcin Kunert, Przemysław Kruglej,Bartosz Dembowski
    /*
     * Na poczatku stworzylem trzy obiekty czasowe, w ktorym mozemy ustawiac czas
     * gdy nic nie wpiszemy ustawiony jest zegar na 12:00:00 mozemy uzyc metod
     * set/get zeby ustawic czas lub wywolac tick/tickDown ktory podnosi llub
     * zmieniejsza liczbe o jedna sekunde. Nastepnie po klasie Clock tworzymy 3
     * konstruktory:pierwszy mamy ustawiona godzine 12:00:00 gdy nie ustawimy wogole
     * zadnej godziny tworzac nowy obiekt czasowy bedzie nam sie ta godzina
     * wyswietlala,drugi konstruktor dziala od tego jezeli bedziemy chcieli wpisac
     * jakas godzine jak podano w drugim zegarze,trzeci konstruktor zawiera tylko
     * sekundy przez co musimy dzielic i rozdzielac calosci do poszczegolnych lini,
     * użyty tam został procent ktory odziela reszte z dzielenia. Nastepnie dodajemy
     * metode set/get oraz dwie metody tick/tickDown ktore pozwalaja nam zmieniac
     * czas o 1 sekunde w gore lub w dol.Polega to na tym ze program sprawdza jaka
     * jest liczba sekund i jezeli jest 59 to zmienia na 00 lub na odwrot i sprawdza
     * nastepnie minute jezeli jest to jakas liczba pomiedzy poprostu dodaje o jeden
     * w gore lub dol. Na koncu mamy metode toString ktora zwraca nam czas w formie
     * HH/MM/SS.
     *
     */
    public static void Zad4() {
        Clock clock1 = new Clock();
        System.out.println(clock1.toString());

        Clock clock2 = new Clock(6, 30, 45);
        System.out.println(clock2.toString());

        Clock clock3 = new Clock(3661);
        System.out.println(clock3.toString());

        clock1.tick();
        System.out.println(clock1.toString());

        clock1.tickDown();
        System.out.println(clock1.toString());

        clock2.setMinutes(50);
        clock2.tick();
        System.out.println(clock2.toString());
    }

    public static class Clock {
        int hours;
        int minutes;
        int seconds;

        public Clock() {
            this.hours = 12;
            this.minutes = 0;
            this.seconds = 0;
        }

        public Clock(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public Clock(int poPolnocy) {
            this.hours = poPolnocy / 3600;
            this.minutes = (poPolnocy % 3600) / 60;
            this.seconds = poPolnocy % 60;
        }

        public int getHours() {
            return this.hours;
        }

        public int getMinutes() {
            return this.minutes;
        }

        public int getSeconds() {
            return this.seconds;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        public void tick() {
            if (this.seconds < 59) {
                this.seconds++;
            } else {
                this.seconds = 0;
                if (this.minutes < 59) {
                    this.minutes++;
                } else {
                    this.minutes = 0;
                    if (this.hours < 23) {
                        this.hours++;
                    } else {
                        this.hours = 0;
                    }
                }
            }
        }

        public void tickDown() {
            if (this.seconds > 0) {
                this.seconds--;
            } else {
                this.seconds = 59;
                if (this.minutes > 0) {
                    this.minutes--;
                } else {
                    this.minutes = 59;
                    if (this.hours > 0) {
                        this.hours--;
                    } else {
                        this.hours = 23;
                    }
                }
            }
        }

        public String toString() {
            return String.format("[%02d:%02d:%02d]", this.hours, this.minutes, this.seconds);
        }
    }

    // Autor:Marcin Gawle ,Marcin Kunert,Bartosz Dembowski
    /*
     * Na poczatku tworze obiekt z 3 liczbami calkowitymi oraz wywoluje wyniki dla
     * kazdego dzialania. nastepnie tworze klase Numbers oraz konstruktor dla
     * niej.Dodaje metody dodawania,sredniej arytmetycznej ale double poniewaz moze
     * zostac wynik po przecinku,ajmniejszej oraz najwiekszej gdzie trzeba uzyc jej
     * dwa razy poniewaz dziala ona tylko na dwie liczby oraz srednia geometryczna
     * gdzie zmieniamy takze na double poniewaz z pierwiastkowania szesciennego moze
     * zostac wynik po przecinku.
     */
    public static void Zad5() {
        Numbers liczby = new Numbers(5, 9, 1);
        System.out.println("Suma: " + liczby.sum());
        System.out.println("Srednia arytmetyczna: " + liczby.average());
        System.out.println("Najmnijesza: " + liczby.min());
        System.out.println("Najwieksza: " + liczby.max());
        System.out.println("Srednia geometryczna: " + liczby.geometric());
    }

    public static class Numbers {
        int liczba1;
        int liczba2;
        int liczba3;

        public Numbers(int liczba1, int liczba2, int liczba3) {
            this.liczba1 = liczba1;
            this.liczba2 = liczba2;
            this.liczba3 = liczba3;
        }

        public int sum() {
            return liczba1 + liczba2 + liczba3;
        }

        public double average() {
            return (liczba1 + liczba2 + liczba3) / 3;
        }

        public int min() {
            return Math.min(Math.min(liczba1, liczba2), liczba3);
        }

        public int max() {
            return Math.max(Math.max(liczba1, liczba2), liczba3);
        }

        public double geometric() {
            return Math.cbrt(liczba1 * liczba2 * liczba3);
        }
    }

    // Autor:Marcin Kunert,Bartosz Dembowski
    /*
     * Tworze obiekt faktura z 5 informacjami oraz wywoluje wywoluje ich dane.
     * Nastepnie tworze klase Invoice,konstruktor oraz metode set/get dla kazdej
     * zmiennej, w ostatniej metodzie getAmount daje warunek.
     */
    public static void Zad6() {
        Invoice faktura = new Invoice("954832", "Produkt mydlo", 2, 13.80);

        System.out.println("Numer produktu: " + faktura.getProduct_number());
        System.out.println("Opis produktu: " + faktura.getProduct_description());
        System.out.println("Ilosc: " + faktura.getQuantity());
        System.out.println("Cena za sztukę: " + faktura.getPricePerItem());
        System.out.println("Kwota: " + faktura.getAmount());

        faktura.setQuantity(14);
        faktura.setPricePerItem(17);

        System.out.println("Nowa ilosc: " + faktura.getQuantity());
        System.out.println("Nowa cena za sztuke: " + faktura.getPricePerItem());
        System.out.println("Nowa kwota: " + faktura.getAmount());
    }

    public static class Invoice {
        String product_number;
        String product_description;
        int quantity;
        double pricePerItem;

        public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
            this.product_number = product_number;
            this.product_description = product_description;
            this.quantity = quantity;
            this.pricePerItem = pricePerItem;
        }

        public String getProduct_number() {
            return product_number;
        }

        public void setProduct_number(String product_number) {
            this.product_number = product_number;
        }

        public String getProduct_description() {
            return product_description;
        }

        public void setProduct_description(String product_description) {
            this.product_description = product_description;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPricePerItem() {
            return pricePerItem;
        }

        public void setPricePerItem(double pricePerItem) {
            this.pricePerItem = pricePerItem;
        }

        public double getAmount() {
            if (quantity <= 0 || pricePerItem <= 0) {
                return 0;
            } else {
                return quantity * pricePerItem;
            }
        }
    }
}
