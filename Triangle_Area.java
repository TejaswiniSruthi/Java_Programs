import java.util.Scanner;
class Area{
    public static void main(String args[]){
        double a,b,c,res,area;
        Scanner s=new Scanner(System.in);
        a= s.nextDouble();
        b= s.nextDouble();
        c= s.nextDouble();
        res=(a+b+c)/2.0d;
        area = Math.sqrt(res*(res-a)*(res-b)*(res-c));
        System.out.format("%.2f",area);
    }
}
