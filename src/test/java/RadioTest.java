import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void SetRadioStationIfAbove9Test() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetRadioStationIfBelow0Test() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeIfBelow0Test() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeIfAbove100Test() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void nextStationTest() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ifNextStationЕqual9Test() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void previousStationIfStationEquals1Test() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void previousStationTest() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationTestWhenRadioEquals0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void IncreaseVolumeTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IfVolumeNotEquals100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(98);
        volume.increaseVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void ReduceVolumeTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(2);

        volume.decreaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IfVolumeEquals0OrLess0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}


