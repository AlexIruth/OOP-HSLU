package ch.hslu.sw04.Switchable;

public class Motor implements CountingSwitchable {

    private static final int MAX_RPM = 5000;
    private static final int MIN_RPM = 0;
    private int rpm;
    private long switchCountMotor;

    @Override
    public void switchOn() {
        this.setRpm(2500);
        System.out.println("Motor ist angeschaltet!!");
        switchCountMotor++;
    }

    @Override
    public void switchOff() {
        this.setRpm(0);
        System.out.println("Motor ist ausgeschaltet!!");
        switchCountMotor++;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.getRpm() > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.getRpm() == 0;
    }

    @Override
    public long getSwitchCount() {
        return this.switchCountMotor;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if (rpm <= Motor.MAX_RPM && rpm >= Motor.MIN_RPM) {
            this.rpm = rpm;
        } else {
            System.out.println("Ungültige Eingabe"); 
        }
    }
}
