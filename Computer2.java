package RockPaperScissorsLizardSpock;

import java.util.Random;
public class Computer2 {

    public Variant2.CHOICE getChoice() {
        Variant2.CHOICE[] choices = Variant2.CHOICE.values();
        Random rnd = new Random();
        int variant = rnd.nextInt(choices.length);
        return choices[variant];

    }
}


