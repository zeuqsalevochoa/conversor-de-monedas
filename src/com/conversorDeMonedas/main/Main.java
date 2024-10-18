package com.conversorDeMonedas.main;
import com.conversorDeMonedas.modelos.Menu;
import com.conversorDeMonedas.modelos.Moneda;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String descripcionMenu = """
                *********************************************
                Seleccione una de las siguientes opciones: 
                1.- Dólar a peso Mexicano
                2.- Peso Mexicano a Dólar
                3.- Dólar a Euro
                4.- Euro a Dolar
                5.- Peso Mexicano a Euro
                6.- Euro a peso Mexicano
                7.- Otras opciones
                8.- Salir
                *********************************************""";
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println(descripcionMenu);
            try{
                int opcion = lectura.nextInt();
                if (opcion == 8){
                    break;
                }
                Menu menu = new Menu();
                Moneda moneda = new Moneda();
                menu.realizaOpciones(moneda, opcion);
            } catch (InputMismatchException e){
                System.out.println("Ocurrió un error: "+ e.getMessage());
                System.out.println("Escriba una opción válida");
                lectura.next();
            }
        }
        System.out.println("Gracias por usar nuestro servicio, vuelva pronto!!");
    }
}
