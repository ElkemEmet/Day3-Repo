package InterviwQuestion;

public class A {
    protected void methodA(){
        System.out.println("A");
    }
}
class V extends A{
    public void methodA(){
        System.out.println("C");

    }

    public void methodB(){
        System.out.println("B");
    }


}
