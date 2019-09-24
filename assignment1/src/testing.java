
import java.util.Scanner;

public class testing {
    public void calculate(){
        int n;
        System.out.println("enter the number of elements you want in an array");
        Scanner scan =new Scanner(System.in);
        n=scan.nextInt();
        int[] mylist=new int[n];
        for(int i=0;i<mylist.length;i++){
            System.out.println("enter number"+" "+i);
            mylist[i]=scan.nextInt();
        }
        System.out.println("the numbers entered are");
        for(int i=0;i<mylist.length;i++){
           System.out.print(mylist[i]+",");
        }
        System.out.println("the odd numbers are");
        for(int i=0;i<mylist.length;i++){
          if(mylist[i] % 2 != 0){
              System.out.print(mylist[i]+",");
          }
        }
        System.out.println("the even numbers are");
        for (int i=0;i<mylist.length;i++){
            if(mylist[i] % 2 == 0){
              System.out.print(mylist[i]+",");
            }

        }
    }
    public static void main(String arg []){
        testing mytest=new testing();
        mytest.calculate();
    }
}
