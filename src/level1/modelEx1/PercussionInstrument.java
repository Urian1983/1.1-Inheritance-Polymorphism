package level1.modelEx1;

public class PercussionInstrument extends MusicalInstrument {

    static{
        System.out.println("This message only appears the first time that we make an object from the class");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
        System.out.println("Playing " +name + " that costs " + price + " euros");
    }

    @Override
    public void play(){
        System.out.println("you are playing a percussion instrument.");
    }
}
