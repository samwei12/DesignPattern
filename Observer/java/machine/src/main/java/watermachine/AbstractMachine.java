package watermachine;

import java.util.Observer;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:54 PM
 * 所有的机器抽象基类
 */
public abstract class AbstractMachine implements Observer {
    private boolean status;

    public boolean getStatus()
    {
        return status;
    }

    public void start()
    {
        if (status) {
            return;
        }
        status = true;
        System.out.println(this.getClass().getName() +": start");
    }

    public void stop() {
        if (!status) {
            return;
        }
        status = false;
        System.out.println(this.getClass().getName() +": stop");
    }
}
