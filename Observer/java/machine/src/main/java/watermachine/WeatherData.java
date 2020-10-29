package watermachine;

import java.util.Observable;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:22 PM
 */
public class WeatherData extends Observable {
    public static final int SEEDING_TEMP = 5;
    public static final int REAPING_HUMIDITY = 65;
    public static final int WATERING_HUMIDITY = 55;
    public static final int WATERING_TEMP = 10;
    public static final int WATERING_WIND = 4;

    private int temp;
    private int humidity;
    private int windPower;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        measurementsChanged();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public int getWindPower() {
        return windPower;
    }

    public void setWindPower(int windPower) {
        this.windPower = windPower;
        measurementsChanged();
    }

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        addObserver(seedingMachine);
        addObserver(reapingMachine);
        addObserver(wateringMachine);
    }

    public void measurementsChanged() {
        setChanged();
        measurementsChanged(this.temp, this.humidity, this.windPower);
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        notifyObservers();
    }
}
