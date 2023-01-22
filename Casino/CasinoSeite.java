import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasinoSeite extends World
{
    private Casinoverwaltung casinoverwaltung;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CasinoSeite()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        casinoverwaltung = new Casinoverwaltung(this);
    }
}
