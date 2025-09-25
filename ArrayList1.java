import java.util.*;
public class ArrayList1{
    public static void main(String [] args)
    {
        List<String> list= new ArrayList<String>();
        list.add("vedant");
        list.add("sahil");
        list.add("gaurav ");
        list.add("pritesh");
        list.add("aniket");
        list.add("mayuri");
        list.add("vedant");
        System.out.println(list);

        Iterator<String> it= list.iterator();

        while(it.hasNext())
        {
            System.out.println(" "+it.next());
        }
        HashSet<String> tree= new HashSet<>(list);
        System.out.println("Print element using tree \n"+tree);



    }
}
