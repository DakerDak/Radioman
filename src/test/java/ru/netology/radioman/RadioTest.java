package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {"first check,8,8,",
            "second check,9,9",
            "third check,12,0",
            "fourth check,12,0",
            "fifth check,-1,0"})
    public void setNumber2(String testName, int numberRadioStation, int expected) {
        Radio rad = new Radio();
        rad.setNumberRadioStation(numberRadioStation);
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void setNumber() {
//        Radio rad = new Radio();
//
//        rad.setNumberRadioStation(12);
//        int expected = 9;
//        int actual = rad.getNumberRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }

    @ParameterizedTest
    @CsvSource(value = {"first check,8,9,",
            "second check,9,0",
            "third check,0,1",
            "fourth check,1,2"})
    public void nextRadioStations2(String testName, int numberRadioStation, int expected) {
        Radio rad = new Radio();
        rad.setNumberRadioStation(numberRadioStation);
        rad.nextRadioStation();
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void nextRadioStations() {
//        Radio rad = new Radio();
//
//        rad.setNumberRadioStation(8);
//        rad.nextRadioStation();
//        int expected = 9;
//        int actual = rad.getNumberRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }

    @ParameterizedTest
    @CsvSource(value = {"first check,0,9,",
            "second check,-1,9",
            "third check,1,0",
            "fourth check,8,7",
            "fifth check,12,9"})
    public void prevRadioStations2(String testName, int numberRadioStation, int expected) {
        Radio rad = new Radio();
        rad.setNumberRadioStation(numberRadioStation);
        rad.prevRadioStation();
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void prevRadioStations() {
//        Radio rad = new Radio();
//
//        rad.setNumberRadioStation(0);
//        rad.prevRadioStation();
//        int expected = 9;
//        int actual = rad.getNumberRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void setSound() {
//        Radio rad = new Radio();
//
//        rad.setCurrentVolume(5);
//        int expected = 5;
//        int actual = rad.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
    @ParameterizedTest
    @CsvSource(value = {"first check,9,9,",
            "second check,11,0",
            "third check,0,0",
            "fourth check,10,10",
            "fifth check,5,5",
            "fix check,-1,0"})
    public void soundLevel(String testName, int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"first check,8,9,",
            "second check,9,10",
            "third check,0,1",
            "fourth check,10,10"})
    public void moreSoundVolume2(String testName, int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void moreSoundVolume() {
//        Radio rad = new Radio();
//
//        rad.setCurrentVolume(0);
//        rad.increaseVolume();
//        int expected = 1;
//        int actual = rad.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//

    @ParameterizedTest
    @CsvSource(value = {"first check,10,9,",
            "second check,9,8",
            "third check,0,0",
            "fourth check,1,0",
            "fifth check,5,4"})
    public void downSoundVolume2(String testName, int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        rad.downVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void downSoundVolume() {
//        Radio rad = new Radio();
//
//        rad.setCurrentVolume(0);
//        rad.downVolume();
//        int expected = 0;
//        int actual = rad.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }


//    @Test
//    public void test2() {
//        Radio rad = new Radio();
//
//        rad.setToMax();
//        int expected = 30;
//        int actual = rad.getNumberRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void test3() {
//        Radio rad = new Radio();
//        rad.setNumberRadioStation(24);
//        rad.increase50p();
//
//        int expected = 24;
//        int actual = rad.getNumberRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }


}