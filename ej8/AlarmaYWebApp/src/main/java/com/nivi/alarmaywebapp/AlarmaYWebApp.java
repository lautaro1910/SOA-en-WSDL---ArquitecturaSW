/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.alarmaywebapp;

/**
 *
 * @author diela
 */
public class AlarmaYWebApp {

    public static void main(String[] args) {
        boolean alarma = false;
        while (true) {
            try { // Call Web Service Operation
                com.nivi.camara.CamaraDataService serviceCamara = new com.nivi.camara.CamaraDataService();
                com.nivi.camara.CamaraData portCamara = serviceCamara.getCamaraDataPort();
                com.nivi.seguridadmuseoservice.ReconocimientoService service = new com.nivi.seguridadmuseoservice.ReconocimientoService();
                com.nivi.seguridadmuseoservice.Reconocimiento port = service.getReconocimientoPort();
                // TODO process result here
                int caraDetectada = portCamara.stream();
                System.out.println("Identificado: " + caraDetectada);
                port.faceID(caraDetectada);
                alarma = port.getAlerta();
                if (alarma){
                    System.out.println("Se ha detectado una posible amenaza. Se ha alertado a las autoridades");
                }
                port.setAlerta(false);//Apaga la alarma despues de alertar
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }

        }
    }
}
