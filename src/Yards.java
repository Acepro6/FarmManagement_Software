/*  Bin.java
 *  Created by:     Arthur Fritzke
 *  Date:           March 28th, 2022
 *  Last Author:    Arthur Fritzke
 *  Last Modified:  March 28th, 2022
 */


public class Yards<GrainBin> {
    // Name of the yard
    protected String name;

    // Type of grain
    protected GrainBin[] Bins;

    /**
     * Constructor
     * @param name STRING, name of yard
     */
    public Yards(String name) {
        this.name = name;
    }
}
