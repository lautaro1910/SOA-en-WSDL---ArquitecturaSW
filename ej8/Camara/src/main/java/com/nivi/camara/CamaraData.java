/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.camara;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author diela
 */
@WebService
public class CamaraData {

    int data = -1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public CamaraData() {
        startRandomRecording();
    }

    private void recording() {
        this.data = ThreadLocalRandom.current().nextInt(100);
        System.out.println("Recording: " + data); // Solo para mostrar que se está grabando
    }

    private void startRandomRecording() {
        Runnable recordingTask = this::recording;
        scheduler.scheduleWithFixedDelay(recordingTask, getRandomDelay(), getRandomDelay(), TimeUnit.SECONDS);
    }

    private long getRandomDelay() {
        return ThreadLocalRandom.current().nextInt(1, 10); // Genera un retraso aleatorio entre 1 y 10 segundos
    }

    @WebMethod
    public int stream() {
        return data;
    }

}
