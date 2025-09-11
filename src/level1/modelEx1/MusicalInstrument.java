package level1.modelEx1;

public abstract class MusicalInstrument {

    private double price;
    private String name;

    public MusicalInstrument(String name, double price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    public abstract void play();

}
