public  class array {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int a=10;
        for(int i=0;i<5;i++){
            arr[i]=a;
            a=a+10;

        }
        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }

    }
}
// indexing starts from 0 because it represents the distance of certain element from starting