package dataStructureCourseDesign.Title1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个一元多项式:");
//        String m = in.next();
        Polynomial first = new Polynomial(2,4);

        System.out.println("请输入想要进行的操作");
//        String sign  = in.nextLine();
        String sign  = "+";
        System.out.println("请输入第二个一元多项式:");
//        String n = in.next();
        Polynomial second = new Polynomial(3,4);

        Polynomial result=realize.add(first,second,sign);

        System.out.println(first.toString()+" "+sign+" "+second.toString()+" = "+ result.toString() );

    }




}
