
/**
 * Write a description of class question4b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class question4b
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double ax = sc.nextDouble();
        double ay = sc.nextDouble();
        double bx = sc.nextDouble();
        double by = sc.nextDouble();
        
        double disx= ax-bx;
        double disy=ay-by;
        double fdis=Math.sqrt(disx*disx+disy*disy);    
        System.out.println(fdis);
    }
}

