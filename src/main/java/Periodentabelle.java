
public class Periodentabelle
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String elementName;
    private float meltingPoint;
    private float boilingPoint;

    // constructor 
    public Periodentabelle(String newElementName, float newMeltingPoint,float newBoilingPoint)
    {
        elementName = newElementName;
        meltingPoint = newMeltingPoint;
        boilingPoint = newBoilingPoint;  
    }

    public String getElementName ()
    {
        return elementName;
    }

    public String getAggregateMode (float tempCelsius){
        if(tempCelsius >= boilingPoint)
        {  
            return "gasförmig";
        }
        else if (tempCelsius>=meltingPoint)
        {
            return "flüssig";
        }
        else
        {
            return "fest";
        }

    
    
    }
}
