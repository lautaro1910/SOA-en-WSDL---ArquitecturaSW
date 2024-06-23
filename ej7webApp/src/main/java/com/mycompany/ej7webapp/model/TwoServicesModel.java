/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej7webapp.model;

/**
 *
 * @author diela
 */
public class TwoServicesModel {
    
    public String obtenerInfoPais(String ip){
        String resultado="";
        try { // Call Web Service Operation
            com.mycompany.ej7.TwoServicesImplService service = new com.mycompany.ej7.TwoServicesImplService();
            com.mycompany.ej7.TwoServices port = service.getTwoServicesImplPort();
            // TODO initialize WS operation arguments here
            java.lang.String arg0 = ip;
            // TODO process result here
            java.lang.String result = port.getInfoPais(arg0);
            System.out.println("Result = "+result);
            resultado = result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return resultado;
    }
    
    public double opCalculadora(int op, int v1, int v2){
        double resultado = 0;
        try { // Call Web Service Operation
            com.mycompany.ej7.TwoServicesImplService service = new com.mycompany.ej7.TwoServicesImplService();
            com.mycompany.ej7.TwoServices port = service.getTwoServicesImplPort();
            // TODO initialize WS operation arguments here
            int arg0 = op;
            int arg1 = v1;
            int arg2 = v2;
            // TODO process result here
            double result = port.operacion(arg0, arg1, arg2);
            resultado = result;
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return resultado;
    }
}
