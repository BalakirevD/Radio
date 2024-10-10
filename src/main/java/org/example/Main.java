package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var radio = new Radio();
        radio.setSoundVolume(-800);
        radio.setCurrentRadioStation(4);
        System.out.println(radio);
    }
}