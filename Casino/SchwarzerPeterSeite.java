import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SchwarzerPeterSeite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SchwarzerPeterSeite extends World
{
    private int gesamtwertdealer;
    private int gesamtwertspieler;
    private Casinoverwaltung casinoverwaltung;
    private SpielKnopf hitknopf;
    private SpielKnopf stayknopf;
    private Deck[] deck = new Deck[52];
    private int anzahlzaehler;
    private int randomzahl;
    
    public SchwarzerPeterSeite(Casinoverwaltung casinoverwaltung)
    {
        super(1200, 700, 1);
        this.showText("Schwarzer Peter", 600, 350);
        this.casinoverwaltung = casinoverwaltung;
        spielaufbau();
    }
    
    public void spielaufbau() {
        hitknopf = new SpielKnopf(12, this);
        stayknopf = new SpielKnopf(13, this);
        hitknopf.setImage("SpielKnopf.png");
        stayknopf.setImage("SpielKnopf.png");
        this.addObject(hitknopf, 300, 600);
        this.addObject(stayknopf, 900, 600);
        this.showText("HIT", 300, 600);
        this.showText("STAY", 900, 600);
        deckanfertigung();
    }
    
    public void deckanfertigung() {
        for(int i = 0; i < 52; i++) {
            deck[i] = new Deck(i+1);    
        }
    }
    
    public void hit() {
        if(anzahlzaehler < 2) {
            randomzahl = Greenfoot.getRandomNumber(51);
            deck[randomzahl].besitzaendern();
            deck[randomzahl].inhaberaendern();
            zahlenwertaktualisieren();
            anzahlzaehler++;
            this.showText("Zahl: " + gesamtwertspieler, 600, 600);
        }
    }
    
    public void zahlenwertaktualisieren() {
        
        if(deck[randomzahl].besitzanzeigen() == true && deck[randomzahl].inhaberanzeigen() == true) {
                gesamtwertspieler += deck[randomzahl].getKartenwert();
        }
        
    }
    
    public void stay() {
        
    }
    
}
