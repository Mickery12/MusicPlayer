
/**
 * Beschreiben Sie hier die Klasse Album.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Album
{
    // Anfang Attribute
    private String name;
    private String interpret;
    private int dauer;
    private int anzahl;

    public Album(String name, String interpret, int dauer, int anzahl)
    {
        this.name = name;
        this.interpret = interpret;
        this.dauer = dauer;
        this.anzahl = anzahl;
    }

    public String toString()
    {
        return "Album: " + name + " von " + interpret + " (" + dauer + " Minuten, " + anzahl + " Titel)";
    }

}