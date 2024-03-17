import java.util.*;
public class hashmap{
    public static void main (String[] args){
        HashMap<String,Integer> hm= new HashMap<>();

        //Insert
        hm.put ("India",150);
        hm.put ("china",100);
        hm.put ("us",50);
        System.out.println(hm);

        //get
        int population = hm.get("India");
        System.out.println(population);

        //cantainsKey -0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //remove
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
        

    }
    
}
