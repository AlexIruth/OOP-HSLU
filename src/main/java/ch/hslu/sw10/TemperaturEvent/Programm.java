/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10.TemperaturEvent;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexi
 */
public class Programm implements TemperaturListener {

    private static final Logger LOG
            = LogManager.getLogger(Programm.class);

    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        Programm listener = new Programm();
        temperaturVerlauf.addTemperaturListener(listener);
        
                
        do {
            try {
                System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
                input = scanner.next();
                if (!input.equals("exit")) {
                    float value = Float.valueOf(input);
                    Temperatur temperatur = Temperatur.createFromCelsius(value);
                    temperaturVerlauf.add(temperatur);
                    
                    LOG.debug(temperatur.getKelvin());
                }
            } catch (Exception e) {
                LOG.debug(e);
                LOG.error(e);
                System.out.println("Enter a NUMMBER !!!!");
            }
        } while (!input.equals("exit"));
        System.out.println(temperaturVerlauf.toString());
        LOG.info("Programm beendet.");

    }

    @Override
    public void minMaxChange(TemperaturEvent event) {
        System.out.println("new "+ event.getTyp()+":"+event.getValue());
    }

}
