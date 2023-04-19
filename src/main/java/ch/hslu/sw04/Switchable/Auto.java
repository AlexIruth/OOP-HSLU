package ch.hslu.sw04.Switchable;

public class Auto implements CountingSwitchable {

    private Motor motor;
    private Licht licht;
    private boolean isRunning;
    private long switchCount;

    public Auto() {
        motor = new Motor();
        licht = new Licht();
        switchCount = 0;
    }

    @Override
    public void switchOn() {
        isRunning = true;
        switchCount++;
        licht.switchOn();
        motor.switchOn();
    }

    @Override
    public void switchOff() {
        isRunning = false;
        switchCount++;
        licht.switchOff();
        motor.switchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return isRunning;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isRunning;
    }
    
   

    @Override

    public long getSwitchCount() {
        return switchCount;
    }

    public long getTotalSwitchCount() {
        return licht.getSwitchCount() + motor.getSwitchCount() + this.getSwitchCount();
    }

    public void main() {
        Auto porsche = new Auto();
        porsche.switchOn();
        porsche.motor.switchOn();
        porsche.licht.switchOn();
    }
}
