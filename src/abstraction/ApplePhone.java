package abstraction;

public class ApplePhone extends SmartPhone {
    public void nonCustomizable(){
        System.out.println("not customizable");
    }
    public void nonOpenSource(){
        System.out.println("closed system");
    }
    public void video(){
        System.out.println("has facetime");
    }


    public void hasApps() {
        System.out.println("has apps");
    }


    public void hdCamera() {
        System.out.println("has 2 cameras" );
    }


    public void hasRootOption(boolean isRooted) {
        if(isRooted){
            System.out.println("is rooted");
        }else System.out.println("not rooted" );
    }

    public void makeCall() {

    }


    public void receiveCall() {

    }


    public void sendText() {

    }


    public void receiveText() {

    }
}
