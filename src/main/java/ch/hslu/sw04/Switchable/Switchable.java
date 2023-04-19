package ch.hslu.sw04.Switchable;

/**
 * Beschreiben Sie hier die Klasse Switchable.
 * 
 * @author (Alex Iruth) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public interface Switchable
{   
/** Dieses Interface ist zusändig etwas einzuschalten */
    void switchOn();
/** Dieses Interface ist, da etwas auszuschalten */
    void switchOff();
/** Dieses Interface ist eingeschalten wenn die Bedingung true ist */
    boolean isSwitchedOn();
/** Diese BEdingung ist ausgeschalten wenn diese Bedingung falsch ist*/
    boolean isSwitchedOff();
}
