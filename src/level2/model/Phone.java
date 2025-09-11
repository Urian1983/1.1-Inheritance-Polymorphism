package level2.model;

public class Phone {

    private String trademark;
    private String model;

    public Phone(String model, String trademark) {
        this.model = model;
        this.trademark= trademark;
    }

    public String getTrademark() {
        return trademark;
    }

    public String getModel() {
        return model;
    }

    public void calling (String phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
}
