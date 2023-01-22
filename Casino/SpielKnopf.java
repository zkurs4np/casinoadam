    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
    * Write a description of class SpielKnopf here.
    * 
    * @author (your name) 
    * @version (a version number or a date)
    */
    public class SpielKnopf extends Actor
    {
    
    
    private int spielnummer;
    
    private World naechstewelt;
    private static World vorherigeseite;
    private static World aktuelleseite;
    private SlotsSeite slotsseite;
    private SchwarzerPeterSeite schwarzerpeterseite;
    
    private SpielKnopf startseitenknopf;

    private SpielKnopf vorherigeseitenknopf;
    private SpielKnopf kontostand;
    
    


    private Dealer dealer;

    
    private Casinoverwaltung casinoverwaltung;
    
    public int geldbetrag;    
    
    //Spielfeld für Slots
    public SpielKnopf()
    {
        spielnummer = -1;
    }
    
    //Zurückpfeil zur vorherigen Seite
    public SpielKnopf(World vorherigeseite, int spielnummer)
    {
        this.spielnummer = spielnummer; 
        this.vorherigeseite = vorherigeseite;
    }

    //Knopf zum Kontostand
    public SpielKnopf(World naechstewelt, int spielnummer, SpielKnopf vorherigeseitenknopf)
    {
        this.spielnummer = spielnummer; 
        this.naechstewelt = naechstewelt;
        this.vorherigeseitenknopf = vorherigeseitenknopf;
    }
    
    //Zurückpfeil zur Startseite
    public SpielKnopf(World naechstewelt, SpielKnopf kontostand, int spielnummer)
    {
        this.spielnummer = spielnummer; 
        this.naechstewelt = naechstewelt;
        this.kontostand = kontostand;
    }

    //Knöpfe zu den einzelnen Spielen
    public SpielKnopf(World naechstewelt, int spielnummer, SpielKnopf startseitenknopf, SpielKnopf kontostand)
    {
        this.spielnummer = spielnummer; 
        this.naechstewelt = naechstewelt;
        this.startseitenknopf = startseitenknopf;
        this.kontostand = kontostand;
    }
    
    //Knöpfe für die Geldbeträge
    public SpielKnopf(Casinoverwaltung casinoverwaltung, int geldbetrag, int spielnummer)
    {
        this.geldbetrag = geldbetrag;
        this.spielnummer = spielnummer; 
        this.casinoverwaltung = casinoverwaltung;
    }

    //Knopf für eine Slotumdrehung
    public SpielKnopf(int spielnummer, SlotsSeite slotsseite)
    {
        this.spielnummer = spielnummer;
        this.slotsseite = slotsseite;
    }
    
    //Knopf für Hit/Stand
    public SpielKnopf(int spielnummer, SchwarzerPeterSeite schwarzerpeterseite) {
        this.spielnummer = spielnummer;
        this.schwarzerpeterseite = schwarzerpeterseite;
    }

    public SpielKnopf(World naechstewelt, int spielnummer, SpielKnopf startseitenknopf, Dealer dealer)
    {
        this.spielnummer = spielnummer; 
        this.naechstewelt = naechstewelt;
        this.startseitenknopf = startseitenknopf;
        this.dealer = dealer;
    }
    
    /*
    speichert die aktuelle, sowie die vorherige Seite
    Wechselt zu einem der Spiele
    Platziert den Kontostand- und den Startseitenknopf
    */
    private void WeiterleitenZuSpiel()
    {
        vorherigeseite = aktuelleseite;
        Greenfoot.setWorld(naechstewelt);
        naechstewelt.addObject(startseitenknopf, 100, 100);
        naechstewelt.addObject(kontostand, 1080, 50);
        aktuelleseite = naechstewelt;
    }

    /*
    speichert die aktuelle, sowie die vorherige Seite
    Wechselt zur Startseite
    Platziert den Kontostandknopf
    */
    private void WeiterleitenZuStartseite()
    {
        vorherigeseite = aktuelleseite;
        Greenfoot.setWorld(naechstewelt);
        naechstewelt.addObject(kontostand, 1080, 50);
        aktuelleseite = naechstewelt;
    }

    /*
    speichert die aktuelle, sowie die vorherige Seite
    Wechselt zum Kontostand
    Platziert den Knopf mit dem man zur verhoerigen Seite zurückkommt
    */
    private void WeiterleitenZuKontostand()
    {
        vorherigeseite = aktuelleseite;
        Greenfoot.setWorld(naechstewelt);
        naechstewelt.addObject(vorherigeseitenknopf, 100, 100);
        aktuelleseite = naechstewelt;
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
    
            switch(spielnummer)
            {
                //Casinoseite
                case 0: WeiterleitenZuStartseite();
                    break;
                //Kontostand
                case 1: WeiterleitenZuKontostand();
                    break;
                //Roulette
                case 2: WeiterleitenZuSpiel();
                    break;
                //Goldene6
                case 3: WeiterleitenZuSpiel();
                    break;
                //Slots
                case 4: WeiterleitenZuSpiel();
                    break;
                // Schwarzer Peter Initialisierung
                case 5: WeiterleitenZuSpiel();
                        break;
                //10 Euro
                case 6: casinoverwaltung.aendereGeldbetrag(geldbetrag);
                        break;
                //20 Euro
                case 7: casinoverwaltung.aendereGeldbetrag(geldbetrag);
                        break;
                //50 Euro
                case 8: casinoverwaltung.aendereGeldbetrag(geldbetrag);
                        break;
                //100 Euro
                case 9: casinoverwaltung.aendereGeldbetrag(geldbetrag);
                        break;
                //Eine Umdrehung bei der Slotmaschine
                case 10:slotsseite.slotUmdrehung();
                        break;
                //Weiterleiten zur vorherigen Seite
                case 11:Greenfoot.setWorld(vorherigeseite);
                        break;
                case 12:schwarzerpeterseite.hit();
                        break;
                case 13:schwarzerpeterseite.stay();
                        break;
            }
        }
    }
    
}
