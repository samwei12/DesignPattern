package watermachine;

import java.util.Observable;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:21 PM
 */
public class ReapingMachine extends AbstractMachine {
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            if (data.getTemp() > WeatherData.SEEDING_TEMP && data.getHumidity() > WeatherData.REAPING_HUMIDITY) {
                start();
            }
            else {
                stop();
            }
        }
    }
}
