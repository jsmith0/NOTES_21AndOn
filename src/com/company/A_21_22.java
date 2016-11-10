package com.company;

/**
 * Created by js456 on 11/3/16.
 */
public class A_21_22 {

    /*wrapper classes
    convert data into objects
    "wrap" a data type into an object...... number, boolean, or char into an object
    */

    int i = 10;
    Integer ic = 7;
    //see its an object, not an int....... this allows it to do a lot more stuff
    //Integer(wrapped).....int(standard).......integer(NOTHING)......

    //____Autoboxing____
    //this is essentailly obselete but its a thing'
    //automatic conversion of primitive and corresponding wrapper classes

    //_____ converting an int to a String _____

    int j = 104;
    String ss = Integer.toString(j);
    //this allows you to apply a string methods to ints
    //helps with "unbreakability"

    int e = 3;
    String s = "" +j; //automatically makes the int a string

}
