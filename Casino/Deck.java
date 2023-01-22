/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck  
{
    private int kartennummer;
    private boolean eigene;
    private boolean imbesitz;
    
    public Deck(int kartentyp)
    {
            if (kartentyp <= 13) {
                kartennummer = kartentyp;
                if(kartentyp > 10) {
                    kartennummer = 10;
                }
            } else if (kartentyp <= 26) {
                kartennummer = kartentyp-13;
                if(kartentyp > 23) {
                    kartennummer = 10;
                }
            } else if (kartentyp <= 39) {
                kartennummer = kartentyp-26;
                if(kartentyp > 36) {
                    kartennummer = 10;
                }
            } else if (kartentyp <= 52) {
                kartennummer = kartentyp-39;
                if(kartentyp > 10) {
                    kartennummer = 10;
                }
            }
    }
    
    public void besitzaendern() {
        if (imbesitz == true) {
            imbesitz = false;
        } else {
            imbesitz = true;
        }
    }
    
    public void inhaberaendern() {
        if (eigene == true) {
            eigene = false;
        } else {
            eigene = true;
        }
    }
    
    public boolean besitzanzeigen() {
        return imbesitz;
    }
    
    public boolean inhaberanzeigen() {
        return eigene;
    }
    
    public int getKartenwert() {
        return kartennummer;
    }
    
    
}
