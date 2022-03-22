import java.util.ArrayList;
import java.util.List;

class KV{
    int key;
    int value;
}
public class RandomNumber {
    public static void main(String[] args) {
        randomCount();
        randomCount2();
    }
    public  static void randomCount2(){
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
    public static void randomCount(){
        int [] num = new int [100];

        List<KV> list = new ArrayList<KV>();
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
                        if (num[i]==list.get(k).key){
                            flag = 0;
                            list.get(k).value +=1;
                            break;
                        }
                    }
                    if(flag == 1){
                        KV keyValue= new KV();
                        keyValue.key = num[i];
                        keyValue.value += 2;
                        list.add(keyValue);
                    }
                }
            }
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).key+","+list.get(i).value);
        }
    }
}
