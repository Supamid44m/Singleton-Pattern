public class DemoSingleton{
    public static void main(String[] args) {
        ///Moon a0 = new Moon(); can't run
        Moon a1 = Moon.getInstance ();
        Moon a2 = Moon.getInstance();
        
        a1.showInfo();

        System.out.println(a1==a2);
        
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}