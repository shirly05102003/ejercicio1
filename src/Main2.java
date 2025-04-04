import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);

        System.out.println("Ingresa un numero ");
        int numero0 = scammer.nextInt();

        System.out.println("Ingresa un numero ");
        int numero1 = scammer.nextInt();

        System.out.println("Ingresa un numero ");
        int numero2 = scammer.nextInt();

        if (numero1 + numero1>numero2 && numero1 + numero2 >numero0 && numero0 + numero2 > numero1){
            if (numero0 == numero1 && numero1 == numero2){
                System.out.println("Es un triangulo equilatero ");
            }
            else if (numero0 == numero1 || numero1 == numero2 || numero0 == numero2){
                System.out.println("Es un triangulo Isosceles ");
            }
            else {
                System.out.println("Es un triangulo Escaleno ");
            }
        }else {
            System.out.println("Los valores ingresados no forman un triangulo ");
        }


    }
}