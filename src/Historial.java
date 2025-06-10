import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Historial {
    private final File archivo = new File("historial.txt");

    public void crearArchivoSiNoExiste(){
        try {
            if (archivo.createNewFile()){
                System.out.println("Archivo historial.txt creado.");
            }

        }catch (IOException  e){
            System.out.println("Error al crear el archivo: "+ e.getMessage());
        }
    }


    public void guardarConversion(String base,String destino, double monto,
                                 double resultado,String fecha ){

        try(FileWriter escritura = new FileWriter(archivo,true)) {
            escritura.write(String.format("%s - %.2f %s => %.2f %s\n",
                    fecha,monto,base,resultado,destino));

        } catch (IOException e) {
            System.out.println("Error al guardar la conversasión "+ e.getMessage());
        }
    }

    public void mostrarHistorial(){
        if (!archivo.exists()){
            System.out.println("No hay historial de conversiones todavía.");
            return;
        }

        System.out.println("     ===== Historial de conversiones =====      ");


        try(Scanner lector = new Scanner(archivo)) {
            while(lector.hasNextLine()){
                System.out.println(lector.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el historial: "+e.getMessage());
        }

    }


}
