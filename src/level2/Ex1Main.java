package level2;

import level2.model.SmartPhone;

public class Ex1Main {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("iPhone","Apple");

        phone.takePhoto();
        phone.calling("123456789");
        phone.alarm();
    }
}
