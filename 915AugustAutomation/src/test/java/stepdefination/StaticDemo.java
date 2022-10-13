package stepdefination;

public class StaticDemo {

    static int a=1;

    public static void main(String[] args) {

        System.out.println(a);

        StaticSample.m1();

        StaticSample s = new StaticSample();
        s.m2();
        StaticDemo d = new StaticDemo();
        d.h();

    }

    public  void h(){
        System.out.println(a);
    }




}
