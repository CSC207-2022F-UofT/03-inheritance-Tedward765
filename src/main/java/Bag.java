import java.util.*;
/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private ArrayList<String> contents;


    public Bag (String colorOfBag, int capacity){
                this.color = colorOfBag;
                this.capacity = capacity;
                this.numberOfContents = 0;
                this.contents = new ArrayList<>();
    }


    public String getColor(){
        return this.color;
    }

    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setColor(String newColour){
        this.color = newColour;
    }




    public boolean addItem(String newItem){
       if (this.numberOfContents < capacity){
           this.contents.add(newItem);
           this.numberOfContents += 1;
           return true;
        }
        return false;
    }


    public String popItem(){
        if (this.numberOfContents != 0){
            this.numberOfContents -= 1;
            String itemRemoved = this.contents.get(numberOfContents);
            this.contents.remove(this.numberOfContents);
            return itemRemoved;
        }
        return null;
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}