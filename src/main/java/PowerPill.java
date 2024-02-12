
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power..
 *
 * @author (Deyvon)
 * @version (0.1)
 */
public class PowerPill {
    private static final int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;


    // constructors

    /**
     * \* Initializes this power pill to a default power value
     * \* Sets the name of the pill to name.
     * \* @param name the name of this power pill.
     */

    public PowerPill(String name) {
        this.name = name;
        power = DEFAULT_POWER;
    }

    /**
     * Initializes this power pill to the value of power and sets the name of the pill to name.
     *
     * @param name  is the name of this power pill
     * @param power is the power level of this power pill.
     */

    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }


    // accessor methods

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }


    // mutator methods
    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
}
