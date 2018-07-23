package pl.javastart.zadanieBoot.SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {

    private SterownikGlosnika sterownikGlosnika;
    private SterownikPieca sterownikPieca;
    private SterownikRolet sterownikRolet;


    public SmartHome(SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca, SterownikRolet sterownikRolet) {
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
    }

    public void run() {
        sterownikGlosnika.run();
        sterownikPieca.run();
        sterownikRolet.run();

    }
}
