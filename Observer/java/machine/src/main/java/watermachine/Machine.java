package watermachine;

/**
 * @author xiaosen.dxs@alibaba-inc.com
 * @date 2020/10/29 4:54 PM
 * 所有的机器抽象基类
 */
public abstract class Machine {
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
