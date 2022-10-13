package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {


    @Before()
    public void pre(){

        System.out.println("Launch URL");

    }

    @After()
    public  void post(){
        System.out.println("Terminate the browser");
    }

}
