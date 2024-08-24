package org.example;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.gpio.digital.DigitalOutput;


public class App {

    private static final int PIN_A = 25;
    private static final int PIN_B = 24;
    private static final int PIN_C = 22;
    private static final int PIN_D = 27;
    private static final int PIN_E = 17;
    private static final int PIN_F = 23;
    private static final int PIN_G = 18;

    DigitalOutput A, B, C, D, E, F, G;

    private void clear() {
        A.low();
        B.low();
        C.low();
        D.low();
        E.low();
        F.low();
        G.low();
    }

    public static void main(String[] args) throws InterruptedException {
        Context pi4j = Pi4J.newAutoContext();
        App app = new App();

        app.A = pi4j.digitalOutput().create(PIN_A);
        app.B = pi4j.digitalOutput().create(PIN_B);
        app.C = pi4j.digitalOutput().create(PIN_C);
        app.D = pi4j.digitalOutput().create(PIN_D);
        app.E = pi4j.digitalOutput().create(PIN_E);
        app.F = pi4j.digitalOutput().create(PIN_F);
        app.G = pi4j.digitalOutput().create(PIN_G);

        //0
        app.G.high();
        Thread.sleep(500);
        app.clear();

        //1
        app.A.high();
        app.D.high();
        app.E.high();
        app.F.high();
        app.G.high();
        Thread.sleep(500);
        app.clear();

        //2
        app.C.high();
        app.F.high();
        Thread.sleep(500);
        app.clear();

        //3
        app.F.high();
        app.E.high();
        Thread.sleep(500);
        app.clear();

        //4
        app.A.high();
        app.D.high();
        app.E.high();
        Thread.sleep(500);
        app.clear();

        //5
        app.E.high();
        app.B.high();
        Thread.sleep(500);
        app.clear();

        //6
        app.B.high();
        Thread.sleep(500);
        app.clear();

        //7
        app.F.high();
        app.E.high();
        app.D.high();
        app.G.high();
        Thread.sleep(500);
        app.clear();

        //8
        Thread.sleep(500);

        //9
        app.E.high();
        app.D.high();
        Thread.sleep(500);
        app.clear();

        app.A.high();
        app.B.high();
        app.C.high();
        app.D.high();
        app.E.high();
        app.F.high();
        app.G.high();

        Thread.sleep(1000);

        app.clear();

        pi4j.shutdown();
    }
}