package showb;

public class ShowB {
    public void showMethodName(){
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
