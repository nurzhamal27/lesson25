package RockPaperScissors;

import RockPaperScissors.Variant;

import java.util.Random;
public class Computer {

    public Variant.CHOICE getChoice() {
        Variant.CHOICE[] choices = Variant.CHOICE.values();
        Random rnd = new Random();
        int variant = rnd.nextInt(choices.length);
        return choices[variant];

    }
}


