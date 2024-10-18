package com.conversorDeMonedas.modelos;
import java.util.Scanner;

public class ConversorMoneda {

    private ConsultaAPI consulta;

    public ConversorMoneda() {
        this.consulta = new ConsultaAPI();
    }

    public void convertirYMostrar(String monedaBase, String monedaObjetivo) {
        Moneda moneda = consulta.consultaMoneda(monedaBase);
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea convertir: ");
        while (true){
            try {
                double cantidad = Double.parseDouble(lectura.nextLine());
                double tasaDeCambio = moneda.getConversion_rates().get(monedaObjetivo);
                double resultado = cantidad*tasaDeCambio;
                System.out.println("A la fecha de: "+moneda.getTime_last_update_utc()+"\nLa cantidad de:" +
                        " " + monedaBase + " " + cantidad + " equivale a: " + monedaObjetivo + " " + resultado);
                break;
            } catch (NumberFormatException e){
                System.out.println("Ingrese un número válido");
            }
        }
    }

    public ConsultaAPI getConsulta() {
        return consulta;
    }
}