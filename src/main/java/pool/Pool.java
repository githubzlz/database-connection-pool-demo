package pool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-11 17:22git branch -M main
 * @description pool
 */
public abstract class Pool {
    private List<Connection> connectionList = new ArrayList<>();
    private int maxNum = 50;
}
