 package ch.hslu.sw04.Switchable;

public class Licht implements Named, CountingSwitchable{

    private static final int MAX_LUMEN = 1000;
    private static final int MIN_LUMEN = 0;
    private int lumen;
    private long switchCountLicht = 0;
    private String name; 

    @Override
    public void switchOn() 
    {
        this.setLumen(1000);
        System.out.println("Licht ist eingeschaltet !!");
        switchCountLicht++;
    }

    @Override
    public void switchOff()
    {
        this.setLumen(0);
        System.out.println("Licht ist ausgeschaltet!!");
        switchCountLicht++;
    }

    @Override
    public boolean isSwitchedOn()
    {
        return this.getLumen() > 0;
    }

    @Override
    public boolean isSwitchedOff() 
    {
        return this.getLumen() == 0;
    }

    public int getLumen()
    {
        return lumen;
    }
    @Override 
    public long getSwitchCount()
    {
        return this.switchCountLicht;
    }
    public void setLumen(int lumen) 
    {
        if(lumen <= this.MAX_LUMEN && lumen >= this.MIN_LUMEN) 
        {
            this.lumen = lumen;
        }
        else
        {
            System.out.println("Ungültige Eingabe");
        }
    }
    @Override 
    public String getName()
    {
        return this.name;
    }
    @Override 
    public void setName(final String name)
    {
        this.name = name;
    }
}