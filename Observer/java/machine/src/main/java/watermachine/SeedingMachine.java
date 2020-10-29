package watermachine;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:22 PM
 */
public class SeedingMachine extends Machine implements Observer {
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            if (data.getTemp() > WeatherData.SEEDING_TEMP) {
                start();
            }
        }
    }
}
