package watermachine;

import java.util.Observable;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:22 PM
 */
public class SeedingMachine extends AbstractMachine {
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            if (data.getTemp() > WeatherData.SEEDING_TEMP) {
                start();
            }
            else {
                stop();
            }
        }
    }
}
