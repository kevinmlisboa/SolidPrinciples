package Problem3.implementations;

import Problem3.interfaces.BasicPhone;

public class BasicPhoneModel implements BasicPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}