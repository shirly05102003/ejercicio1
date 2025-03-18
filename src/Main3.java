import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main3 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        int n = 4;
        int inicio = 0;
        int limite = n-1;
        int contador = 1;

        while (contador<=(n*n)){
            for (int i=inicio; i<=limite; i++ ){
                matriz [inicio][i]= contador++;
            }
            for (int i=inicio+1; i<=limite; i++){
                matriz [i][limite] = contador++;
            }
            for (int i=limite-1; i>=inicio; i--){
                matriz [limite][i]=contador++;
            }
            for (int i=limite-1; i>=inicio+1; i--){
                matriz [i][inicio]= contador++;
            }
            inicio++;
            limite--;
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
