package com.company;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    public static void main(String[] args) {
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
}
