
/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Question4a
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r;
        double area = sc.nextDouble();
        
        r = Math.sqrt(area/Math.PI);
        System.out.println(r);
    }
}
