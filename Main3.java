import java.util.Scanner;


/*Tworze obiekt sejf gdzie ustalam poprawny PIN nastepnie prosze uzytkownika o wpisanie PINU gdzie pin jest przekazywany do enterPin.Kolejnie tworze klase sejf gdzie w  drugim zadaniu musialem dodac rejestrator do klasy oraz tworze konstruktor. Nastepnie dodaje metode unlock w ktorej jest warunek sprawdzajacy poprawnosc pinow jezeli jest poprawny to odblokowuje dostep do sejfu jezeli PIN sie nie zgadza wywoluje metode trigger ktora wywoluje alram i blokuje dostep do sejfu.Dodam tylko ze zostały tam jeszcze rejestratory zdarzen ktore daja nam opcje kture mozna zminic bo sa enumeracyjne.Wywolujac klase alram wyswietlaja nam sie rozne poziomy ochrony sejfu, ktore mozna wlaczyc usuwajac napisy.Kolejnie tworze klase PinEvent ktora przechowuje nasz wpisany PIN z wpisanyPin oraz konstruktor.W zadaniu drugim trzeba było dodac rejestrator ktory zawiera dwa typy wyliczeniowe Severity oraz EventSource. Nastepnie dodaje metode log z interfejsu Logger.Kolejnie tworze dwie klasy zeby wypisac uzytkownika i rodzaj problemu.*/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zad1();
    }

    public static void Zad1() {
        Sejf sejf = new Sejf("1111");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz PIN: ");
        String wpisanyPin = scanner.nextLine();

        sejf.unlock(wpisanyPin);

        
    }

    public static class Sejf {
        private String pin;
        private boolean locked;
        private Alarm alarm;
        private Logger logger;

        public Sejf(String pin) {
            this.pin = pin;
            this.locked = true;
            this.alarm = new Alarm();
            this.logger = new ConsoleLogger();
        }

        public void unlock(String enteredPin) {
            if (enteredPin.equals(pin)) {
                locked = false;
                System.out.println("Sejf jest otwarty");
                logger.log(Logger.Severity.Informacja, Logger.EventSource.Uzytkownik, "Sejf zostal otwarty");
            } else {
                alarm.trigger(new PinEvent(enteredPin));
                logger.log(Logger.Severity.Blad, Logger.EventSource.System, "Podano bledny PIN");
            }
        }
    }

    public static class Alarm {
        public void trigger(PinEvent event) {
        System.out.println("ALARM");
        System.out.println("Firma ochroniarska już jedzie!!!");
        //System.out.println("Kraty w całym pomieszczeniu zostały zamknięte!!!");
        //System.out.println("Psy zostały wypuszczone!!!");
        //System.out.println("Włączył się alarm!!!");
            

        }
    }

    public static class PinEvent {
        private String wpisanyPin;

        public PinEvent(String wpisanyPin) {
            this.wpisanyPin = wpisanyPin;
        }
    }

    public interface Logger {
        public enum Severity {
            Informacja,
            Blad,
            Uwaga,
            
        }

        public enum EventSource {
            Uzytkownik,
            System,
        
        }

        public void log(Severity severity, EventSource eventSource, String tekst);
    }

    public static class FileLogger implements Logger {
        private String nazwaPliku;

        public FileLogger(String nazwaPliku) {
            this.nazwaPliku = nazwaPliku;
        }

    }

    public static class ConsoleLogger implements Logger {
        public void log(Severity severity, EventSource eventSource, String tekst) {
            System.out.println(severity.name() + " " +  eventSource.name() +":" + " " + tekst);
        }
    }
}