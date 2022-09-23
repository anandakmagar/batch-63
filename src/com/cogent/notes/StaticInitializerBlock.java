package com.cogent.notes;

/*
   Static Initializer Block (SIB) gets executed when the class is first referenced
   and gets executed only once.
   It can be used to change the default values of static variables
 */
//class A{
//    static {
//        System.out.println("Static Block");
//    }
//    {
//        System.out.println("Non-Static Block");
//    }
//    A(int i){
//        System.out.println("Constructor");
//    }
//}
//public class StaticInitializerBlock {
//    public static void main(String[] args) {
//        System.out.println("Main started!");
//        A a = new A(6);
//    }
//}

class A033{
    static int j = 100;
    static {
        System.out.println("SIB-A033");
    }
    A033(){
        System.out.println("DC-A033");
    }
    {
        System.out.println("IIB-A033");
    }

}
public class StaticInitializerBlock {
    static {
        System.out.println("SIB-Manager033");
    }
    public static void main(String[] args) {
        System.out.println("Main Stared!");
        System.out.println(A033.j);
        A033 a1 = new A033();
        System.out.println("Main Ends!!");

    }
}
