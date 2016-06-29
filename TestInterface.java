package DayThree;

import sun.plugin2.jvm.RemoteJVMLauncher;

/**
 * Created by student on 29/06/2016.
 */


interface  callBack
{
    void callback(int param);//no implementation
}

class client implements callBack
{
   public void callback(int param)
   {
     System.out.println("Callback with a limo!");
   }
}

class AnotherClient implements callBack
{
    public void callback(int param){
        System.out.println("Callback without a limo!");
    }

}
public class TestInterface
{
}
