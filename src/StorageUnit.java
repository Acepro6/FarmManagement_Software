/*  StorageUnit.java
 *  Created by:     Arthur Fritzke
 *  Date:           March 28th, 2022
 *  Last Author:    Arthur Fritzke
 *  Last Modified:  March 28th, 2022
*/

public interface StorageUnit
{
    /** What is the capacity of the storage unit? */
    public String getName();

    /** What is the capacity of the storage unit? */
    public int getCapacity();

    /** How much material is being stored? */
    public int getCurrent();

    /**	Is the structure empty?. */
    public boolean isEmpty();

    /**	Is the structure full?. */
    public boolean isFull();

    /**	Resets the structure to empty. */
    public void clear();

}
