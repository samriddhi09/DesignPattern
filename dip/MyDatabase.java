package solid.live.dip;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 4:47:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyDatabase implements Writer {
    private static Map<Integer, String> data = new Hashtable<Integer, String>();
    private static int count = 0;

    // Modified the return type of this.
    public void write(String inputString) {
        data.put(++count, inputString);
    }
}