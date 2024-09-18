import java.lang.annotation.Repeatable;
import java.util.*;
import java.util.jar.Attributes.Name;

public class StringMethod{

    public static void main(String[] args) {
        String Name = "Himanshu";
        int value = Name.length();//Gives the length of the String 
        System.out.println(value);
        
        String lweString = Name.toLowerCase();//Gives the String in lower format
        System.out.println(lweString);

        String uprString = Name.toUpperCase();//Gives the String in upper format
        System.out.println(uprString);

        String trimmedname = "      PRIYANSHU     ";
        System.out.println(trimmedname);
        System.out.println(trimmedname.trim());//Trims the spaces
        System.out.println(Name.substring(2,8));/*Print letters from starting
                                                  index to ending index(but ending index is excluded)*/
        
        String naam = "Perry";
        System.out.println(Name.replace('i', 'e'));//Replaces the char in the Strings
        System.out.println(Name.replace("imanshu","ema Malini"));// also Replaces the sequence of char
        System.out.println(naam.replace('r', 'n'));/*Replaces all the char you want to replace
                                                    at once if the char occurs multiple times*/
        System.out.println(naam.replace("r", "tty"));//Replaces single elements into sequence 
        
        
        System.out.println(Name.startsWith("Him"));/*It is a Boolean type fun. tells the string is  
                                                      Starting or ending from the mentioned Word or not*/
        System.out.println(Name.endsWith("Him"));


        System.out.println(Name.charAt(5));//Gives the char at the specified index


        System.out.println(naam.indexOf("ry"));//Gives the index of the element which is occured first


    }
    
}
