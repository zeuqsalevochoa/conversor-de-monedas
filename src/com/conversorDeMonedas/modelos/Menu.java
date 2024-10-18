package com.conversorDeMonedas.modelos;

import java.util.Scanner;

public class Menu {
    public void realizaOpciones(Moneda moneda, int opcion){
        ConversorMoneda conversor = new ConversorMoneda();
        switch (opcion){
            case 1:
                conversor.convertirYMostrar("USD", "MXN");
                break;
            case 2:
                conversor.convertirYMostrar("MXN", "USD");
                break;
            case 3:
                conversor.convertirYMostrar("USD", "EUR");
                break;
            case 4:
                conversor.convertirYMostrar("EUR", "USD");
                break;
            case 5:
                conversor.convertirYMostrar("MXN", "EUR");
                break;
            case 6:
                conversor.convertirYMostrar("EUR", "MXN");
                break;
            case 7:
                Scanner lectura = new Scanner(System.in);
                System.out.println("Escribe el código de la moneda base: ");
                String monedaBase = lectura.next();
                System.out.println("Escribe el código de la moneda a convertir: ");
                String monedaObjetivo = lectura.next();
                try {
                    conversor.convertirYMostrar(monedaBase, monedaObjetivo);
                } catch (NullPointerException e){
                    System.out.println("Error: "+e.getMessage());
                    System.out.println("Ingrese códigos de moneda válidos!");
                }
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }
    }
}
