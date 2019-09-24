import java.util.Scanner;

public class testing {
    int n1,n2,i,k;
    public testing(){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length of the first vector");
        n1=scan.nextInt();
        int[] vector1= new int[n1];
        System.out.println("enter the length of the second vector");
        n2=scan.nextInt();
        int[] vector2=new int[n2];
        int[] vector3=new int[n1+n2];
        for(int i=0;i<n1;i++){
            System.out.println("enter the"+" "+i+" "+"number of the first vector");
            vector1[i]=scan.nextInt();
        }
        for(int k=0;k<n2;k++){
            System.out.println("enter the"+" "+i+ " "+"number of the second vector");
          vector2[k]=scan.nextInt();
        }
        System.out.println("the values of the combined numbers are");
        for(int i=0;i<n1;i++){
            System.out.print(vector1[i]+" ");
        }
        for(int k=0;k<n2;k++){
            System.out.print(vector2[k]+" ");
        }

    }
    public static void main(String arg []){
          testing mytest=new testing();

    }
}
