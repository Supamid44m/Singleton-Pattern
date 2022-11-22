public class Moon{
    private int diameter = 3475;

    private static Moon instance = new Moon();
    
    //constuctor acces modifier is private 
    private Moon(){

    }
    //method
    public static Moon getInstance(){
        return instance;
    }

    public void showInfo(){
        System.out.println(diameter);
    }

}