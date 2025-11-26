import java.util.*;
class nonrepeating {
    public static void main(String[] args) {
        HashMap<Character,Integer> map= new HashMap<>();
        String arr="aabbccddeefgh";
        for(char ch:arr.toCharArray()){
           map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
for(char ch:arr.toCharArray()){
    if(map.get(ch)==1){
        System.out.println(ch);
        break;
    }
}
    }
}
