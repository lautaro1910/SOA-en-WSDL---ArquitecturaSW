/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej7webapp.controlador;

import com.mycompany.ej7webapp.model.TwoServicesModel;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author diela
 */
public class Controller {
    
    
    // plantilla principal
    public static Route menuPrincipal = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/menuPrincipal.vtl"));
    };
    
    public static Route getCalculadora = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/calculadoraMenu.vtl"));
    };
    
    public static Route getCalculadoraResult = (Request req, Response res) -> {
        String op = req.queryParams("operation");
        int operacion = 1;
        switch (op) {
            case "suma":
                operacion = 1;
                break;
            case "resta":
                operacion = 2;
                break;
            case "multiplicacion":
                operacion = 3;
                break;
            case "division":
                operacion = 4;
                break;
            default:
                operacion = 1; // Opción por defecto: suma
                break;
        }
        int valor1 = Integer.parseInt(req.queryParams("value1"));
        int valor2 = Integer.parseInt(req.queryParams("value2"));
        double resultado = 0;
        
        
        TwoServicesModel tsm = new TwoServicesModel();
        
        resultado = tsm.opCalculadora(operacion, valor1, valor2);
        
        Map<String, Object> model = new HashMap<>();
        
        model.put("result", resultado);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/calculadoraMenu.vtl"));
    };
    
    public static Route getInfoPais = (Request req, Response res) -> {
        String resultado = "No hay informacion";
        Map<String, Object> model = new HashMap<>();
        
        model.put("resultado", resultado);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/ipInfoMenu.vtl"));
    };
    
    public static Route getInfoPaisResult = (Request req, Response res) -> {
        String codeISO = req.queryParams("code");
        String resultado = "No hay informacion";
        
        TwoServicesModel tsm = new TwoServicesModel();
        
        resultado = tsm.obtenerInfoPais(codeISO);

        Map<String, Object> model = new HashMap<>();
        
        model.put("result", resultado);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/ipInfoMenu.vtl"));
    };
}
