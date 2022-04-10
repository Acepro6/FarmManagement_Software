/*  Bin.java
 *  Created by:     Arthur Fritzke
 *  Date:           March 28th, 2022
 *  Last Author:    Arthur Fritzke
 *  Last Modified:  April 10th, 2022
 */

import java.awt.*;

public class GrainBin implements StorageUnit{
    // Maximum amount of bushels to be stored
    int capacity;

    // Current amount being stored
    int current = 0;

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
        this.capacity = wCapacity;
        this.name = wName;
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
     * Add grain to the bin
     * @param x integer value describing how much grain is being added
     * @return integer describes surplus in removal number
     */
    public int addGrain(int x) {
        if (!this.isFull()) {
            if (this.current + x < this.capacity) {
                this.current += x;
                return 0;
            }
            else {
                this.current += this.capacity - this.current;
                return x - (this.capacity - this.current);
            }
        }
        System.out.print("Nothing added, bin might be full");
        return 0;
    }

    /**
     * Remove grain from bin
     * @param x integer value for how much to be removed
     * @return integer describes surplus in removal number
     */
    public int removeGrain(int x) {
        if (!this.isEmpty()) {
            if (this.current > x) {
                this.current -= x;
                return 0;
            }
            else {
                this.current = 0;
                return this.current;
            }
        }
        System.out.print("Nothing removed, bin might be empty");
        return 0;
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

    public String toString() {
        return "\nBin name: " + this.name + "\nCurrent Load: " + this.getCurrent() +
                "\nCapacity: " + this.getCapacity() + "\n";
    }

    /**
     * Sets current storage value to zero or empty
     */
    public void clear() {
        this.current = 0;
    }

     public static void main(String[] args) {
        // Testing
         GrainBin w106 = new GrainBin("W106", 5000);
         System.out.print(w106.toString());
         if (!w106.isEmpty()) {
            System.out.print("Bin is returning false but should be true for empty status\n");
         }
         if (w106.isFull()) {
             System.out.print("Bin is returning true but should be false for full status\n");
         }
         if (w106.getCurrent() != 0) {
             System.out.print("Bin status is non-zero upon construction\n");
         }
         if (w106.getCapacity() != 5000) {
             System.out.print("Bin capacity was not constructed correctly.\n");
         }
         if (!w106.getName().equals("W106")) {
             System.out.print("Bin name was not correctly set\n");
         }

         // non-empty addgrain test
         w106.addGrain(2000);
         System.out.print(w106.toString());
         if (w106.isEmpty()) {
             System.out.print("Bin is returning true but should be false for empty status\n");
         }
         if (w106.isFull()) {
             System.out.print("Bin is returning true but should be false for full status\n");
         }
         if (w106.getCurrent() != 2000) {
             System.out.print("Bin status is non-zero upon construction\n");
         }

         // non-empty removegrain test
         w106.removeGrain(1000);
         System.out.print(w106.toString());
         if (w106.isEmpty()) {
             System.out.print("Bin is returning true but should be false for empty status\n");
         }
         if (w106.isFull()) {
             System.out.print("Bin is returning true but should be false for full status\n");
         }
         if (w106.getCurrent() != 1000) {
             System.out.print("Bin status is non-zero upon construction\n");
         }

         // empty removeGrain test past zero
         int excess = w106.removeGrain(4000);
         System.out.print(w106.toString());
         if (!w106.isEmpty()) {
             System.out.print("Bin is returning true but should be false for empty status\n");
         }
         if (w106.isFull()) {
             System.out.print("Bin is returning true but should be false for full status\n");
         }
         if (w106.getCurrent() != 0) {
             System.out.print("Bin status is non-zero upon construction\n");
         }
         System.out.print(excess + "\n");
         if (excess != 1000) {
             System.out.print("Excess load requirement is wrong\n");
         }

         // empty addGrain test past capacity
         w106.addGrain(2500);
         int leftover = w106.addGrain(4000);
         System.out.print(w106.toString());
         if (w106.isEmpty()) {
             System.out.print("Bin is returning true but should be false for empty status\n");
         }
         if (!w106.isFull()) {
             System.out.print("Bin is returning false but should be true for full status\n");
         }
         if (w106.getCurrent() != 5000) {
             System.out.print("Bin status is non-zero upon construction\n");
         }
         System.out.print(leftover + "\n");
         if (leftover != 1500) {
             System.out.print("Leftover load requirement is wrong\n");
         }

    }
}
