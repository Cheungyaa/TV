interface TV {
    void on();
    void off();
}

class SamsungTV implements TV {
    public void on() { System.out.println("Samsung TV ON"); }
    public void off() { System.out.println("Samsung TV OFF"); }
}

class LGTV implements TV {
    public void on() { System.out.println("LG TV ON"); }
    public void off() { System.out.println("LG TV OFF"); }
}

abstract class RemoteControl {
    protected TV tv;
    public RemoteControl(TV tv) { this.tv = tv; }
    abstract void turnOn();
    abstract void turnOff();
}

class BasicRemote extends RemoteControl {
    public BasicRemote(TV tv) { super(tv); }
    public void turnOn() { tv.on(); }
    public void turnOff() { tv.off(); }
}

public class Bridge {
    public static void main(String[] args) {
        RemoteControl remote = new BasicRemote(new SamsungTV());
        remote.turnOn();
        remote.turnOff();
    }
}
