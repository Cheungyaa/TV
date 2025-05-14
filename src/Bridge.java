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

class HowTV implements TV {
    public void on() { System.out.println("How TV ON"); }
    public void off() { System.out.println("How TV OFF"); }
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
        RemoteControl remote1 = new BasicRemote(new SamsungTV());
        remote1.turnOn();
        remote1.turnOff();

        RemoteControl remote2 = new BasicRemote(new LGTV());
        remote2.turnOn();
        remote2.turnOff();

        RemoteControl remote3 = new BasicRemote(new HowTV());
        remote3.turnOn();
        remote3.turnOff();
    }
}
