/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

import java.util.LinkedList;

/**
 *
 * @author fadillarizky
 */
public class StackLetter {
    public static void main(String[] args) {
        LinkedList<String> lettersS = new LinkedList<>();
        lettersS.add("A");
        lettersS.add("B");
        lettersS.add("C");
        lettersS.add("D");
        
        System.out.println(lettersS.get(1));
        
        System.out.println("Linked list: " +lettersS);
        System.out.println("Queue size: " +lettersS.size());
        
        while(!lettersS.isEmpty())
            System.out.println(lettersS.removeFirst());
        System.out.println("Linked list: " + lettersS);
    }
}
