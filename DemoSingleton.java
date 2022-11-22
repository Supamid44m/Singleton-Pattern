public class DemoSingleton{
    public static void main(String[] args) {
        ///Moon a0 = new Moon();
        Moon a1 = Moon.getInstance ();
        
        a1.showInfo();
    }
}