import java.util.ArrayDeque;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;


public class ArrayDequeLearn {
    public static void main(String [] args)
    {
        ArrayDeque<Integer> list= new ArrayDeque<>();
        list.offer(50);
        list.offer(10);
        list.offer(30);
        list.offer(40);
        list.offer(2);
        System.out.println(list);

        list.offerFirst(100);  //add element first of the Deque
        System.out.println(list);

        list.offerLast(200); // add element last of queue
        System.out.println(list);

        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<list.size();i++)
        {
            System.out.println(hs);
        }


    }
}
