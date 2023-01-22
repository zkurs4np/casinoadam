import greenfoot.World;

/**
 * Write a description of class Casinoplan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casinoplan  
{
    private Casinoverwaltung casinoverwaltung;
    
    private CasinoSeite casinoseite;
    private RouletteSeite rouletteseite;
    private Goldene6Seite goldene6seite;
    private SlotsSeite slotsseite;
    private SchwarzerPeterSeite schwarzerpeterseite;
    private KontostandSeite kontostandseite;

    private SpielKnopf roulette;
    private SpielKnopf goldene6;
    private SpielKnopf slots;
    private SpielKnopf schwarzerpeter;
    private SpielKnopf startseite;
    private SpielKnopf kontostand;
    
    private SpielKnopf knopf10euro;
    private SpielKnopf knopf20euro;
    private SpielKnopf knopf50euro;
    private SpielKnopf knopf100euro;

    public Casinoplan(Casinoverwaltung casinoverwaltung, CasinoSeite casinoseite, RouletteSeite rouletteseite, Goldene6Seite goldene6seite, SlotsSeite slotsseite, SchwarzerPeterSeite schwarzerpeterseite, KontostandSeite kontostandseite, SpielKnopf roulette, SpielKnopf goldene6, SpielKnopf slots, SpielKnopf schwarzerpeter, SpielKnopf startseite, SpielKnopf kontostand, SpielKnopf knopf10euro, SpielKnopf knopf20euro, SpielKnopf knopf50euro, SpielKnopf knopf100euro)
    {
        this.casinoverwaltung = casinoverwaltung;
        
        
        this.casinoseite = casinoseite;
        this.rouletteseite = rouletteseite;
        this.goldene6seite = goldene6seite;
        this.slotsseite = slotsseite;
        this.schwarzerpeterseite = schwarzerpeterseite;
        this.kontostandseite = kontostandseite;

        this.knopf10euro = knopf10euro;
        this.knopf20euro = knopf20euro;
        this.knopf50euro = knopf50euro;
        this.knopf100euro = knopf100euro;
        
        this.roulette = roulette;
        this.goldene6 = goldene6;
        this.slots = slots;
        this.schwarzerpeter = schwarzerpeter;
        this.kontostand = kontostand;
        
        this.startseite = startseite;

        casinoseite.addObject(roulette, 200, 200);
        casinoseite.showText("roulette", 200, 200);
        casinoseite.addObject(goldene6, 600, 200);
        casinoseite.showText("goldene6", 600, 200);
        casinoseite.addObject(slots, 200, 400);
        casinoseite.showText("slots", 200, 400);
        casinoseite.addObject(schwarzerpeter, 600, 400);
        casinoseite.showText("schwarzerpeter", 600, 400);

        casinoseite.addObject(kontostand, 1080, 50);
        
        kontostandseite.addObject(knopf10euro, 150, 350);
        kontostandseite.showText(knopf10euro.geldbetrag +"€", 150, 350);
        kontostandseite.addObject(knopf20euro, 450, 350);
        kontostandseite.showText(knopf20euro.geldbetrag +"€", 450, 350);
        kontostandseite.addObject(knopf50euro, 750, 350);
        kontostandseite.showText(knopf50euro.geldbetrag +"€", 750, 350);
        kontostandseite.addObject(knopf100euro, 1050, 350);
        kontostandseite.showText(knopf100euro.geldbetrag +"€", 1050, 350);

        aendereGeldbetrag();

    }

    // public void aendereGeldbetrag()
    // {
        // casinoseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 1080, 50);
        // kontostandseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 600, 200);
    // }
    
    public void aendereGeldbetrag()
    {
        casinoseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 1080, 50);
        rouletteseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 1080, 50);
        goldene6seite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 1080, 50);
        slotsseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 1080, 50);
        schwarzerpeterseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 1080, 50);
        kontostandseite.showText("Kontostand: "+casinoverwaltung.getGeldbetrag()+"€", 600, 200);
    }
}

