package abstraction;

public class AndroidPhone extends SmartPhone {
    public void customizable(){
        System.out.println("androids gives more user tools");
    }
    public void openSource(){
        System.out.println("is open source ");
    }
    public void video(){
        System.out.println("has duo");
    }


    public void hasApps() {
        System.out.println("has apps");
    }


    public void hdCamera() {
        System.out.println("has 2 cameras");
    }


    public void hasRootOption(boolean isRooted) {
if(isRooted){
    System.out.println("Android phone is rooted");
}else System.out.println("not rooted" );
    }


    public void makeCall() {
        System.out.println("can make call");
    }


    public void receiveCall() {
        System.out.println("can receive call");
    }


    public void sendText() {
        System.out.println("can send text");
    }


    public void receiveText() {
        System.out.println("can receive text" );
    }
}
