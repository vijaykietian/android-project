package com.vijju.hannu.myjavamvvmarchitecture;

public class HasHCodeClass {




    public static void main(String[] arg )
    {
        DemoClass d = new DemoClass("vijay");
        DemoClass d1 = new DemoClass("vijay");

        System.out.println(d1.hashCode());

        if(d.equals(d1))
        {
            System.out.println("true");
        }



    }
}


class DemoClass
{




    DemoClass(String name)
    {

}
}

