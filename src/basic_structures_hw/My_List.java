package basic_structures_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class My_List extends ArrayList  {
   private ArrayList<Integer> ll;


    public ArrayList<Integer> getLl() {
        return ll;
    }

    public My_List(int numbers, int maxValue) {
        this.ll = new ArrayList<Integer>(); // create list
        for (int i = 0; i < numbers; i++) {
            ll.add((int) (Math.random() * maxValue));
        }
    }

    public ArrayList<Integer> multiple(ArrayList arl, int devider) {                     // метод ищёт в списке числа делящиеся на devider
        Iterator<Integer> iter = arl.iterator();
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int buffer;
        while (iter.hasNext()) {
            buffer = iter.next();
            if (buffer % 3 == 0)
                sublist.add(buffer);
        }
        return sublist;
    }

    public ArrayList multipleRemove(ArrayList arl, int devider) {                     // метод ищёт в списке числа делящиеся на devider и удаляет их
        arl.removeAll(multiple(arl, devider));
        return arl;
    }

    public static void show(ArrayList e) {                // метод выводит список
        for (int i = 0; i < e.size(); i++)
            System.out.print(" " + e.get(i));
    }

    public ArrayList randomRemove(ArrayList arl) {
        int i = (int) (Math.random() * arl.size());
        arl.remove(i);
        return arl;
    }

    public ArrayList addFirst(ArrayList arl) {
        int q;
        for (int i = 0; i < 5; i++) {
            q = (int) (Math.random() * 100);
            arl.add(0, i);
        }
        return arl;
    }

    public ArrayList addLast(ArrayList arl) {
        int q;
        for (int i = 0; i < 5; i++) {
            q = (int) (Math.random() * 100);
            arl.add(arl.size() - 1, i);
        }
        return arl;
    }

    public ArrayList addMid(ArrayList arl) {
        int q;
        for (int i = 0; i < 5; i++) {
            q = (int) (Math.random() * 100);
            arl.add((int) ((arl.size() - 1) / 2), i);
        }
        return arl;
    }

    public ArrayList descSort(ArrayList arl){
        Collections.sort(arl,Collections.reverseOrder());
        return arl;
    }



}