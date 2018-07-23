package pl.javastart.zadanieBoot.SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet implements Sterownik{
    private StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;

    }

    @Override
    public void run() {
        if (stacjaPogodowa.getWeather().equals("Jest słonecznie")) {
            System.out.println(stacjaPogodowa.getWeather() + ". Zasłaniam rolety");
        } else
            System.out.println(stacjaPogodowa.getWeather() + ". Podnosze do góry rolety");
    }
}
