/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag{

    private final int  numberOfStraps;

    public CrossbodyBag (String color, int capacity, int numStraps){
        super(color, capacity);
        this.numberOfStraps = numStraps;
    }

    public int getNumberOfStraps(){
        return this.numberOfStraps;
    }

    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    @Override
    public String toString() {
        int numStraps = this.numberOfStraps;
        int numContents = this.getNumberOfContents();
        int capacity = this.getCapacity();

        String[] s = super.toString().split(" ");

        return String.format("%s Crossbody Bag with %s straps (%s / %s)", s[0], numStraps, numContents, capacity);
    }
}
