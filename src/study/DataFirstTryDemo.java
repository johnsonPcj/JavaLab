package study;

import  java.lang.Math;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class DataFirstTryDemo{
    public static void main(String[] args) {
       /* String mon;
        study.DateFirstTry date1, date2;
        date1 = new study.DateFirstTry();
        date2 = new study.DateFirstTry();
        study.DateFirstTry date3 = new study.DateFirstTry();
        date3.readInput();
        System.out.println(date3.getMonth());

        System.out.println(date1.getMonthname());
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;
        System.out.println("date1:");
        date1.writeOutput();

        mon = date1.getMonth();
        System.out.println(mon);

        date2.month ="July";
        date2.day = 4;
        date2.year = 1776;
        System.out.println("date2:");
        date2.writeOutput();
        date2.readInput();


        System.out.println(date2.getMonth());
        date1.makeItNewYears();
        date1.writeOutput();
        date1.yellIfNewYear();
        date2.yellIfNewYear();
        test();
        test2(123); */

        int a=2, b=3;
        System.out.println(pow(a,b));

        int [] num = new int [100];

        int [] count;
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<100;i++){
            num[i] = (int) (Math.random()* 100);

            System.out.print(num[i] + " ");
        }
        System.out.println();
        for (int i=0; i<100;i++){
            for (int j=i+1; j<100;j++){
                if (num[i]==num[j])
                {
                    int flag = 1;
                    for(int k=0; k< list.size();k++){
                        if (num[i]==list.get(k)){
                            flag = 0;
                            break;
                        }

                        }
                    if(flag == 1){
                        list.add(num[i]);

                    }
                }

            }
        }
        count = new int[list.size()];
        for(int i=0;i< list.size();i++){
            for(int j=0;j<100;j++){
                if (list.get(i)==num[j]){
                    count[i]++;
                }
            }
            System.out.println(list.get(i) +","+count[i]);
        }
    }
    public static void test()
    {
        for (int i =1; i <=6;i++)
        {
            for(int k =1; k<=6;k++)
            {
                if(k==i)
                    System.out.print(2*k);
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        for (int i =1; i <=6;i++)
        {
            for(int k =1; k<=i-1;k++)
                System.out.print("-");
            System.out.print(2*i);
            for(int k=1; k<=6-i;k++)
                System.out.print("-");
            System.out.println();
        }
        for (int i =1; i <=6;i++)
        {
            for(int k =1; k<=i-1;k++)
                System.out.print("-");
            System.out.print(2*i);
            for(int k=i+1; k<=6;k++)
                System.out.print("-");
            System.out.println();
        }
    }
    public static void test2(int n)
    {
        int rem, revNum = 0;
        for(int i=0;i<=n;i++){
            rem = n%10;
            revNum = revNum*10 +rem;
            n/=10;
        }
        System.out.println(revNum);
    }

}



