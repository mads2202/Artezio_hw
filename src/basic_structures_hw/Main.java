package basic_structures_hw;


import OOP.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
       // My_Number.numberWriter();
        //My_Number.numCounter(10,1,12);
        //Draw d=new Draw(8,'D');
        //d.getTriangle();
        My_List list=new My_List(10, 100);
        System.out.println(list.getLl());
        System.out.println(list.multiple(list.getLl(),3));
        System.out.println(list.multipleRemove(list.getLl(),3));
        System.out.println(list.multiple(list.getLl(),3));
        My_List.show(list.randomRemove(list.getLl()));
        System.out.println();
        System.out.println(list.addFirst(list.getLl()));
        System.out.println(list.addLast(list.getLl()));
        System.out.println(list.addMid(list.getLl()));
        System.out.println(list.descSort(list.getLl()));
        HashSet<Integer> uniq=new HashSet<Integer>(list.getLl());
        System.out.println(uniq.toString());

        Cat c1=new Cat("Barsik");
        Cat c2=new Cat("Persik");
        Bird b1=new Bird("Riki");
        Bird b2=new Bird("Flint");
        Dog d1=new Dog("Sharik");
        Dog d2=new Dog("Bobik");
        Horse h1=new Horse("Buran");
        Horse h2=new Horse("Veter");
        Kangaroo k1=new Kangaroo("John");
        ArrayList<Animal> arlist=new ArrayList<Animal>();
        arlist.add(c1);
        arlist.add(c2);
        arlist.add(d1);
        arlist.add(d2);
        arlist.add(h1);
        arlist.add(h2);
        arlist.add(b1);
        arlist.add(b2);
        arlist.add(k1);
        for(int i=0;i<arlist.size();i++){
        System.out.println(arlist.get(i).voice());
        if(arlist.get(i) instanceof Flyable)
            System.out.println(((Flyable) arlist.get(i)).fly());

        }













    }
}
