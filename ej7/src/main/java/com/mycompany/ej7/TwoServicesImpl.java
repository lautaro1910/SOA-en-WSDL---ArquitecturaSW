/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej7;

import javax.jws.WebService;

/**
 *
 * @author diela
 */
@WebService(endpointInterface="com.mycompany.ej7.TwoServices")
public class TwoServicesImpl implements TwoServices {

    @Override
    public double operacion(int opcion, int valor1, int valor2) {
        double resultado = 0;

        switch (opcion) {
            case 1: // Suma
                
                try { // Call Web Service Operation
                    org.tempuri.Calculator service = new org.tempuri.Calculator();
                    org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
                    // TODO initialize WS operation arguments here
                    int intA = valor1;
                    int intB = valor2;
                    // TODO process result here
                    int result = port.add(intA, intB);
                    resultado = (double) result;
                    System.out.println("Result = "+result);
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
                break;
            case 2: // Resta
                
                try { // Call Web Service Operation
                    org.tempuri.Calculator service = new org.tempuri.Calculator();
                    org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
                    // TODO initialize WS operation arguments here
                    int intA = valor1;
                    int intB = valor2;
                    // TODO process result here
                    int result = port.subtract(intA, intB);
                    resultado = (double) result;
                    System.out.println("Result = "+result);
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
                break;
            case 3: // Multiplicación
                
                try { // Call Web Service Operation
                    org.tempuri.Calculator service = new org.tempuri.Calculator();
                    org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
                    // TODO initialize WS operation arguments here
                    int intA = valor1;
                    int intB = valor2;
                    // TODO process result here
                    int result = port.multiply(intA, intB);
                    resultado = (double) result;
                    System.out.println("Result = "+result);
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }

                resultado = valor1 * valor2;
                break;
            case 4: // División
                if (valor2 != 0) {
                    try { // Call Web Service Operation
                        org.tempuri.Calculator service = new org.tempuri.Calculator();
                        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
                        // TODO initialize WS operation arguments here
                        int intA = valor1;
                        int intB = valor2;
                        // TODO process result here
                        int result = port.divide(intA, intB);
                        resultado = (double) result;
                        System.out.println("Result = " + result);
                    } catch (Exception ex) {
                        // TODO handle custom exceptions here
                    }
                } else {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                break;
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
        return resultado;
    }

    @Override
    public String getInfoPais(String ip) {
        String resultado = "";
        try {
            // Llamada a la operación del servicio web
            org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
            org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap12();

            // Inicialización de los argumentos de la operación WS
            java.lang.String sCountryISOCode = ip;

            // Procesamiento del resultado
            org.oorsprong.websamples.TCountryInfo result = port.fullCountryInfo(sCountryISOCode);

            // Almacenar información en la variable resultado
            resultado += "ISO Code del pais = " + ip + "\n";
            resultado += "Nombre del pais = " + result.getSName() + "\n";
            resultado += "Ciudad del pais = " + result.getSCapitalCity() + "\n";
            resultado += "Bandera del pais = " + result.getSCountryFlag() + "\n";
            resultado += "Moneda del pais = " + result.getSCurrencyISOCode() + "\n";
            resultado += "Lenguaje del pais = " + result.getLanguages() + "\n";

        } catch (Exception ex) {
            resultado = "Error, valor invalido";
        }
        return resultado;
    }

}
