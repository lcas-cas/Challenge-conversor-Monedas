# 💱 Conversor de Monedas - Java 24

Este es un proyecto de consola en Java que permite convertir entre diversas monedas latinoamericanas y el dólar estadounidense en tiempo real, utilizando una API pública de tasas de cambio.

---
## 🚀 Funcionalidades principales
- Consulta de tasas de cambio actualizadas mediante una API.
- Conversión entre las siguientes combinaciones de monedas:
    - Dólar estadounidense (USD) → Peso argentino (ARS)
    - Peso argentino (ARS) → Dólar estadounidense (USD)
    - Dólar estadounidense (USD) → Real brasileño (BRL)
    - Real brasileño (BRL) → Dólar estadounidense (USD)
    - Dólar estadounidense (USD) → Peso colombiano (COP)
    - Peso colombiano (COP) → Dólar estadounidense (USD)
    - Dólar estadounidense (USD) → Colón costarricense (CRC)
    - Colón costarricense (CRC) → Dólar estadounidense (USD)
    - Dólar estadounidense (USD) → Boliviano boliviano (BOB)
    - Boliviano boliviano (BOB) → Dólar estadounidense (USD)
    - Peso mexicano (MXN) → Colón costarricense (CRC)
    - Colón costarricense (CRC) → Peso mexicano (MXN)
- Menú interactivo basado en texto para seleccionar la conversión deseada.
- Registro de cada conversión con fecha y hora utilizando `java.time.LocalDateTime`.
- Historial de conversiones almacenado automáticamente en un archivo `historial.txt`.

---

## 📂 Estructura del Proyecto

src/

├── ConsultaMonedas.java # Maneja la lógica de consulta a la API
├── Fecha.java # Obtiene fecha y hora de cada conversión
├── Historial.java # Guarda las conversiones en historial.txt
├── MonedasApi.java # Construye las URLs para la API
├── Principal.java # Lógica principal e interacción con usuario
├── ValidadorDeMonto.java # Valida que el monto ingresado sea correcto

Otros archivos:

gson-2.13.1.jar # Biblioteca externa para parsear JSON (Gson)
README.md # Documentación del proyecto

---

## 🧪 Tecnologías utilizadas

- **Java 24**
- **HttpClient / HttpRequest / HttpResponse** – para manejar peticiones HTTP
- **Gson** – para parsear JSON
- **java.time.LocalDateTime** – para registrar fecha y hora
- **Scanner** – para interactuar con el usuario desde la consola

---

## 📸 Ejemplo del menú en consola

```plaintext
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
  ║ 13. Ver historial de conversiones                      ║
  ║ 14. Salir                                              ║
  ╚════════════════════════════════════════════════════════╝
  Seleccione una opción (1-14):
******************************************************

```

## Ejemplo de historial (historial.txt)

[2025-06-12T14:52:37] 100 USD => 127,400 ARS
[2025-06-12T14:55:10] 200 BRL => 38,400 USD

## 💡 Ideas de mejoras futuras

- Permitir al usuario escribir directamente los códigos de moneda (por ejemplo, MXN, EUR, JPY) y hacer conversiones sin estar limitado al menú.
- Agregar una interfaz gráfica usando JavaFX o Swing.
- Crear una clase separada que se encargue de mostrar el menú, recibir y validar la opción del usuario (separando responsabilidades).
- Validaciones más estrictas para entradas numéricas o caracteres inválidos.
- Agregar filtros para el historial: por moneda, por fecha o por rango de tiempo.
- Mostrar resumen estadístico del historial: total convertido, monedas más usadas, etc.

---

## 📌 Requisitos

- Tener **Java 24** instalado.
- Conexión a internet para realizar las conversiones con la API.
- Tener la librería **Gson** agregada al proyecto (por Maven, Gradle o manualmente).

---

## 🧠 Créditos

Este proyecto fue desarrollado como parte de un desafío educativo.  
Inspirado en el contenido del programa de formación de **Alura Latam**.
Desarrollado como práctica de aprendizaje y mejora continua.

