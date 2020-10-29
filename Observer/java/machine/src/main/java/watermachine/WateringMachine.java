package watermachine;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:22 PM
 */
public class WateringMachine {
    private boolean status;

    public boolean getStatus()
    {
        return status;
    }

    public void start()
    {
        status = true;
    }
}
