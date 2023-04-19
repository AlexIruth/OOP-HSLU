package ch.hslu.sw03.Temperatur.Semesterwoche3;

public class Iteration
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    
public Iteration() 
    {
        
    }

    //Beste möglichkeit     
public void forSchleifen ()
    {
        for (int i = 0; i <=10; i++) 
            {
                System.out.println("Wert " +i);
            }
    }
    
    // 2. Beste möglichkeit
public void whileSchleife (){
    int i = 0;
    while (i<=10){
    System.out.print(i);
    i++;
    }
}

    //Schlechteste Möglichkeit
    
public void dowhileSchleife () {
    
    int i = 0;
    do {System.out.println(i);
        i++;
        
    }while(i<=10);
}

public void floatUntilOne(){
    float f = 0.9f;
    int i = 0;
    while (f <=1f)
    {
        f += 0.000025f;
        System.out.println(f);
        i++;
        System.out.println(i);
    }
    
}
public void floatForLoop(){
float f = 0.9f;
for (int i = 0; i <4000; i++) { f += 0.000025;
System.out.println(f +" " + i);
}
}

void printBox (final int height, final int width) {


}

}






