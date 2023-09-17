package Sixth.Temperature;

interface Converter{
    public double convert(double celsius);
}

 class KelvinConverter implements Converter{
    public double convert(double celsius){
        return celsius + 273;
    }
}

 class FahrenheitConverter implements Converter{
     public double convert(double celsius){
         return celsius * (9.0/5.0) + 32;
     }

}

public class Temperature {
    public static void main(String[] args) {
        KelvinConverter celvinConverter = new KelvinConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        System.out.println(fahrenheitConverter.convert(0));
        System.out.println(celvinConverter.convert(0));

    }
}
