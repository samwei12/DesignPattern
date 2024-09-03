package watermachine;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 5:02 PM
 */
public class WeatherDataTest {
    private WeatherData weatherData;
    private List<AbstractMachine> machines;

    @Before
    public void setUp() throws Exception {
        machines = new ArrayList<AbstractMachine>();
        machines.add(new ReapingMachine());
        machines.add(new SeedingMachine());
        machines.add(new WateringMachine());

        weatherData = new WeatherData(machines);
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