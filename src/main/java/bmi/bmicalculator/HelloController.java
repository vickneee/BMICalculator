package bmi.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    @FXML private Label lblWeight;
    @FXML private TextField tfWeight;
    @FXML private Label lblHeight;
    @FXML private TextField tfHeight;
    @FXML private Button btnCalculate;
    @FXML private Label lblResult;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;

    private Locale currentLocale = new Locale("en", "US"); // default

    @FXML
    private void initialize() {
        onLoadLanguage("en", "US");
    }

    public void onLoadLanguage(String language, String country) {
        currentLocale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", currentLocale);

        if (button1 != null && button2 != null && button3 != null && button4 != null && btnCalculate != null && lblResult != null) {
            lblWeight.setText(rb.getString("lblWeight.text"));
            lblHeight.setText(rb.getString("lblHeight.text"));
            button1.setText(rb.getString("button1.text"));
            button2.setText(rb.getString("button2.text"));
            button3.setText(rb.getString("button3.text"));
            button4.setText(rb.getString("button4.text"));
            btnCalculate.setText(rb.getString("btnCalculate.text"));
            lblResult.setText(rb.getString("lblResult.text"));

        } else {
            System.out.println("FXML injection issued!");
        }
    }

    private String getMessage(String key) {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        return rb.getString(key);
    }

    @FXML
    public void onENClick() {
        onLoadLanguage("en", "US"); // English
    }

    @FXML
    public void onFRClick() {
        onLoadLanguage("fr", "FR"); // French
    }

    @FXML
    public void onURClick() {
        onLoadLanguage("ur", "PA"); // Urdu
    }

    @FXML
    public void onVIClick() {
        onLoadLanguage("vi", "VI"); // Vietnamese
    }

    @FXML
    public void onCalculateClick() {
        try {
            // Get numbers from textfield
            double weight = Double.parseDouble(tfWeight.getText());
            double height = Double.parseDouble(tfHeight.getText());

            double bmi = calculateBMI(weight, height);

            DecimalFormat df = new DecimalFormat("#0.00");

            String msg = getMessage("lblResult.text");
            lblResult.setText(msg + " " + df.format(bmi));

        } catch (NumberFormatException e) {
            lblResult.setText(getMessage("lblInvalid.text"));
        }
    }

    public double calculateBMI(double w, double h) {
        double height = h / 100.0;
        double result =  w / (height * height);
        return Math.round(result * 100.0) / 100.0;
    }
}
