import java.util.Scanner;
class Conversion{
    public static void main(String args[]){
        Scanner i=new Scanner(System.in);
        double c=i.nextDouble();
        double F;
        F=32+(c*9/5);
        System.out.format("%.2f",F);
    }
}
