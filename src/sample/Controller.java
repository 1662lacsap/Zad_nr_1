package sample;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    // Input/Output
    @FXML
    private TextField TextFieldInput;

    @FXML
    private TextField TextFieldOutput;

    // Output Scale
    @FXML
    private RadioButton CelciusOutput;

    @FXML
    private RadioButton FahrenheitOutput;

    @FXML
    private RadioButton KelvinOutput;

    @FXML
    private RadioButton CelciusInput;

    @FXML
    private RadioButton FahrenheitInput;

    @FXML
    private RadioButton KelvinInput;

    //Input Scale Celcius
    @FXML
    public void onActionCelciusInput() {

        //zmienne
        double b; // Liczba do przeliczenia
        double c; // Pierwsze obliczenie Kelvin
        double d; // Drugie obliczenie Fahrenheit

        //Pobieram z Inputa Text i zamieniam na liczbę b
        try {

            b = Double.parseDouble(TextFieldInput.getText());

        } catch (NumberFormatException e) {
            b = Math.PI ;// jeśli nie da się przekonwertować na double
        }

        if (b==Math.PI) {

            TextFieldOutput.setText("niepoprawna wartość");
        }

        else
        // Celcius i Celcius

        if (CelciusOutput.isSelected() == true) {
            b=b*100;
            b=Math.round(b);
            b=b/100;
            TextFieldOutput.setText(String.valueOf(b) + "\u2103"); // Stopnie Celciusa
        } else

            // Celcius i Fahrenheit

            if (FahrenheitOutput.isSelected() == true) {
                d = 1.8 * b + 32; // Stopnie Fahrenheita
                d=d*100;
                d=Math.round(d);
                d=d/100;

                TextFieldOutput.setText(String.valueOf(d) + "\u2109");
            } else

                // Celcius i Kelvin

                if (KelvinOutput.isSelected() == true) {
                    c = b + 273.15; // Stopnie Kelwina
                    c=c*100;
                    c=Math.round(c);
                    c=c/100;

                    TextFieldOutput.setText(String.valueOf(c) + "K");
                }
    }

    //Input Scale Fahrenheit

    @FXML
    public void onActionFahrenheitInput() {
        //zmienne
        double b1; // Liczba do przeliczenia
        double c1; // Pierwsze obliczenie Celcius
        double d1; // Drugie obliczenie Kelvina

        //Pobieram z Inputa Text i zamieniam na liczbę b1
        try {
            b1 = Double.parseDouble(TextFieldInput.getText());
        } catch (NumberFormatException e) {
            b1 = Math.PI ;// jeśli nie da się przekonwertować na double
        }

        if (b1==Math.PI){

            TextFieldOutput.setText("niepoprawna wartość");
        }

        else

        // Fahrenheit i Celcius

        if (CelciusOutput.isSelected() == true) {
            c1 = 0.5555555 * (b1 - 32); // Stopnie Celsjusza
            c1=c1*100;
            c1=Math.round(c1);
            c1=c1/100;

            TextFieldOutput.setText(String.valueOf(c1) + "\u2103"); // Stopnie Celciusa
        } else

            // Fahrenheit i Fahrenheit

            if (FahrenheitOutput.isSelected() == true) {
                b1=b1*100;
                b1=Math.round(b1);
                b1=b1/100;
                TextFieldOutput.setText(String.valueOf(b1) + "\u2109");
            } else

                // Fahrenheit i Kelvin

                if (KelvinOutput.isSelected() == true) {
                    d1 = (b1 + 459.67) * 0.5555555; // Stopnie Kelwina
                     d1=d1*100;
                     d1=Math.round(d1);
                     d1=d1/100;
                    TextFieldOutput.setText(String.valueOf(d1) + "K");
                }
    }

    //Input Scale Kelvin
    @FXML
    public void onActionKelvinInput() {
        //zmienne
        double b2; // Liczba do przeliczenia
        double c2; // Pierwsze obliczenie Celciusa
        double d2; // Drugie obliczenie Fahrenheit

        //Pobieram z Inputa Text i zamieniam na liczbę b2
        try {
            b2 = Double.parseDouble(TextFieldInput.getText());
        } catch (NumberFormatException e) {
            b2 = Math.PI ;//jeśli nie da się przekonwertować na double
        }

        if (b2==Math.PI){

            TextFieldOutput.setText("niepoprawna wartość");
        }

        else
        // Kelvin i Celcius

        if (CelciusOutput.isSelected() == true) {
            c2 = b2 - 273.15; // Stopnie Celsjusza
            c2=c2*100;
            c2=Math.round(c2);
            c2=c2/100;

            TextFieldOutput.setText(String.valueOf(c2) + "\u2103"); // Stopnie Celciusa
        } else

            // Kelvin i Fahrenheit

            if (FahrenheitOutput.isSelected() == true) {
                d2 = (b2 * 1.8) - 459.67; // Stopnie Fahrenheita
                d2=d2*100;
                d2=Math.round(d2);
                d2=d2/100;

                TextFieldOutput.setText(String.valueOf(d2) + "\u2109");
            } else

                // Kelvin i Kelvin

                if (KelvinOutput.isSelected() == true) {
                    b2=b2*100;
                    b2=Math.round(b2);
                    b2=b2/100;
                    TextFieldOutput.setText(String.valueOf(b2) + "K");
                }
    }
    //Output Scale Celcius
    @FXML
    public void onActionCelciusOutput() {

        //zmienne
        double b3; // Liczba do przeliczenia
        double c3; // Pierwsze obliczenie Kelvin
        double d3; // Drugie obliczenie Fahrenheit

        //Pobieram z Inputa Text i zamieniam na liczbę b3
        try {
            b3 = Double.parseDouble(TextFieldInput.getText());
        } catch (NumberFormatException e) {
            b3 = Math.PI ;// jeśli nie da się przekonwertować na double
        }

        if (b3==Math.PI){

            TextFieldOutput.setText("niepoprawna wartość");

        }

        else
        // Celcius i Celcius

        if (CelciusInput.isSelected() == true) {
            b3=b3*100;
            b3=Math.round(b3);
            b3=b3/100;
            TextFieldOutput.setText(String.valueOf(b3) + "\u2103"); // Stopnie Celciusa
        } else

            // Fahrenheit i Celcius

            if (FahrenheitInput.isSelected() == true) {
                d3 = 0.5555555 * (b3 - 32); // Stopnie Celsjusza
                d3=d3*100;
                d3=Math.round(d3);
                d3=d3/100;

                TextFieldOutput.setText(String.valueOf(d3) + "\u2103");
            } else

                // Kelvin i Celcius

                if (KelvinInput.isSelected() == true) {
                    c3 = b3 - 273.15;
                    c3=c3*100;
                    c3=Math.round(c3);
                    c3=c3/100; //Stopnie Celsjusza

                    TextFieldOutput.setText(String.valueOf(c3) + "\u2103");
                }

    }
    //Output Scale Fahrenheit
    @FXML
    public void onActionFahrenheitOutput() {

        //zmienne
        double b4; // Liczba do przeliczenia
        double c4; // Pierwsze obliczenie Celcius
        double d4; // Drugie obliczenie Kelvina

        //Pobieram z Inputa Text i zamieniam na liczbę b4
        try {
            b4 = Double.parseDouble(TextFieldInput.getText());
        } catch (NumberFormatException e) {

            b4 = Math.PI ;// jeśli nie da się przekonwertować na double
        }

        if (b4==Math.PI){

            TextFieldOutput.setText("niepoprawna wartość");
        }

        else
        // Celcius i Fahrenheit

        if (CelciusInput.isSelected() == true) {
            c4 = 1.8 * b4 + 32; // Stopnie Fahrenheita
            c4=c4*100;
            c4=Math.round(c4);
            c4=c4/100;

            TextFieldOutput.setText(String.valueOf(c4) + "\u2109"); // Stopnie Fahrenheita
        } else

            // Fahrenheit i Fahrenheit

            if (FahrenheitInput.isSelected() == true) {
                b4=b4*100;
                b4=Math.round(b4);
                b4=b4/100;
                TextFieldOutput.setText(String.valueOf(b4) + "\u2109");
            } else

                // Kelvin i Fahrenheit

                if (KelvinInput.isSelected() == true) {
                    d4 = (b4 * 1.8) - 459.67; // Stopnie Fahrenheita
                    d4=d4*100;
                    d4=Math.round(d4);
                    d4=d4/100;
                    TextFieldOutput.setText(String.valueOf(d4) + "\u2109");
                }

    }
    //Output Scale Kelvin
    @FXML
    public void onActionKelvinOutput() {

        //zmienne
        double b5; // Liczba do przeliczenia
        double c5; // Pierwsze obliczenie Celciusa
        double d5; // Drugie obliczenie Fahrenheit

        //Pobieram z Inputa Text i zamieniam na liczbę b5
        try {
            b5 = Double.parseDouble(TextFieldInput.getText());
        } catch (NumberFormatException e) {

            b5 = Math.PI ;// jeśli nie da się przekonwertować na double
        }

        if (b5==Math.PI){

            TextFieldOutput.setText("niepoprawna wartość");
        }

        else

        //  Celcius i Kelvin

        if (CelciusInput.isSelected() == true) {
            c5 = b5 + 273.15; // Stopnie Kelwina
            c5=c5*100;
            c5=Math.round(c5);
            c5=c5/100;
            TextFieldOutput.setText(String.valueOf(c5) + "K"); // Stopnie Kelwina
        } else

            // Fahrenheit i Kelvin

            if (FahrenheitInput.isSelected() == true) {
                d5 = (b5 + 459.67) * 0.5555555; // Stopnie Kelwina
                d5=d5*100;
                d5=Math.round(d5);
                d5=d5/100;
                TextFieldOutput.setText(String.valueOf(d5) + "K");
            } else

                // Kelvin i Kelvin

                if (KelvinInput.isSelected() == true) {
                    b5=b5*100;
                    b5=Math.round(b5);
                    b5=b5/100;
                    TextFieldOutput.setText(String.valueOf(b5) + "K");
                }

    }

}

