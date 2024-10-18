# Conversor de Monedas

Este es un programa desarrollado en Java que permite la conversión de diversas monedas utilizando datos obtenidos de una API de tasas de cambio. El programa incluye un menú interactivo que ofrece conversiones predefinidas entre Dólares (USD), Pesos Mexicanos (MXN), y Euros (EUR), además de una opción para realizar conversiones con otras monedas.

## Características

- **Conversión predefinida**: Puedes convertir entre USD, MXN y EUR a través de un menú interactivo.
- **Conversión personalizada**: También puedes ingresar manualmente los códigos de otras monedas que desees convertir.
- **Datos actualizados**: El programa obtiene tasas de cambio actualizadas utilizando una API externa.
- **Manejo de errores**: El programa cuenta con validaciones de entrada y manejo de errores para garantizar una experiencia fluida.

## Menú de opciones

El programa ofrece las siguientes opciones en su menú principal:


- **Opción 1:** Convierte de Dólares estadounidenses (USD) a Pesos Mexicanos (MXN).
- **Opción 2:** Convierte de Pesos Mexicanos (MXN) a Dólares estadounidenses (USD).
- **Opción 3:** Convierte de Dólares estadounidenses (USD) a Euros (EUR).
- **Opción 4:** Convierte de Euros (EUR) a Dólares estadounidenses (USD).
- **Opción 5:** Convierte de Pesos Mexicanos (MXN) a Euros (EUR).
- **Opción 6:** Convierte de Euros (EUR) a Pesos Mexicanos (MXN).
- **Opción 7:** Permite convertir entre cualquier otra moneda ingresando manualmente los códigos de las monedas base y objetivo.
- **Opción 8:** Termina la ejecución del programa.

## Estructura del proyecto

El proyecto está dividido en las siguientes clases:

1. **Main (com.conversorDeMonedas.main)**: 
   Esta es la clase principal que contiene el menú de opciones y controla el flujo principal del programa. El usuario selecciona una opción, y el programa llama a la clase `Menu` para realizar la conversión.

2. **Menu (com.conversorDeMonedas.modelos)**:
   La clase `Menu` gestiona las opciones seleccionadas por el usuario y realiza las conversiones correspondientes. Cada opción llama al método `convertirYMostrar` de la clase `ConversorMoneda`.

3. **ConversorMoneda (com.conversorDeMonedas.modelos)**:
   Esta clase realiza la conversión utilizando los datos proporcionados por la API. Solicita al usuario la cantidad a convertir y luego realiza la conversión con base en la tasa obtenida.

4. **ConsultaAPI (com.conversorDeMonedas.modelos)**:
   La clase `ConsultaAPI` se encarga de realizar la llamada HTTP a la API para obtener las tasas de cambio actualizadas para la moneda base seleccionada.

5. **Moneda (com.conversorDeMonedas.modelos)**:
   Es la clase que modela la respuesta de la API, incluyendo los datos relevantes como la tasa de cambio y la fecha de la última actualización.

## Ejecución del programa

Para ejecutar el programa, simplemente ejecuta la clase `Main`. El programa mostrará el menú de opciones y te permitirá seleccionar la conversión deseada. Si seleccionas la opción 7, deberás ingresar manualmente los códigos de las monedas a convertir.

### Opciones predefinidas 

En estas opciones el conversor te permite realizar conversiones entre distintas monedas previamente establecidas. 

Al seleccionar la opción 2 el programa te pide la cantidad que deseas convertir y al dar enter se muestra el resultado así como la fecha de actualización de la tasa de cambio.

![image](https://github.com/user-attachments/assets/19db7ff0-4416-4630-9b63-52b15b5e148b)

### Opción 7 

En esta opción el programa te permite colocar de forma manual la moneda base y a la moneda a la cual quieres convertir (para ello necesitas saber el símbolo de tu moneda). Se muestra un ejemplo convirtiendo desde Yenes japoneses a Wones Surcoreanos.

![image](https://github.com/user-attachments/assets/85fa9f0b-5811-4f87-8c0f-e7352ba562a0)


## API utilizada

Este programa utiliza la API de Exchange Rate ([https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)

## Requisitos

- Java 11 o superior
- Conexión a Internet para realizar las consultas a la API de tasas de cambio.

## Autor

Desarrollado por [J. Abraham Ochoa Velásquez].

