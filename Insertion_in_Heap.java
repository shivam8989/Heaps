package Heap_Priority_Queues;
import java.util.*;
public class Insertion_in_Heap {
    static class Heap{
        ArrayList<Integer> al = new ArrayList<>();
        public void add(int data){
            //Add at last index
            al.add(data);
            int x = al.size()-1;// child index o(log n)

            int parent = (x-1)/2;

            while(al.get(x)<=al.get(parent)){
                //Swap
                int temp = al.get(x);
                al.set(x,al.get(parent));
                al.set(parent,temp);
            }

        }
    }

    public static void main(String[] args) {

    }

}
