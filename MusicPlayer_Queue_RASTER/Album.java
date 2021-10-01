
/**
 * Eine Album ist eine Liste von Liedern.
 * 
 * @author 
 * @version 1
 */
public class Album
{
    private Lied meinLied;
    private Lied[] lied;
    /**
     * Konstruktor für Objekte der Klasse Album
     */
    public Album(String pTitel, String pInterpret, int pDauer, int pAnzahlLieder)
    {
        waehleAlbum(pTitel, pInterpret, pDauer, pAnzahlLieder);
    }

    public void waehleAlbum(String pTitel, String pInterpret, int pDauer, int pAnzahlLieder){

    }

    /**
     * Wenn das Album nicht leer ist, gibt die Methode liedAbspielen auf der 
     * Konsole das erste Lied in dem Album. Ansonsten wird ein Hinweis 
     * ausgegeben, dass das Album leer ist.
     *
     */
    public void liedAbspielen(){
        System.out.println(lied[0]+"wird abgespielt");
    }

    /**
     * Die Methode gibAnzahlLieder gibt die Anzahl der Lieder in dem Album. 
     * Inhalt und Reihenfolge dem Album dürfen dabei nicht veraendert werden.
     *
     * @return Der Rückgabewert
     */
    public int gibAnzahlLieder(){
        int p = 0;
        for(int i = 0; i <lied.length; i++){
            p++;
        }        
        return p;
    }
}
