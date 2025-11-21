class subscribe{
    private int subscribercount=10000;
    private String Ytname="Abhijeet";
    public void getSubscriber(){
        System.out.println("NO of subscribes: "+subscribercount);
    }
    public void unsubscribe(){
        subscribercount--;
        System.out.println(subscribercount);
    }
    public void subscribe(){
        subscribercount++;
        System.out.println("thanks for subscribing!!!\n Total subscribers: "+subscribercount);
    }
    public void data(){
        System.out.println("YT name=: "+Ytname);
        System.out.println("Total Subscribers: "+ subscribercount);
    }
}
class youtube {
    public static void main(String[] args) {
        subscribe s1=new subscribe();
        s1.getSubscriber();
        s1.unsubscribe();
        s1.subscribe();
        s1.data();
    }
}
