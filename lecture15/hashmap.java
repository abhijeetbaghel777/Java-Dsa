import java.util.*;

class hashmap {// combination of key value with corresponding key pointing value
   
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 10);
        map.put(1, 90);
        map.put(2, 50);
        map.put(3, 30);
        map.put(4, 40);

        System.out.println(map);
        System.out.println(map.get(4));// used to get the value at a particular key
        System.out.println(map.getOrDefault(11, 0));// it is used to get the default value if the searching key is not present
        System.out.println(map.keySet());// used to get a set of all keys
        for(int x:map.keySet()){
            System.out.println(map.get(x));
        }
    }
}
