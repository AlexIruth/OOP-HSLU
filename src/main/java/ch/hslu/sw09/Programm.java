/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw09;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexi
 */
public class Programm {

    private static final Logger LOG
            = LogManager.getLogger(Programm.class);

    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
                input = scanner.next();
                if (!input.equals("exit")) {
                    float value = Float.valueOf(input);
                    Temperatur temperatur = Temperatur.createFromCelsius(value);
                    LOG.debug(temperatur.getKelvin());
                }
            } catch (Exception e) {
                LOG.debug(e);
                LOG.error(e);
                System.out.println("Enter a NUMMBER !!!!");
            }
        } while (!input.equals("exit"));
        LOG.info("Programm beendet.");

    }

}
