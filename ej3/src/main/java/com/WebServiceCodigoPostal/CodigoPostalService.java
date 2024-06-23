/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WebServiceCodigoPostal;

/**
 *
 * @author diela
 */

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService
public class CodigoPostalService {

    private static final Map<String, String> postalCodeToProvinceMap = new HashMap<>();
    //cod postales de argentina
    static {
        postalCodeToProvinceMap.put("1000", "Ciudad Autónoma de Buenos Aires");
        postalCodeToProvinceMap.put("2000", "Santa Fe");
        postalCodeToProvinceMap.put("3000", "Santa Fe");
        postalCodeToProvinceMap.put("4000", "Tucumán");
        postalCodeToProvinceMap.put("5000", "Córdoba");
        postalCodeToProvinceMap.put("6000", "Buenos Aires");
        postalCodeToProvinceMap.put("7000", "Buenos Aires");
        postalCodeToProvinceMap.put("8000", "Buenos Aires");
        postalCodeToProvinceMap.put("9000", "Chubut");
        postalCodeToProvinceMap.put("9100", "Chubut");
        postalCodeToProvinceMap.put("9400", "Santa Cruz");
        postalCodeToProvinceMap.put("8300", "Río Negro");
        postalCodeToProvinceMap.put("3500", "Corrientes");
        postalCodeToProvinceMap.put("3600", "Formosa");
        postalCodeToProvinceMap.put("3100", "Entre Ríos");
        postalCodeToProvinceMap.put("3200", "Entre Ríos");
        postalCodeToProvinceMap.put("5400", "San Juan");
        postalCodeToProvinceMap.put("5700", "San Luis");
        postalCodeToProvinceMap.put("5900", "Córdoba");
        postalCodeToProvinceMap.put("3000", "Santa Fe");
        postalCodeToProvinceMap.put("3384", "Misiones");
        postalCodeToProvinceMap.put("4600", "Jujuy");
        postalCodeToProvinceMap.put("4700", "Catamarca");
        postalCodeToProvinceMap.put("4300", "Santiago del Estero");
        postalCodeToProvinceMap.put("5400", "San Juan");
        postalCodeToProvinceMap.put("4600", "Jujuy");
        postalCodeToProvinceMap.put("4700", "Catamarca");
        postalCodeToProvinceMap.put("4400", "Salta");
        postalCodeToProvinceMap.put("5300", "La Rioja");
        postalCodeToProvinceMap.put("5600", "Mendoza");
        postalCodeToProvinceMap.put("4600", "Jujuy");
        postalCodeToProvinceMap.put("9100", "Chubut");
    }

    public String getProvinceByPostalCode(String postalCode) {
        return postalCodeToProvinceMap.getOrDefault(postalCode, "Ups!!! Código postal desconocido :(");
    }
}
