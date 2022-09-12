import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float result;

        System.out.println("ingrese num1");
        num1 = sc.nextFloat();
        System.out.println("ingrese num2");
        num2 = sc.nextFloat();
        System.out.println("ingrese num3");
        num3 = sc.nextFloat();
        if (num1 <0){
            result = num1*num2*num3;
            System.out.println(result);
        } else {
            result = num1+num2+num3;
            System.out.println(result);
        }
    
}
}
    