/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.map;

import java.util.HashMap;

/**
 *
 * @author fadillarizky
 */
public class BallTest {
    
    public static void main(String[] args) {
        HashMap<String, String> ballBowl = new HashMap<>();
        addElements("Basket", "Orange", ballBowl);
        addElements("Volley", "White", ballBowl);
        addElements("Tennis", "Green", ballBowl);
        addElements("Takraw", "Brown", ballBowl);
        
        displayElements(ballBowl);
        
        getValue("Takraw", ballBowl);
    }
    
    public static void addElements(String key, String value, HashMap<String, String> ballBowl) {
        ballBowl.put(key, value);
    }
    
    public static void getValue(String key, HashMap<String, String> ballBowl) {
        boolean tetot = false;
        if(ballBowl.get(key)== null)
            System.out.println(tetot);
        else
            System.out.println(ballBowl.get(key));
    }

    private static void displayElements(HashMap<String, String> ballBowl) {
        for(HashMap.Entry<String, String> ball: ballBowl.entrySet())
            System.out.println("Ball: " + ball.getKey()
                                + "\tColor : " + ball.getValue());
    }
}
