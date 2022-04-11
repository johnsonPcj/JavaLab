import java.util.ArrayList;
import java.util.Arrays;

class KV{
    int key;
    int value;
    public String toString() {
        return Integer.toString(key);
    }

}
public class RandomNumber {
    int [] num;
    int repeatCount;
    public RandomNumber(int range){
        num = new int [range];
        for (int i=0; i<range;i++){
            num[i] = (int) (Math.random()* range);
        }
        System.out.println(Arrays.toString(num));
    }

    public  void randomCount2(){
        int [] count;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<num.length;i++){
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

    public ArrayList<KV> randomCount(){
        ArrayList<KV> list = new ArrayList<KV>();
        for (int i=0; i<num.length;i++){
            for (int j=i+1; j<num.length;j++){
                int flag = 1;
                int k;
                if (num[i]==num[j])
                {
                    for( k=0; k< list.size();k++){
                        if (num[i]==list.get(k).key){
                            flag = 0;
                            break;
                        }
                    }
                    if(flag == 0){
                        list.get(k).value +=1;
                        break;
                    }
                    else if(flag == 1){
                        KV keyValue= new KV();
                        keyValue.key = num[i];
                        keyValue.value += 2;
                        list.add(keyValue);
                        break;
                    }
                }
            }
        }
        repeatCount = list.size();
        for (int i=0;i<repeatCount;i++){
            System.out.println(list.get(i).key+","+list.get(i).value);
        }
        return list;
    }

    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        RandomNumber RandomNumber100 = new RandomNumber(arg);
        RandomNumber100.randomCount2();
        ArrayList<KV> list = RandomNumber100.randomCount();
    }
}
