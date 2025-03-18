import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);

        System.out.println("Ingresa un numero ");
        int numero1 = scammer.nextInt();

        System.out.println("Ingresa un numero ");
        int numero2 = scammer.nextInt();

        System.out.println("Ingresa un numero ");
        int numero3 = scammer.nextInt();

        if (numero1 + numero2 >numero3 && numero2 + numero3 >numero1 && numero1 + numero3 > numero2){
            if (numero1 == numero2 && numero2 == numero3){
                System.out.println("Es un triangulo equilatero ");
            }
            else if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3){
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