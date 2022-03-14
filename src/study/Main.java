package study;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l00402169
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====+ Hello，world！Welcome to CP Club +========");
        //转义字符:\t   制表符,\n  换行
        System.out.println("Hello\tWorld!");    //Hello	World
        System.out.println(14.0/3);    //Hello
        //World

        System.out.println("=============================" +
                "====================");

        System.out.println("=================== +data type +=================");

        int a = 10;
        int b,c;
        //++  --  自增  自减    一元运算符
        b = a++;    //执行完这行代码后，先给b赋值，再自增
        //a++   a = a+1;
        System.out.println(a);

        //++a   a = a + 1
        c = ++a;     //执行完这行代码后，先自增，再给c赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        float f1 = -0.6f;
        System.out.println((a <= 0.0F) ? 0.0F - f1 : f1);//三目运算符

        System.out.println("==================mod operation==================");
        System.out.println("6 % 8 = " + 6 % 8);
        System.out.println("===========+====power operation===========+======");
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        double pow1 = Math.pow(4, 5);
        System.out.println(pow1);

        System.out.println(" ");
        /*JDK7新特性 ， 数字之间可以用下划线分割.操作比较大的数的时候，注意溢出问题*/
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;  //-1474836480,计算的时候溢出了
        long total2 = money * years;//-1474836480，默认是int，转换之前已经存在问题了
        long total3 = money * ((long) years);    //先把一个数转换为Long型
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println("======+ 关系运算符返回的结果: true or false +=====");
        //布尔值扩展
        boolean flag = true;
        if (flag == true) {
        }//新手
        if (flag) {
        }//老手
        a = 10;
        b = 20;
        c = 21;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(c % a);//取余，，模运算

        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);            //false
        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);            //true

        //BigDecimal  数学工具类
        //float    有限   离散   舍入误差   大约  接近但不等于
        //double
        //最好避免完全使用浮点数进行比较
        //最好避免完全使用浮点数进行比较
        //最好避免完全使用浮点数进行比较
        float f = 0.1f;//0.1
        double d = 1.0 / 10;//0.1

        System.out.println(f == d);        //false

        float d1 = 32323231313232323232f;
        float d2 = d1 + 1;

        System.out.println(d1 == d2);        //true

        System.out.println("==================数值进制及转换====================");
        int i = 10;//十进制
        int i1 = 010;//八进制0
        int i2 = 0b10;//二进制0b
        int i3 = 0x10;//十六进制0x
        System.out.println(i);            //i=10
        System.out.println(i1);            //i1=8
        System.out.println(i2);            //i2=2
        System.out.println(i3);            //i3=16
        /*字符拓展
        *所有的字符本质还是数字,编码 Unicode 表：（97 = a    65 = A）  2字节   0 - 65536
        U0000   ~  UFFFF
        */
        char c1 = 'a';
        char c2 = '中';//'中';
        char c3 = '\u0061';
        System.out.println(c1);          //a
        System.out.println((int) c1);    //97
        System.out.println(c2);          //中
        System.out.println((int) c2);    //20013
        System.out.println(c3);          //a

        System.out.println("\n============+loop,for example：乘法口诀表+==========");
        // 对于初始化变量，每次执行语句后更新变量，直到不满足条件
        for (int k = 0; k < 10; k++) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }

        System.out.println("============ import :calendar data type =========");
        Calendar calendar;
        calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getWeekYear());

        System.out.println("======================+ array +==================");
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);
        System.out.println("===class operation:abstract class and inherit===");
        Chinese aChinese = new Chinese();
        aChinese.sleep();
        aChinese.speak();
        // 利用构造器创建对象
        Computer myComputer = new Computer("Intel", "NVIDIA", "sanxing", "NVIDIA");
        System.out.println("=============== recursive function ==============");
        int aNumber =5;
        System.out.print(aNumber+"! = ");
        int factorial = myComputer.recursiveFunctionTest(aNumber);
        System.out.println(" = "+factorial);
        myComputer.showComputerAttribute();
    }
}

        /* class : encapsulation and inheritance*/
abstract class Person{

    private String name;
    public void sleep(){
        System.out.println("It needs spleeping as a person");
    }
    public void Person(String name){
        this.name = name;
    }
    abstract void speak();
}

 class Chinese extends Person{

    @Override
    void speak() {
        System.out.println("study.Chinese speak zhongwen");
    }
}

class American extends Person{

    @Override
    void speak() {
        System.out.println("美国人说美语");
    }
}

class Computer{
    //修饰符不存在先后顺序
    static final double PI = 3.14159265957;
    final static double PI1 = 3.14;
    static boolean isPerson = true;
    private final String cpu;
    private final String arm;
    private final String disk;
    private final String screen;

    public Computer(String cpu, String arm, String disk, String screen){
        this.cpu = cpu;
        this.arm = arm;
        this.disk = disk;
        this.screen = screen;
        System.out.println(PI);
    }
    public void showComputerAttribute(){

        System.out.println(cpu + "," + arm + ","+ disk + "," + screen);
    }
    public int recursiveFunctionTest(int number) {
        System.out.print(number);
        if (number == 1) {
            return 1;
        }
        else {
            System.out.print(" * ");
            return number*recursiveFunctionTest(number-1);
        }
    }
}
