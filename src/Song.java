import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Song {

    public void printSong(PrintStream out) throws FileNotFoundException {



        for (int day = 1; day <= 12; day++) {
            //PrintStream out = new PrintStream(new File("sangtekst.txt")); //variabel blev oprettet automatisk da højreklik på system.out -> refactor ->
            out.print("On the "); //introduce variable -> for all 20 -> out. Variabel kan lægges som attribut
            out.print(day); //så laver den PrintStream out = System.out. Det skal ændres til at være
            //printstream new File("txt").
            //printstream objekt blev senere lavet i main og gives som parameter når song klassen kaldes

            switch (day) {
                case 1 ->  out.print("st");
                case 2 ->  out.print("nd");
                case 3 ->  out.print("rd");
                default -> out.print("th");
            }

            out.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12: out.println("Twelve drummers drumming,"); //switch lavet med kolon?
                case 11: out.println("Eleven pipers piping,"); // pga ingen break så udskriver den alt der
                case 10: out.println("Ten lords a leaping,"); //kommer efter den valgte case fordi der ikke
                case 9:  out.println("Nine ladies dancing,"); //breakes. Kan kun gøres med den gamle switch
                case 8:  out.println("Eight maids a milking,"); //ikke med lambda switch
                case 7:  out.println("Seven swans a swimming,");
                case 6:  out.println("Six geese a laying,");
                case 5:  out.println("Five golden rings,");
                case 4:  out.println("Four calling birds,");
                case 3:  out.println("Three French hens,");
                case 2:  out.println("Two turtle doves, and");
                default: out.println("A partridge in a pear tree.");
            }

            out.println();
        }
    } // System.err er til servere hvor man ikke har en skærm. til at hente fejl?


    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("sangtekst2.txt"));
        Song song = new Song();
        song.printSong(out);

        System.out.println("færdig"); //det her bliver åbenbart lagt inde i filen fordi alt efter sout(prinstream)
        //lægges i filen. Så man kan ikke udskrive det på skærmen

        //System.setOut(new PrintStream(new File("sangtekst.txt"))); //den skriver hvad der er i filen
        //forfra hver gang? Hvis der allerede stod noget i filen slettes det.
        //PrintStream kan være her som attribut men kan også være i main
        //det her var det der stod i starten af klassen^^

        //System.setOut(new PrintStream(new File("sangtekst.txt")));

        // PrintStream ps = new PrintStream(new File("txt"));

        //ved at gøre dette kan man stadig bruge normale sout frem for at alt lægges i filen


    }
}
