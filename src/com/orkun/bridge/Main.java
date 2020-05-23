package com.orkun.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.turnOff();

        var remoteControl2 = new AdvancedRemoteControl(new SamsungTV());
        remoteControl2.turnOn();
        remoteControl2.turnOff();
    }
}
