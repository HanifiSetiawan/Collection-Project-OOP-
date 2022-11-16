/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection2;

import java.util.*;

/**
 *
 * @author Hanif
 */
public class Collection2 {

    public static void main(String[] args) {
        
        System.out.println("----MOVIE GENRE LIST USING DIFFERENT METHODS----");
        System.out.println("\n\n");
        
        //using List
        List<String> shoppingList = new ArrayList<>();
 
        shoppingList.add("Comedy");
        shoppingList.add("Action");
        shoppingList.add("Horror");
        shoppingList.add("Romance");
 
        System.out.println("List :");
        for (String fruit : shoppingList)
        {
            System.out.println(fruit);
        }
        System.out.println("");
        
        //using Set
        Set<String> Set = new HashSet<String>();
        Set.add("Comedy");
        Set.add("Action");
        Set.add("Horror");
        Set.add("Romance");
        
        System.out.println("Set :");
        System.out.println(Set);
        System.out.println("");
        
        //using Map
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Comedy");
        map.put(2, "Action");
        map.put(3, "Horror");
        map.put(4, "Romance");
 
        System.out.println("Map :");
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("");
        
        //using LinkedList (Stack)
        LinkedList<String> linkedListStack = new LinkedList<String>();
        linkedListStack.add("Comedy");
        linkedListStack.add("Action");
        linkedListStack.add("Horror");
        linkedListStack.add("Romance");
        
        System.out.println("LinkedList (Stack)");
        System.out.println(linkedListStack);
        System.out.println("After pop");
        linkedListStack.removeLast();
        System.out.println(linkedListStack);
        System.out.println("\n");
        
        //using LinkedList (queue)
        LinkedList<String> linkedListQueue = new LinkedList<String>();
        linkedListStack.add("Comedy");
        linkedListStack.add("Action");
        linkedListStack.add("Horror");
        linkedListStack.add("Romance");
        
        System.out.println("LinkedList (Queue)");
        System.out.println(linkedListStack);
        System.out.println("after dequeue:");
        linkedListStack.remove();
        System.out.println(linkedListStack);
    }
    
}
