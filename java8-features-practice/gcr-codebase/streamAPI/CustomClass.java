import java.util.*;

public class CustomClass {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(null);
         list.add(4);
         list.add(null);
         List<Integer> l=list.stream().filter((x)->x!=null).toList();
         System.out.print(l.size());
    }
}
