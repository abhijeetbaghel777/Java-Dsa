public class vowel {
    public static void main(String[] args) {
        String str="Abhijeet";
        int vowels=0;
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                vowels++;
            }
        }
        System.out.println(vowels);


    }
}
