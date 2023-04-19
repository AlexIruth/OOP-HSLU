package ch.hslu.sw03.Temeratur; 
        
public class Temperatur
{

    private float currentTemperaturInCelsius;
   

    /**  Dieser Konstruktor ermöglicht es einen beliebigen Wert für die currentTemperaturInCelsius einzugeben. 
     *   @param newTemperatur ist der Wert für die eingegebe Temperatur.
     */ 
    
    public Temperatur(float newTemperatur) 

    {this.currentTemperaturInCelsius = newTemperatur;  

    }

    /** Die Initialisierte Temperatur wurde durch einen Konstruktor erstellt das den Standart Wert 20 Grad Celsius beträgt.*/
    public Temperatur() 

    {this.currentTemperaturInCelsius = 20f;  

    }
    /** Die Methode besagt, dass ich beliebig die Temperatur einstellen kann die Funktion mit dem setter ermöglicht mir diese Einstellung.
     * @param new TemperaturInCelsius ist ein belibiger Wert den ich eigebe im Setter. Der eingegebene Wert ist der aktuelle currentTemperaturInCelsius Wert
     * @return current TemperaturInCelsius wird der eingegebene Wert zurückgegeben als currentTemperaturInCelsius.
     */
    public void setCurrentTemperaturInCelsius(float newTemperaturInCelsius ) 
    {
        currentTemperaturInCelsius = newTemperaturInCelsius;
    }
    
    /** Die Methode ist dafür zuständig das der aktuelle Temperaturwert in Celsius die bei Abruf angezeigt wird 
     * @return currentTemperaturInCelsius zeigt den aktuellen Temperatursstand an in Celsius
     */
    public float getCurrentTemperaturInCelsius() 
    {
        return currentTemperaturInCelsius;
    } 
    
     /** Die Methode zeigt bei Abruf den Wert in Kelvin an 
      * @return umgerechneterWertInKelvin zeigt den Wert in Kelvin an 
      */
    public float getCurrentTemperaturInKelvin() 
    {
        float umgerechneterwertInKelvin = currentTemperaturInCelsius +273.15f;
        return umgerechneterwertInKelvin;
    }
    /** Die Methode ermöglicht es den Wert in Kelvin einzustellen. 
     * @param currenttemeperaturInKelvin ist der Wert in Kelvin, vo dem ich 273.15f abziehe ergibt es  den Wert in Celsius 
     *
     */
    public void setCurrentTemperaturInKelvin(float currentTemperaturInKelvin)
    {
        this.currentTemperaturInCelsius = currentTemperaturInKelvin - 273.15f;
    }
    /** Die Methode ruft den Fahrenheit Wert ab
     * @return umgerechneterWertInFahrenheit Gibt den Wert in Fahrenheit an.
     */
    public float getCurrentTemperaturInFahrenheit () 
    { 
        float umgerechneterwertInFahrenheit = currentTemperaturInCelsius * 1.8f + 32f;
        return umgerechneterwertInFahrenheit;
    }
    /** Die Methode ist zuständig für die addierung der Temperatur 
     * 
     */
    public void increaseTemperaturInCelsius (float increasmentOfTemperaturInCelsius )
    
    { 
        currentTemperaturInCelsius = currentTemperaturInCelsius + increasmentOfTemperaturInCelsius; 
    }

    /* Woche 3 Elemente der Chemie definieren 
     * */
    public String setchemicalElement (String element){
        String aggregatszustand; 

        switch (element)
        {
            case "N": //Stickstoff Schmelzpunkt (-210,01°C) Siedepunkt (-195,80°C)

                if (currentTemperaturInCelsius >= -195.80f) 
                {
                    aggregatszustand = "gasförmig";    
                } 
                else if(currentTemperaturInCelsius >= -38.83f)
                { 
                    aggregatszustand ="flüssig";
                }
                else
                {
                    aggregatszustand = "fest";
                }
                break;  

            case "Pb":// Blei hat den Schmelzpunkt (327,43°C) (Siedepunkt 1750°C)

                if (currentTemperaturInCelsius >= 1750f)
                {
                    aggregatszustand = "gasförmig";
                }
                else if (currentTemperaturInCelsius >= 327.43f)

                {
                    aggregatszustand ="flüssig";
                }
                else 
                {  
                    aggregatszustand = "fest";
                }
                break;

            case "Hg": //quecksilber Schmelzpunkt (-38,83 Siedepunkt (356,73)

                if (currentTemperaturInCelsius >= 356.73f)
                {
                    aggregatszustand = "gasförmig";
                }
                else if (currentTemperaturInCelsius >= 327.43f)
                {
                    aggregatszustand ="flüssig";
                }
                else
                {
                    aggregatszustand = "fest";
                }
                break; 
                
            default:
                aggregatszustand = "Could not detect any element from the list. Error";

        }   
        return aggregatszustand; 
    
    }
    
        
       
}

