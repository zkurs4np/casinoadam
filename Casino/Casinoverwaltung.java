

import greenfoot.World;

/**
 * Write a description of class Casinoverwaltung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casinoverwaltung  
{
    private CasinoSeite casinoseite;
    private RouletteSeite rouletteseite;
    private Goldene6Seite goldene6seite;
    private SlotsSeite slotsseite;
    private SchwarzerPeterSeite schwarzerpeterseite;
    private KontostandSeite kontostandseite;
    
    private BlackjackSpieler bjspieler;
    
    private SpielKnopf roulette;
    private SpielKnopf goldene6;
    private SpielKnopf slots;
    private SpielKnopf schwarzerpeter;
    private SpielKnopf kontostand;
    private SpielKnopf startseite;
    private SpielKnopf vorherigeseitenknopf;
    
    private SpielKnopf knopf10euro;
    private SpielKnopf knopf20euro;
    private SpielKnopf knopf50euro;
    private SpielKnopf knopf100euro;
    
    private Casinoplan casinoplan;
    
    private int geldbetrag = 0;
    
    public Casinoverwaltung(CasinoSeite casinoseite)
    {
        this.casinoseite = casinoseite;
        
        rouletteseite = new RouletteSeite();
        goldene6seite = new Goldene6Seite();
        slotsseite = new SlotsSeite(this);
        schwarzerpeterseite = new SchwarzerPeterSeite(this);
        kontostandseite = new KontostandSeite();

        vorherigeseitenknopf = new SpielKnopf(casinoseite, 11);
        vorherigeseitenknopf.setImage("ZurueckKnopf.png");

        kontostand = new SpielKnopf(kontostandseite, 1, vorherigeseitenknopf);

        startseite = new SpielKnopf(casinoseite, kontostand, 0);
        startseite.setImage("ZurueckKnopf.png");


        roulette = new SpielKnopf(rouletteseite, 2, startseite, kontostand);
        goldene6 = new SpielKnopf(goldene6seite, 3, startseite, kontostand);
        slots = new SpielKnopf(slotsseite, 4, startseite, kontostand);
        schwarzerpeter = new SpielKnopf(schwarzerpeterseite, 5, startseite, kontostand);
        
        knopf10euro = new SpielKnopf(this, 10, 6);
        knopf20euro = new SpielKnopf(this, 20, 7);
        knopf50euro = new SpielKnopf(this, 50, 8);
        knopf100euro = new SpielKnopf(this, 100, 9);
        
        
        casinoplan = new Casinoplan(this, casinoseite, rouletteseite, goldene6seite, slotsseite, schwarzerpeterseite, kontostandseite, roulette, goldene6, slots, schwarzerpeter, startseite, kontostand, knopf10euro, knopf20euro, knopf50euro, knopf100euro);
        
    }
    
    
    public void aendereGeldbetrag(int differenz){
        geldbetrag = geldbetrag + differenz;
        
        casinoplan.aendereGeldbetrag();
    }
    
    public int getGeldbetrag(){
        return geldbetrag;
    }
}