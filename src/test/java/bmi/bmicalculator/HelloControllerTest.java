package bmi.bmicalculator;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void onENClick() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "US"));
        assertEquals("Calculate BMI", rb.getString("btnCalculate.text"));
    }

    @Test
    void onFRClick() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("fr", "FR"));
        assertEquals("Hauteur (m)", rb.getString("lblHeight.text"));
    }

    @Test
    void onURClick() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("ur", "PA"));
        assertEquals("وزن (کلوگرام)", rb.getString("lblWeight.text"));
    }

    @Test
    void onVIClick() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("vi", "VI"));
        assertEquals("Đầu vào không hợp lệ, vui lòng nhập số hợp lệ.", rb.getString("lblInvalid.text"));
    }

    @Test
    void calculateBMI() {
        HelloController hc = new HelloController();
        assertEquals(24.22, hc.calculateBMI(70, 170), 0.0001);
    }
}