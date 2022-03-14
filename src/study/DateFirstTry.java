package study;

import java.util.Scanner;

public class DateFirstTry {
    public String month;
    public int day;
    public int year; //a four digit number.

    public void writeOutput(){
        System.out.println(month+" "+day+", "+year);
    }
    public void makeItNewYears(){
        this.month = "January";
        this.day = 1;
    }
    public void yellIfNewYear(){
        if(this.month == "January" && this.day ==1){
            System.out.println("hurrah!");
        }
        else{
            System.out.println("Not New Year's Day.");
        }
    }
    public String getMonth()
    {
        return this.month;
    }
    public String readInput() {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter month, day, and year.");
         System.out.println("Do not use a comma.");
         month = keyboard.next();
         day = keyboard.nextInt();
         year = keyboard.nextInt();
        return month;
    }
    public int getMonthname()
    {
        String [] Month = {"Jan", "Feb", "Mar", "April",
                "May", "Jun", "Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec"};
        String name = readInput();
        int i;
        for(i=0; i<12; i++){
            if (name.equals(Month[i]))
                break;

        }

        return i+1;
    }
}
