import Problem3.implementations.BasicPhoneModel;
import Problem3.implementations.IPhone;
import Problem3.implementations.Samsung;
import Problem3.interfaces.BasicPhone;

public class Prob3 {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhoneModel();
        basicPhone.makeCall("123");
        basicPhone.sendSMS("123", "Hello!");

        Samsung samsung = new Samsung();
        samsung.makeCall("321");
        samsung.sendSMS("321", "Hiiiii");
        samsung.browseWeb("https://google.com");
        samsung.takePicture();

        IPhone iPhone = new IPhone();
        iPhone.makeCall("312");
        iPhone.sendSMS("312", "Hi!");
        iPhone.browseWeb("https://google.com");
        iPhone.takePicture();
    }
}
