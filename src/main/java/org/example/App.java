package org.example;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;


public class App {

    private static final int PIN_A = 25;
    private static final int PIN_B = 24;
    private static final int PIN_C = 22;
    private static final int PIN_D = 27;
    private static final int PIN_E = 17;
    private static final int PIN_F = 23;
    private static final int PIN_G = 18;

    public static void main(String[] args) throws InterruptedException {
        Context pi4j = Pi4J.newAutoContext();

        var A = pi4j.digitalOutput().create(PIN_A);
        var B = pi4j.digitalOutput().create(PIN_B);
        var C = pi4j.digitalOutput().create(PIN_C);
        var D = pi4j.digitalOutput().create(PIN_D);
        var E = pi4j.digitalOutput().create(PIN_E);
        var F = pi4j.digitalOutput().create(PIN_F);
        var G = pi4j.digitalOutput().create(PIN_G);

        //0
        G.high();
        Thread.sleep(500);
        G.low();

        //1
        A.high();
        D.high();
        E.high();
        F.high();
        G.high();
        Thread.sleep(500);
        A.low();
        D.low();
        E.low();
        F.low();
        G.low();

        //2
        C.high();
        F.high();
        Thread.sleep(500);
        C.low();
        F.low();

        //3
        F.high();
        E.high();
        Thread.sleep(500);
        F.low();
        E.low();

        //4
        A.high();
        D.high();
        E.high();
        Thread.sleep(500);
        A.low();
        D.low();
        E.low();

        //5
        E.high();
        B.high();
        Thread.sleep(500);
        E.low();
        B.low();

        //6
        B.high();
        Thread.sleep(500);
        B.low();

        //7
        F.high();
        E.high();
        D.high();
        G.high();
        Thread.sleep(500);
        F.low();
        E.low();
        D.low();
        G.low();

        //8
        Thread.sleep(500);

        //9
        E.high();
        D.high();
        Thread.sleep(500);
        E.low();
        D.low();

        A.high();
        B.high();
        C.high();
        D.high();
        E.high();
        F.high();
        G.high();

        Thread.sleep(1000);

        A.low();
        B.low();
        C.low();
        D.low();
        E.low();
        F.low();
        G.low();

        pi4j.shutdown();
    }
}