import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public String obtenerFecha(){
        LocalDateTime fechaSinFormato = LocalDateTime.now();

        DateTimeFormatter formatoDeFecha = DateTimeFormatter.
                ofPattern("dd-MM-yyyy HH:mm:ss");

        //String fechaConFormato = fechaSinFormato.format(formatoDeFecha);


        return fechaSinFormato.format(formatoDeFecha);
    }
}
