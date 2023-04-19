/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw10;

/**
 *
 * @author alexi
 */
public class Program {
    public static void main(String[] args) {
        Car car = new Car("R8");
        car.motor.switchOn();
        
        Car porsche = new Car("911");
        porsche.motor.addPropertyChangeListener(porsche);
    }
}
