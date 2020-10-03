import java.util.Scanner;
public class question4c
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double n = sc.nextDouble();
        
           
        System.out.println(p*(Math.pow((1+r),n)));
    }
}