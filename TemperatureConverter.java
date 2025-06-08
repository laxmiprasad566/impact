// class TemperatureConvertor method converTemperature overload method with 1.celsius to farenheit 2.farenheit to celsius 3.kelvin to celsius test conversions with different values
public class TemperatureConverter {

    public double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convertTemperature(double fahrenheit, boolean isFahrenheit) {
        if (isFahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
        return fahrenheit; 
    }

    public double convertTemperature(double kelvin, int mode) {
        if (mode == 1) { 
            return kelvin - 273.15;
        }
        return kelvin; 
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25;
        double fahrenheit = converter.convertTemperature(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        double fahrenheitInput = 98.6;
        double celsiusFromFahrenheit = converter.convertTemperature(fahrenheitInput, true);
        System.out.println(fahrenheitInput + "°F = " + celsiusFromFahrenheit + "°C");

        double kelvin = 300;
        double celsiusFromKelvin = converter.convertTemperature(kelvin, 1);
        System.out.println(kelvin + "K = " + celsiusFromKelvin + "°C");
    }
}
