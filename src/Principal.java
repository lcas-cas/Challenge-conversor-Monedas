import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMonedas convertir = new ConsultaMonedas();

        String monedaBase = "";
        String monedaDestino = "";

        String menu = """
                ╔════════════════════════════════════════════════════════╗
                ║               Conversor de Monedas - Menú              ║
                ╠════════════════════════════════════════════════════════╣
                ║  1. Dólar => Peso argentino                            ║
                ║  2. Peso argentino => Dólar                            ║
                ║  3. Dólar => Real brasileño                            ║
                ║  4. Real brasileño => Dólar                            ║
                ║  5. Dólar => Peso colombiano                           ║
                ║  6. Peso colombiano => Dólar                           ║
                ║  7. Dólar => Colón costarricense                       ║
                ║  8. Colón costarricense => Dólar                       ║
                ║  9. Dólar => Boliviano boliviano                       ║
                ║ 10. Boliviano boliviano => Dólar                       ║
                ║ 11. Peso mexicano => Colón costarricense               ║
                ║ 12. Colón costarricense => Peso mexicano               ║
                ║ 13. Salir                                              ║
                ╚════════════════════════════════════════════════════════╝
                Seleccione una opción (1-13):
                """;


        int opcion;

        do {
            System.out.println(menu);
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                teclado.next();//descarta la entrada incorrecta
                System.out.println(menu);
            }

            opcion = teclado.nextInt();
            if (opcion >= 1 && opcion <= 12) {
                System.out.println("Ingrese el valor que deseas convertir: ");
                double monto = teclado.nextDouble();

                if (monto<=0){
                    System.out.println("El monto debe ser mayor a 0. Intente de nuevo\n");
                    continue;
                }


                switch (opcion) {
                    case 1: {
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    }
                    case 2: {
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                    }
                    case 3: {
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    }
                    case 4: {
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    }
                    case 5: {
                        monedaBase = "USD";
                        monedaDestino = "COP";
                        break;
                    }
                    case 6: {
                        monedaBase = "COP";
                        monedaDestino = "USD";
                        break;
                    }
                    case 7: {
                        monedaBase = "USD";
                        monedaDestino = "CRC";
                        break;
                    }
                    case 8: {
                        monedaBase = "CRC";
                        monedaDestino = "USD";
                        break;
                    }
                    case 9: {
                        monedaBase = "USD";
                        monedaDestino = "BOB";
                        break;
                    }
                    case 10: {
                        monedaBase = "BOB";
                        monedaDestino = "USD";
                        break;
                    }
                    case 11:{
                        monedaBase="MXN";
                        monedaDestino="CRC";
                        break;
                    }
                    case 12:{
                        monedaBase="CRC";
                        monedaDestino="MXN";
                        break;
                    }

                }

                MonedasApi resultado = convertir.
                        convertirMonedasConMonto(monedaBase, monedaDestino, monto);

                System.out.printf("El valor %.2f %s corresponde a %.2f %s\n",
                        monto,
                        resultado.base_code(),
                        resultado.conversion_result(),
                        resultado.target_code());




            }else if (opcion==13){
                System.out.println("Gracias por usar el conversor");
            }else{
                System.out.println("Opción inválida. Intente de nuevo.\n");
            }



        }while(opcion !=13);






    }
}
