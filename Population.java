/**
 * Created by Jack Brashier on 9/1/17.
 * Intended to fulfill the requirements of assignment 1.11
 */
public class Population {
    /**
     * The Following are base variables rooted in reality to demonstrate how the value of secondsInYear and thereore netPopChange were came upon.
     */
    public static int daysInYear = 365;
    public static int secondsInDay = 86400;
    public static int secondsInYear = secondsInDay * daysInYear;
    public static double birthPopChange = secondsInYear / 7.00;
    public static double deathPopChange = secondsInYear / 13.00;
    public static double immigPopChange = secondsInYear / 45.00;
    /**
     * Using all of these constants, we find that the net population change in one year is births + immigrants - deaths.
     */
    public static double netPopChange = birthPopChange - deathPopChange + immigPopChange;
    public static int outputPop;

    /**
     *
     * @param initPop The base population. Or, the population at year 0.
     * @param years The amount of years after which you would like to know the population.
     * @return The total population based on years passed and base population is returned.
     */
    public static int findPop(double initPop, int years) {
        for(int i = 1; i <= years; i++) {
            outputPop = (int)(initPop + netPopChange);
            initPop += netPopChange;
        }
        return outputPop;
    }

}
