package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldIncreaseCurrentNumberStation() {
        radio.setCurrentNumberStation(5);
        radio.increaseCurrentNumberStation();
        int expected = 6;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberStationReturnToMin() {
        radio.setCurrentNumberStation(9);
        radio.increaseCurrentNumberStation();
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentNumberStation() {
        radio.setCurrentNumberStation(5);
        radio.decreaseCurrentNumberStation();
        int expected = 4;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberStationReturnToMax() {
        radio.setCurrentNumberStation(0);
        radio.decreaseCurrentNumberStation();
        int expected = 8;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }
}
