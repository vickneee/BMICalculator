package bmi.bmicalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void onENClick() {
    }

    @Test
    void onFRClick() {
    }

    @Test
    void onURClick() {
    }

    @Test
    void onVIClick() {
    }

    @Test
    void calculateBMI() {
        HelloController hc = new HelloController();
        assertEquals(24.221453287197235, hc.calculateBMI(70, 170), 0.0001);
    }
}