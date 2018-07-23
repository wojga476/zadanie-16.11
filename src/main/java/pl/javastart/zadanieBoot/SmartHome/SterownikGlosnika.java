package pl.javastart.zadanieBoot.SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika implements Sterownik {


  private   StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;

    }

    @Override
    public void run() {
        System.out.println("Dzień dobry, Dzisiejsza temperatura " + stacjaPogodowa.getTemp() + " i " + stacjaPogodowa.getWeather() + ". To będzie dobry dzień!");

    }
}
