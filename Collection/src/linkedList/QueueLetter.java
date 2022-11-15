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
public class QueueLetter {
    public static void main(String[] args) {
        LinkedList<String> lettersX = new LinkedList<>();
        lettersX.add("A");
        lettersX.add("B");
        lettersX.add("C");
        lettersX.add("D");
        
        System.out.println(lettersX.get(1));
        
        System.out.println("Linked list: " +lettersX);
        System.out.println("Queue size: " +lettersX.size());
        
        while(!lettersX.isEmpty())
            System.out.println(lettersX.removeFirst());
        System.out.println("Linked list: " + lettersX);
    }
}
