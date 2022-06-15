package ru.netology.radioman;

public class Radio {
    private int numberRadioStation;
    private int currentVolume;
    private int quantityRadioStation = 10;
    private int maxCurrentVolume = 10;

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public Radio() {

    }

    public int getNumberRadioStation() {  //текущий номер радиостанции

        return numberRadioStation;
    }

    public void setNumberRadioStation(int numberRadioStation) { //выбор номер радиостанци
        if (numberRadioStation < 0) {
            return;
        }
        if (numberRadioStation > (quantityRadioStation - 1)) {
            return;
        }
        this.numberRadioStation = numberRadioStation;
    }

    public void nextRadioStation() {  // переключение на следующую радиостанцию
        if (numberRadioStation < (quantityRadioStation - 1)) {
            numberRadioStation = numberRadioStation + 1;
        } else {
            numberRadioStation = 0;
        }

    }

    public void prevRadioStation() {  // переключение на предыдущую радиостанцию

        if (numberRadioStation > 0 ) {
            numberRadioStation = numberRadioStation - 1;
        } else {
            numberRadioStation = (quantityRadioStation - 1);
        }

    }

    public int getCurrentVolume() {  //текущий уровень звука
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { //выбор уровня звука
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {  // громкость на одну еденицу больше
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {   // громкость на одну еденицу меньше
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


//    public void setToMax() {
//        numberRadioStation = 30;
//    }
//
//
//    public void increase50p() {
//        int newNumberRadioStation = numberRadioStation * 150 / 100;
//        //this.numberRadioStation = newNumberRadioStation;
//        setNumberRadioStation(newNumberRadioStation);
//    }
}
