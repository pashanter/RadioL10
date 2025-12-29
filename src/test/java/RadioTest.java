import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void AmountRadioStation() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(15, radio.getDefaultNumberOfRadioStations());
    }

    @Test
    public void DefaultAmountRadioStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getDefaultNumberOfRadioStations());
    }

    @Test
    public void MinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void MaxRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        Assertions.assertEquals(19, radio.getMaxRadioStation());
    }


    @Test
    public void SetRadioStationIfAbove9Test() {
        Radio radio = new Radio(); // кол-во радиостанций всего 10; макс станция - 9
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetRadioStationIfAmountRadioStationEqauls20() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(10);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetRadioStationIfAmountRadioStationEqauls20AndCurrentRadioStationEqauls30() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(30);
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
    public void NextStationIfAmountRadioStationEqauls20() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(10);
        radio.next();
        Assertions.assertEquals(11, radio.getCurrentRadioStation());
    }


    @Test
    public void NextStationIfAmountRadioStationEqauls20AndCurrentRadioStationEqauls20() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
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
    public void previousStationTestIfAmountRadioStationEqauls20() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(10);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
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


