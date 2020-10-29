package watermachine;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:22 PM
 */
public class WeatherData {
    private SeedingMachine seedingMachine;
    private ReapingMachine reapingMachine;
    private WateringMachine wateringMachine;

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine)
    {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
    }

    public void measurementsChanged(int temp, int humidity, int windPower)
    {
        if (temp > 5)
        {
            seedingMachine.start();

            if (humidity > 65)
                reapingMachine.start();
        }

        if (temp > 10 && humidity < 55 && windPower < 4)
            wateringMachine.start();
    }
}
