/*  Bin.java
 *  Created by:     Arthur Fritzke
 *  Date:           March 28th, 2022
 *  Last Author:    Arthur Fritzke
 *  Last Modified:  March 28th, 2022
 */

public class GrainBin implements StorageUnit{
    // Maximum amount of bushels to be stored
    int capacity;

    // Current amount being stored
    int current;

    // Name of the bin
    String name;

    // Type of grain
    String grainType;

    /**
     * Constructor
     * @param wName Name of bin, STRING
     * @param wCapacity Storage Capacity, INTEGER
     */
    public GrainBin(String wName, int wCapacity) {

    }

    /**
     * get name of bin
     * @return STRING, name of bin
     */
    public String getName() {
        return this.name;
    }

    /**
     * get max capacity of bin
     * @return INTEGER, capacity value
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * get current storage of bin
     * @return INTEGER, how much is currently being stored
     */
    public int getCurrent() {
        return this.current;
    }

    /**
     * Is storage empty?
     * @return BOOLEAN, is storage empty?
     */
    public boolean isEmpty() {
        return this.current == 0;
    }

    /**
     * Is storage full?
     * @return BOOLEAN, is storage full?
     */
    public boolean isFull() {
        return this.capacity == this.current;
    }

    /**
     * Sets current storage value to zero or empty
     */
    public void clear() {
        this.current = 0;
    }

     public static void main(String[] args) {
        // Testing
     }
}
