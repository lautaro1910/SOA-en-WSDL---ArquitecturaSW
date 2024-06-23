/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej4;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author diela
 */
@WebService(endpointInterface="com.mycompany.ej4.IPinformacion")
public class IPinformacionImpl implements IPinformacion {

    @Override
    public void obtenerInfo(String ip) {
        
        
        /*Solicite por pantalla el ingreso de un IP e imprima por pantalla 
        el pais al que pertenece, la ciudad, latitud y longitud, o “Invalido” 
        en caso que no retorne nada valido. */
        
        
        try { // Call Web Service Operation
            org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
            org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap12();
            
            // TODO initialize WS operation arguments here
            java.lang.String sCountryISOCode = ip;
           
            // TODO process result here
            org.oorsprong.websamples.TCountryInfo result = port.fullCountryInfo(sCountryISOCode);
            
            // mostrar info
            System.out.println("ISO Code del pais = "+ ip);
            System.out.println("Nombre del pais = "+ result.getSName());
            System.out.println("Ciudad del pais = "+ result.getSCapitalCity());
            System.out.println("Bandera del pais = "+ result.getSCountryFlag());
            System.out.println("Moneda del pais = "+ result.getSCurrencyISOCode());
            System.out.println("Lenguaje del pais = "+ result.getLanguages());
            
            
        } catch (Exception ex) {
            System.out.println("Error, valor invalido");
        }
    }
    
}
