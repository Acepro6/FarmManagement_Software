/*  Bin.java
 *  Created by:     Arthur Fritzke
 *  Date:           March 28th, 2022
 *  Last Author:    Arthur Fritzke
 *  Last Modified:  March 28th, 2022
 */

import java.util.LinkedList;

public class Yard
{
    // Name of the yard
    protected String name;

    // Type of grain
    protected GrainBin[] Bins;

    // current slot being referenced
    protected int currentCount;

    /**
     * Constructor
     * @param name STRING, name of yard
     */
    public Yard(String name) {
        this.name = name;
    }

    /**
     *
     * @param bin
     */
    public void addBin(GrainBin bin) {

    }

    public void removeBin(String name) {

    }

    @Override
    public String toString() {
        return "Yard{" +
                "name='" + name + '\'' +
                ", Bins=" + Bins +
                ", currentCount=" + currentCount +
                '}';
    }

    /**
     * Main function used to do testing of class methods
     */
    public static void main(String[] args) {
        // Testing
        Yard example = new Yard("Bisel Place");

        GrainBin w106 = new GrainBin("W106", 5000);
    }
}
