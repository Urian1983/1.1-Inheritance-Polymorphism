package level2.model;

import level2.interfaces.*;

public class SmartPhone extends Phone implements Camera, Clock{

    public SmartPhone(String model, String trademark) {
        super(model, trademark);
    }
    @Override
    public void takePhoto() {
        System.out.println(this.getTrademark() + " " + this.getModel() + " is taking a photo with its camera");
    }

    @Override
    public void alarm() {
        System.out.println(this.getTrademark() + " " + this.getModel() + "alarm is ringing");
    }
}
