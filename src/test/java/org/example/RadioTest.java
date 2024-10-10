package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {
    Radio radioExpected = new Radio();
    Radio radioActual = new Radio();

    @Test
    void nextStation() {
        radioExpected.setCurrentRadioStation(6);
        radioActual.setCurrentRadioStation(5);

        radioActual.nextStation();
        Assertions.assertEquals(radioExpected.getCurrentRadioStation(), radioActual.getCurrentRadioStation());
    }

    @Test
    void prevStation() {
        radioExpected.setCurrentRadioStation(6);
        radioActual.setCurrentRadioStation(7);

        radioActual.prevStation();
        Assertions.assertEquals(radioExpected.getCurrentRadioStation(), radioActual.getCurrentRadioStation());
    }

    @Test
    void increaseVolume() {
        radioExpected.setSoundVolume(6);
        radioActual.setSoundVolume(5);

        radioActual.increaseVolume();
        Assertions.assertEquals(radioExpected.getSoundVolume(), radioActual.getSoundVolume());
    }

    @Test
    void reductionVolume() {
        radioExpected.setSoundVolume(6);
        radioActual.setSoundVolume(7);

        radioActual.reductionVolume();
        Assertions.assertEquals(radioExpected.getSoundVolume(), radioActual.getSoundVolume());
    }
}