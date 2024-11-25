package client;

import developer.OS;
import developer.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
//        developer.OS obj=new developer.Android();
//        obj.spec();
        //we are providing the implementation here itself.
        //if we want to change the developer.Android to developer.Windows in-future, we have to recompile it
        //That mean your client knows which class you are working with

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();

        //Even if you have extra class in future it will not change the client application
        //it will change only the OperatingSystemFactory class
    }
}

