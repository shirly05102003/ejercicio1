import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetirmenu = true;

        while (repetirmenu) {
            System.out.println(" Ingresa el primer numero: ");
            int numero1 = scanner.nextInt();

            System.out.println(" Ingresa el segundo numero: ");
            int numero2 = scanner.nextInt();

            System.out.println("Selecciona una operacion: ");
            System.out.println("1. suma ");
            System.out.println("2. resta ");
            System.out.println("3. multiplicacion ");
            System.out.println("4. division ");
            System.out.println("5. Salir");

            System.out.println("Ingresa el numero de la operacion ");
            int operaciones = scanner.nextInt();

            int resultado = 0;
            switch (operaciones) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println(numero1 / numero2);
                    } else {
                        System.out.println("Error, la operacion no se puede realizar");
                        continue;
                    }
                    break;
                case 5:
                    repetirmenu = false;
                    continue;

            }
            System.out.println(" el resultado es: " + resultado +"\n");
        }
    }
}