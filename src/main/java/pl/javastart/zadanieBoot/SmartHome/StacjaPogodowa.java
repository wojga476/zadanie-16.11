package pl.javastart.zadanieBoot.SmartHome;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {

    public int temp;

    public StacjaPogodowa() {
        System.out.println("Pobieram informacje o pogodzie");
    }

    public int getTemp() {
        return getTemperature();
    }

    private int random() {
        Random random = new Random();
        return random.nextInt(61) - 25;
    }

    private int getTemperature() {
        temp = random();
        return temp;
    }


    public String getWeather() {
        if (temp < 0) {
            return "Nie jest słonecznie";
        } else return "Jest słonecznie";
    }


}
