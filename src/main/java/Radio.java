public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int defaultNumberOfRadioStations = 10;
    private int minRadioStation;
    private int maxRadioStation = defaultNumberOfRadioStations - 1;


    public Radio(int newAmountRadioStations) {
        defaultNumberOfRadioStations = newAmountRadioStations;
        maxRadioStation = newAmountRadioStations - 1;
    }

    public Radio() {
        this.defaultNumberOfRadioStations = defaultNumberOfRadioStations;
        maxRadioStation = this.defaultNumberOfRadioStations - 1;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getDefaultNumberOfRadioStations() {
        return defaultNumberOfRadioStations;
    }
}
