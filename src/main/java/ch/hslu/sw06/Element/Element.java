package ch.hslu.sw05.VererbungAggregatszustand;

public abstract class Element

{   private String aggregatszustand;
    
    public Element ()
    { 
    
    }

    

    public final String getaggregatszustand()
    {
        return this.aggregatszustand;
    }
    
    public void setaggregatszustand(String newAggregatszustand)
    {   
        this.aggregatszustand = newAggregatszustand;
    }
    
    public abstract void caculateAggregatszustand();
    
    @Override
    public String toString ()
    { 
        return "Element mit Aggregatszustand" + this.aggregatszustand;
    }
  
}



