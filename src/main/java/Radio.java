public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {

        int next = currentRadioStation + 1;
        if (next < 9) {
            setCurrentRadioStation(next);
        } else {
            currentRadioStation = 0;
        }

    }


    public void previousStation() {
        int prev = currentRadioStation - 1;
        if (prev > 0) {
            setCurrentRadioStation(prev);
        } else {
            currentRadioStation = 9;
        }

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

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        int plus = currentVolume + 1;
        if (plus < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        int minus = currentVolume - 1;
        if (minus < 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
