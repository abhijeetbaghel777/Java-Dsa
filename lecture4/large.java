class large{
        public static void main(String [] args){
        String str = "Java is an powefull language";
        String a[] = str.split(" ");
        String largest = "";
        for(String val: a){
            if(val.length()>largest.length()){
                largest=val;
            }
        }
        System.out.println(largest);
    }
}

//     public static void main(String [] args){
//         String str = "Java is an powefull language";
//         String a[] = str.split(" ");
//         String largest = "";
//         for(String val: a){
//             if(val.length()>largest.length()){
//                 largest=val;
//             }
//         }
//         System.out.println(largest);
//     }
// }