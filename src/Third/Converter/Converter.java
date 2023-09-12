package Third.Converter;

import java.util.HashMap;

public class Converter {
  private HashMap<String, Double> value_conversion;
  private HashMap<String, String> currency_conversion;

  public Converter() {
    this.value_conversion = new HashMap<String, Double>();
    this.value_conversion.put("rub", 0.011);
    this.value_conversion.put("usd", 94.96);
    this.currency_conversion = new HashMap<String, String>();
    this.currency_conversion.put("rub", "usd");
    this.currency_conversion.put("usd", "rub");
  }

  public String convert(String string) {
    String[] split_string = string.split(" ");
    if (split_string.length != 2 || !this.value_conversion.containsKey(split_string[1])) {
      return "Wrong input";
    }

    try {
      Double value = Double.parseDouble(split_string[0]);

      return String.format("%.2f ", value * value_conversion.get(split_string[1]))
          + currency_conversion.get(split_string[1]);

    } catch (Exception e) {
      return "Wrong input";
    }
  }
}
