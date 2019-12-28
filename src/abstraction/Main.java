package abstraction;

public class Main {
    public static void main(String[] args) {
        AndroidPhone samsung9 = new AndroidPhone();
        samsung9.hasRootOption(true);
        samsung9.makeCall();
        System.out.println("**********************************************************");
        ApplePhone iPhoneX = new ApplePhone();
        iPhoneX.nonCustomizable();
        iPhoneX.nonOpenSource();
        iPhoneX.hasRootOption(false);
    }
}
