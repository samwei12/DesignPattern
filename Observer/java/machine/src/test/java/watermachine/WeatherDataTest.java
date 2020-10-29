package watermachine;

import org.junit.Before;
import org.junit.Test;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 5:02 PM
 */
public class WeatherDataTest {
    private WeatherData weatherData;
    private ReapingMachine reapingMachine;
    private SeedingMachine seedingMachine;
    private WateringMachine wateringMachine;

    @Before
    public void setUp() throws Exception {
        reapingMachine = new ReapingMachine();
        seedingMachine = new SeedingMachine();
        wateringMachine = new WateringMachine();

        weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);
    }

    @Test
    public void testWeather() {
        weatherData.setTemp(5);
        weatherData.setTemp(11);
        weatherData.setHumidity(70);
        weatherData.setHumidity(40);
        //weatherData.setWindPower(3);
    }
}