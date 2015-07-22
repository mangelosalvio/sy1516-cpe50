package com.example;

import javax.swing.*;

public class Person{
    private String firstName, lastName;
    private Vehicle[] vehicles;


    /**
     * 1. Create a default constructor does not accept any parameter
     * that initialized the last name to De la Cruz and first name to Juan
     *
     * Assume that the Person has 1 vehicle
     */
    public Person()
    {
        this.lastName = "De la Cruz";
        this.firstName = "Juan";
        this.vehicles = new Vehicle[1];
    }

    /**
     * 2. Create a constructor that sets the first name and last name of the
     * person and the sets the Vehicles
     * @param firstName
     * @param lastName
     * @param vehicles
     */
    public Person(String firstName, String lastName, Vehicle[] vehicles)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicles = vehicles;

    }

    /**
     * 2. Create get and set methods for the first name and last name
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 3. Create a get method for the vehicle
     * @param index
     * return Vehicle
     */

    public Vehicle getVehicle(int index)
    {
        return this.vehicles[index];
    }


    /**
     * 4. Create a set method for vehicle
     * @param index
     * @param Vehicle
     */

    public void setVehicle(int index, Vehicle vehicle)
    {
        this.vehicles[index] = vehicle;
    }


    /**
     * 5. Override the toString method to return the first and last name of the person
     * and their vehicles.
     *
     * Example output:
     * Bar, Foo
     * - Mitsubishi, Red
     * - Honda, Black
     * ...
     *
     * @param args
     * @return String
     */

    @Override
    public String toString() {
        String content = "";
        content = this.lastName + ", " + this.firstName + "\n";

        for ( Vehicle vehicle : this.vehicles ) {
            if ( vehicle != null ) {
                content += "- " + vehicle + "\n";
            }

        }

        return content;
    }




    public static void main(String[] args) {

        /**
         * 6. Use the default constructor using the variable 'person1'
         */
        Person person1 = new Person();

        /**
         * 7. Use the constructor in #2 to instantiate a Person with a variable 'person2'
         */

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("BMW", "Black");
        vehicles[1] = new Vehicle("Mazda", "Red");
        vehicles[2] = new Vehicle("Honda", "White");

        Person person2 = new Person("Foo","Bar",vehicles);

        /**
         * 8. Display in a dialog box the details ( first name, last name, and its vehicles ) of person2
         */

        JOptionPane.showMessageDialog(null, person2);

        System.out.println("Hello".equals("hello"));

    }


}

class Vehicle{
    private String make; // Mitsubishi, Honda, BMW, Chevrolet...
    private String color;

    /**
     * 9.Create a constructor the sets the make and color of the vehicle.
     * @param make
     * @param color
     */
    public Vehicle(String make, String color)
    {
        this.make = make;
        this.color = color;
    }


    /**
     * 10. Override the toString method to return the make and color of the vehicle e.g. (Honda, Black)
     * @return String
     */
    @Override
    public String toString() {
        return this.make + ", " + this.color;
    }
}
