import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(77);
        int expected = 77;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePlus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(77);
        radio.increaseVolume();

        int expected = 78;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(77);
        radio.decreaseVolume();

        int expected = 76;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
