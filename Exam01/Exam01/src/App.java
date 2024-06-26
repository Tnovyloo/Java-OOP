import toolsPackage.Pen;
import typeGenerics.Box;
import typeGenerics.Pair;
import typeGenerics.Fruits.Apple;
import typeGenerics.Fruits.Fruit;
import typeGenerics.Fruits.FruitTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import classPackage.*;
import customExceptions.FileHandler;
import customExceptions.StudentException;

public class App {
    // This Java project is only for reminding purposses.
    public static void main(String[] args) throws Exception {

        // Testing abstractions, interfaces and access modifiers

        Pen pen = new Pen("Blue", "0.8mm");

        // Use the overrided abstract method from DrawingTool.
        pen.draw();
        // Use the second method with other initialization parameter.
        pen.draw("Hello");

        pen.getOS();

        // By default all class are protected into package so this line is not gonna work
        // ProtectedClass protectedClass = new ProtectedClass();

        // In public class we have usage of protected createInnerInstance1
        PublicClass publicClass = new PublicClass();
        publicClass.doSmth();

        // We could only from here use public method in OutterClass
        OutterClass outterClass = new OutterClass();
        outterClass.createInnerInstance2();

        TestClass testClass = new TestClass();
        // testClass.counter();
        TestClass.counter();

        // Exceptions. We have created StudentException that extends from Exception. Now we could handle this below.
        FileHandler fileHandler = new FileHandler();

        try {
            fileHandler.saveFile();
        } catch (StudentException e) {
            System.out.println(e);

            System.out.println("I am gonna print 'T' !");
        } catch (Exception e) {
            System.out.println("Other exception");
        } finally {
            System.out.println("Closing file");
        }

        // Lists
        // We can make this notation without providing any length
        // int[] numbersList;

        // Initializing numbersList with size
        // int[] numbersList = new int[10];

        // Initializing numbersList with values
        int[] numbersList = {1, 2, 3, 4, 5};
        for (int i : numbersList) {
            System.out.println(i);
        }

        // Using collections.
        // Interface Collection creates abstract methods for Lists and Sets.
        // Interface of List inheritance from Collection and defines new methods.
        // Implementations of List is: ArrayList and LinkedList, they implements all methods of 
        // List and Collection interfaces.
        
        // So we are making a new ArrayList with constructor that takes collection of our numbers
        ArrayList<Integer> newIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (Integer integer : newIntegers) {
            System.out.println(integer);
        }

        // We cannot create List with simple int. We have to use Integer class that is a 'box' for our int
        // List<int> newIntegers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Creating an minimal length of objects that could be saved without relocation of memory
        newIntegers.ensureCapacity(10);
        
        // trims current length of collection to actual length of elements.
        newIntegers.trimToSize();

        // We could make Iterator and use it to itterate over our ArrayList
        Iterator<Integer> newIntegersIterator = newIntegers.iterator();
        while (newIntegersIterator.hasNext()) {
            System.out.println(newIntegersIterator.next());
        }

        // In Java we have also Linked List, it uses two-directional lists. Basiclly it's slower in getting elements by indexes.
        // But! it is faster than ArrayList if we talking about editing and removing operations.
        // LinkedList implements Queue and Dequeue so it's good for implementing Queues and stacks.

        LinkedList<Integer> newLinkedList = new LinkedList<>(Arrays.asList(11100, 2, 3, 4, 5, 6, 8));
        Iterator<Integer> linkedIterrator = newLinkedList.iterator();
        while (linkedIterrator.hasNext()) {
            System.out.println(linkedIterrator.next());
        }

        // Now lets learn something about Sets. Sets could only store individual elements.
        // We have two implementations of Sets - HashSet and TreeSet. HashSet type generics must implement hashCode().
        HashSet<Integer> newHashSet = new HashSet<>(Arrays.asList(1001, 32, 23, 32, 1101, 1001));
        Iterator<Integer> hashSetIterator = newHashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        TreeSet<Integer> newTreeSet = new TreeSet<>(Arrays.asList(1, 1, 1, 1, 1007));
        Iterator<Integer> treeSetIterator = newTreeSet.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }

        // Fundamentals of typ generics. Lets make an Box Class.
        Box<Integer> newBox = new Box<>();
        // Now we could only setElement to Integer type, not other class.
        newBox.setElement(5);
        System.out.println("You make a Integer generic type, now getElement will return Integer.  " + newBox.getElement());
        newBox.printTypeOfElement();

        // Maps, we have Java map implementations like: HashMap and TreeMap
        // HashMap has linear time execution in operations like insertions and search.
        // TreeMap is automatically sorted, we could do subMap().

        HashMap<String, String> newHashMap = new HashMap<>();
        newHashMap.put("a", "Orange");
        newHashMap.put("c", "Cucumber");
        newHashMap.put("b", "Test");
        
        // HashMaps doesnt have an Iterator function to return Iterator class.
        System.out.println(newHashMap);


        // Let's create an TreeMap
        TreeMap<Integer, String> newTreeMap = new TreeMap<>();
        newTreeMap.put(2, "Cucumber");
        newTreeMap.put(1, "Orange");
        newTreeMap.put(0, "Test");
        System.out.println(newTreeMap);


        // Type generics in Classes.
        // Remember that you can only use Reference type as generic type. No int, booelan - Only Integer, Boolean etc.
        Pair<Integer, String> newPair = new Pair<>();
        newPair.setFirstElement(1);
        newPair.setSecondElement("null");

        // Now lets create Type Generics in Method (in the same class)
        newPair.functionWithTypeGenerics(newHashMap, newTreeMap);

        // Lets learn how covariation and countervariation, bivariation works in Java type generics.
        // Covariation
        ArrayList<? extends Fruit> fruitsArrayList = new ArrayList<>();
        // Cannot add any Apple or Fruit class because its only readable.
        // fruitsArrayList.add(new Apple());

        
        // Countervariation, we could only add all classes that 'Parent' is Fruit
        ArrayList<? super Fruit> fruitsAndOtherArrayList = new ArrayList<>();
        fruitsAndOtherArrayList.add(new Fruit());
        fruitsAndOtherArrayList.add(new Apple());
        // We cannot add FruitTree because it is higher on hierarchy than Fruit.
        // fruitsAndOtherArrayList.add(new FruitTree());
        System.out.println(fruitsAndOtherArrayList.get(1));

        ArrayList<Object> anyTypeArrayList = new ArrayList<>();
        anyTypeArrayList.add(new Fruit());

        anyTypeArrayList.get(0);

    }
}
