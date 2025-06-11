import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorDeMonto {

    public static double obtenerMontoValido(Scanner teclado){
        double monto=0;
        boolean montoValido= false;

        while (!montoValido){
            System.out.println("Ingrese el valor que deseas convertir: ");
            try {
                monto = teclado.nextDouble();
                if (monto<=0){
                    System.out.println("El monto debe ser mayor a 0. Intente de nuevo\n");
                }else {
                    montoValido = true;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                teclado.next();//Descarta la entrada incorrecta.
            }
        }
        return monto;
    }
}
