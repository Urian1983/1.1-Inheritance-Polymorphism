package level1;

import level1.modelEx1.PercussionInstrument;
import level1.modelEx1.StringInstrument;
import level1.modelEx1.WindInstrument;

public class Ex1Main {
    public static void main(String[] args) {

        WindInstrument flute = new WindInstrument("Flute", 1000);
        flute.play();

        WindInstrument oboe = new WindInstrument("Oboe",2000);
        oboe.play();

        PercussionInstrument bongo = new PercussionInstrument("Bongo",300);
        bongo.play();

        PercussionInstrument drum = new PercussionInstrument("Drum",400);
        drum.play();

        StringInstrument violin = new StringInstrument("Violin",5000);
        violin.play();

        StringInstrument guitar = new StringInstrument("Guitar",500);
        guitar.play();
    }
}