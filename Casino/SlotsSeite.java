import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class SlotsSeite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlotsSeite extends World
{

    private int[] num = new int[20];

    private SpielKnopf[] slotfeld = new SpielKnopf[20];

    private int[] xcord = new int[5];

    private int[] ycord = new int[4];

    private Casinoverwaltung casinoverwaltung;
    


    public SlotsSeite(Casinoverwaltung casinoverwaltung)
    {
        super(1200, 700, 1);
        this.showText("Slots", 600, 100);
        
        this.casinoverwaltung = casinoverwaltung;

        Spielaufbau();
        
    }

    private void Spielaufbau()
    {
        
        for(int i=0; i<num.length; i++)
        {
            num[i] = Greenfoot.getRandomNumber(20)+1;
        }

        for(int i=0; i<xcord.length; i++)
        {
            xcord[i] = 133+(i*233);
        }

        for(int i=0; i<ycord.length; i++)
        {
            ycord[i] = 200+(i*100);
        }
        

        for(int i=0; i<slotfeld.length; i++)
        {
            slotfeld[i] = new SpielKnopf();
        }

        for(int i=0; i<slotfeld.length; i++)
        {
            this.addObject(slotfeld[i], xcord[i%5], ycord[i/5]);
            this.showText(String.valueOf(i), xcord[i%5], ycord[i/5]);
            //this.showText(String.valueOf(num[i]), xcord[i%5], ycord[i/5]);
        }
        

        SpielKnopf hebel = new SpielKnopf(10, this);
        hebel.setImage("SpielKnopf.png");

        this.addObject(hebel, 600, 600);
        this.showText("GAMBLE", 600, 600);

        // symbol1.setImage("SlotsSymbol"+symbol1nummer+".png");
        // symbol2.setImage("SlotsSymbol"+symbol2nummer+".png");
        // symbol3.setImage("SlotsSymbol"+symbol3nummer+".png");

        // this.addObject(symbol1, 225, 350);
        // this.addObject(symbol2, 600, 350);
        // this.addObject(symbol3, 975, 350);
    }

    public void slotUmdrehung()
    {
        //casinoverwaltung.aendereGeldbetrag(-2);

        
        for(int i=0; i<num.length; i++)
        {
            num[i] = Greenfoot.getRandomNumber(20)+1;
        }

        
        
        

        // if(symbol1nummer == symbol2nummer && symbol1nummer == symbol3nummer)
        // {
            // casinoverwaltung.aendereGeldbetrag(50);
        // } else if (symbol1nummer == symbol2nummer || symbol1nummer == symbol3nummer || symbol2nummer == symbol3nummer) {
            // casinoverwaltung.aendereGeldbetrag(5);
        // }

        for(int i=0; i<slotfeld.length; i++)
        {
            this.showText(String.valueOf(num[i]), xcord[i%5], ycord[i/5]);
            this.showText(String.valueOf(i), xcord[i%5]+50, ycord[i/5]);
        }





        ArrayList<Integer> belegteFelder = new ArrayList<Integer>();

        for(int i=0; i<num.length; i++)
        {
            boolean contains1 = belegteFelder.contains(i);
            if(contains1 == false)
            {

                for(int j=0; j<num.length; j++)
                {
                    boolean contains2 = belegteFelder.contains(j);
                    if(contains2 == false)
                    {            

                        for(int k=0; k<num.length; k++)
                        {
                            boolean contains3 = belegteFelder.contains(k);
                            if(contains3 == false)
                            {

                                for(int l=0; l<num.length; l++)
                                {
                                    boolean contains4 = belegteFelder.contains(l);
                                    if(contains4 == false)
                                    {

                                        for(int m=0; m<num.length; m++)
                                        {
                                            boolean contains5 = belegteFelder.contains(m);
                                            if(contains5 == false)
                                            {

                                                for(int n=0; n<num.length; n++)
                                                {
                                                    boolean contains6 = belegteFelder.contains(n);
                                                    if(contains6 == false){

                                                        if((num[n] == num[i] && num[n] == num[j] && num[n] == num[k] && num[n] == num[l] && num[n] == num[m]) && (n!=i && n!=j && n!=k && n!=l && n!=m) && (m!=i && m!=j && m!=k && m!=l) && (l!=k && l!=j && l!=i) && (k!=i && k!=j) && (i!=j))
                                                        {
                                                            slotfeld[i].setImage("SpielKnopf5.png");
                                                            slotfeld[j].setImage("SpielKnopf5.png");
                                                            slotfeld[k].setImage("SpielKnopf5.png");
                                                            slotfeld[l].setImage("SpielKnopf5.png");
                                                            slotfeld[m].setImage("SpielKnopf5.png");
                                                            slotfeld[n].setImage("SpielKnopf5.png");

                                                            belegteFelder.add(i);
                                                            belegteFelder.add(j);
                                                            belegteFelder.add(k);
                                                            belegteFelder.add(l);
                                                            belegteFelder.add(m);
                                                            belegteFelder.add(n);

                                                            System.out.println("Sechser: "+i+", "+j+", "+k+", "+l+", "+m+", "+n);
                                                        }

                                                        contains1 = belegteFelder.contains(i);
                                                        contains2 = belegteFelder.contains(j);
                                                        contains3 = belegteFelder.contains(k);
                                                        contains4 = belegteFelder.contains(l);
                                                        contains4 = belegteFelder.contains(m);

                                                        if(contains1 == false && contains2 == false && contains3 == false && contains4 == false && contains5 == false)
                                                        {

                                                            if((num[m] == num[i] && num[m] == num[j] && num[m] == num[k] && num[m] == num[l]) && (m!=i && m!=j && m!=k && m!=l) && (l!=k && l!=j && l!=i) && (k != i && k != j) && (i!=j))
                                                            {
                                                                slotfeld[i].setImage("SpielKnopf4.png");
                                                                slotfeld[j].setImage("SpielKnopf4.png");
                                                                slotfeld[k].setImage("SpielKnopf4.png");
                                                                slotfeld[l].setImage("SpielKnopf4.png");
                                                                slotfeld[m].setImage("SpielKnopf4.png");

                                                                belegteFelder.add(i);
                                                                belegteFelder.add(j);
                                                                belegteFelder.add(k);
                                                                belegteFelder.add(l);
                                                                belegteFelder.add(m);

                                                                System.out.println("Fünfer: "+i+", "+j+", "+k+", "+l+", "+m);
                                                            }
                                                        }
                                                    }
                                                }

                                                contains1 = belegteFelder.contains(i);
                                                contains2 = belegteFelder.contains(j);
                                                contains3 = belegteFelder.contains(k);
                                                contains4 = belegteFelder.contains(l);

                                                if(contains1 == false && contains2 == false && contains3 == false && contains4 == false)
                                                {

                                                    if((num[l] == num[i] && num[l] == num[j] && num[l] == num[k]) && (l!=i && l!=j && l!=k) && (k != i && k != j && i!=j))
                                                    {
                                                        slotfeld[i].setImage("SpielKnopf3.png");
                                                        slotfeld[j].setImage("SpielKnopf3.png");
                                                        slotfeld[k].setImage("SpielKnopf3.png");
                                                        slotfeld[l].setImage("SpielKnopf3.png");

                                                        belegteFelder.add(i);
                                                        belegteFelder.add(j);
                                                        belegteFelder.add(k);
                                                        belegteFelder.add(l);

                                                        System.out.println("Vierer: "+i+", "+j+", "+k+", "+l);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                                contains1 = belegteFelder.contains(i);
                                contains2 = belegteFelder.contains(j);
                                contains3 = belegteFelder.contains(k);

                                if(contains1 == false && contains2 == false && contains3 == false)
                                {
                                    if((num[k] == num[i] && num[k] == num[j]) && (k != i && k != j && i!=j))
                                    {  
                                        slotfeld[i].setImage("SpielKnopf2.png");
                                        slotfeld[j].setImage("SpielKnopf2.png");
                                        slotfeld[k].setImage("SpielKnopf2.png");

                                        belegteFelder.add(i);
                                        belegteFelder.add(j);
                                        belegteFelder.add(k);
                            
                                        System.out.println("Dreier: "+i+", "+j+", "+k);

                                        System.out.println("Aktuelle Größe(belegteFelder): "+belegteFelder.size());
                                    }
                                } 
                            }
                        }

                    contains1 = belegteFelder.contains(i);
                    contains2 = belegteFelder.contains(j);

                    if(contains1 == false && contains2 == false)
                    {
                        if(num[j] == num[i] && j!=i)
                        {
                            slotfeld[i].setImage("SpielKnopf1.png");
                            slotfeld[j].setImage("SpielKnopf1.png");

                            belegteFelder.add(i);
                            belegteFelder.add(j);
                        
                            System.out.println("Zweier: "+i+", "+j);

                            System.out.println("Aktuelle Größe(belegteFelder): "+belegteFelder.size());
                        
                        }
                    }       
                }

                contains1 = belegteFelder.contains(i);
                if(contains1 == false)
                {
                    slotfeld[i].setImage("SpielKnopf.png");
                }
            }
        }
    }
}
            /*
                for(int k=0; k<num.length; k++)
                {
                    if((num[k] == num[i] && num[k] == num[j]) && (k != i && k != j && i!=j))
                    {
                        slotfeld[i].setImage("SpielKnopf2.png");
                        slotfeld[j].setImage("SpielKnopf2.png");
                        slotfeld[k].setImage("SpielKnopf2.png");

                        belegteFelder.add(i);
                        belegteFelder.add(j);
                        belegteFelder.add(k);
                            

                        System.out.println("Dreier: "+i+", "+j+", "+k);
                    }

                    for(int l=0; l<num.length; l++)
                    {
                        if((num[l] == num[i] && num[l] == num[j] && num[l] == num[k]) && (l!=i && l!=j && l!=k) && (k != i && k != j && i!=j))
                        {
                            slotfeld[i].setImage("SpielKnopf3.png");
                            slotfeld[j].setImage("SpielKnopf3.png");
                            slotfeld[k].setImage("SpielKnopf3.png");
                            slotfeld[l].setImage("SpielKnopf3.png");

                            belegteFelder.add(i);
                            belegteFelder.add(j);
                            belegteFelder.add(k);
                            belegteFelder.add(l);

                            System.out.println("Vierer: "+i+", "+j+", "+k+", "+l);
                        }
                    }
                }
                */
            
                    
            }   
            // for(int x=0; x<belegteFelder.size(); x++)
            // {
                // if(belegteFelder.get(x)!=i){    
                    // slotfeld[x].setImage("SpielKnopf.png");
                // }
            // } 
    
        



    
            /*
            for(int a=0; a<belegteFelder.size(); a++)
            {
                if(belegteFelder.get(a)!=i)
                {
                    slotfeld[i].setImage("SpielKnopf.png");
                }
            }
            */
    
        


