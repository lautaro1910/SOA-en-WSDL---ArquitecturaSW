/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej7webapp;

import com.mycompany.ej7webapp.controlador.Controller;
import static spark.Spark.get;

/**
 *
 * @author diela
 */
public class Ej7webApp {

    public static void main(String[] args) {
        // port 4567

        get("/menuPrincipal", Controller.menuPrincipal);
        get("/getCalculadora", Controller.getCalculadora);
        get("/getCalculadoraResult", Controller.getCalculadoraResult);
        get("/getInfoPais", Controller.getInfoPais);
        get("/getInfoPaisResult", Controller.getInfoPaisResult);

        
    }
}
