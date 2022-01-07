import java.util.*;
public class hash 
{
    public static void main(String[] args) 
    {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    for (String i : capitalCities.keySet()) {
        System.out.println(i);
      }

    }
}
