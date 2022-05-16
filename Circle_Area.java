import java.util.Scanner;
class Area{
    public static void main(String args[]){
        Scanner i=new Scanner(System.in);
        double r,area;
        r=i.nextDouble();
        area=(3.14)*r*r;
        System.out.format("%.2f",area);
    }
}
