import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        intArrayDemo();
        classArrayDemo();
    }

    public static void  intArrayDemo() {
        List<Integer> arrayList = new ArrayList<>();
        System.out.printf("Before add:arrayList.size() = %d\n", arrayList.size());//array[10];array[20]

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.printf("After add:arrayList.size() = %d\n", arrayList.size());

        System.out.println("Printing elements of arrayList");

        // 第一种：通过索引值遍历
        System.out.print("通过索引值遍历:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");//arrayList[i]
        }
        System.out.println();

        // 第二种：for循环遍历
        System.out.print("for循环遍历:");
        for (Integer number : arrayList) {
            System.out.print(number + " ");
        }

        // 在指定位置添加元素
        arrayList.add(2, 2);
        // 删除指定位置上的元素
        arrayList.remove(2);
        // 删除指定元素
        arrayList.remove((Object) 3);
        // 判断arrayList是否包含5
        System.out.println("\nArrayList contains 5 is: " + arrayList.contains(5));

        // 清空ArrayList
        arrayList.clear();
        // 判断ArrayList是否为空
        System.out.println("ArrayList is empty: " + arrayList.isEmpty());
    }

    public static void classArrayDemo() {
        List<Student> arrayList = new ArrayList<Student>();//class reference
        Student stu1 = new Student("zhangsan", 10);//class reference
        Student stu2 = new Student("huangsan", 20);
        Student stu3 = new Student("yangsan", 30);
        Student stu4 = new Student("mandysan", 30);
        Student stu5 = new Student("marysan", 40);
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        arrayList.add(stu4);
        arrayList.add(stu5);
        Student stu6 = new Student("zhangsan", 10);
        System.out.println(arrayList.indexOf(stu6));//没有添加stu6,所以找不到
        //重写equals方法，就可以找到stu6，只要name和age一样，就可以
        System.out.println(arrayList.contains(stu6));//true,也用到了重写的equald()方法,只要name和age一样，就可以
        System.out.println(arrayList.remove(stu6));//true,实际是把stu1删掉了，也用到了重写的equald()方法
        System.out.println(arrayList.indexOf(stu1));//-1,找不到了
        System.out.println(arrayList.size());//4
    }
}

class Student{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student(String name, int age) {//Constructor
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;//自己跟自己比，返回true
            if (!(o instanceof Student student)) return false;//类型不一样，返回false
            return getAge() == student.getAge() &&
                    getName().equals(student.getName());//只有名字和年龄一样，才返回true
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }
}
