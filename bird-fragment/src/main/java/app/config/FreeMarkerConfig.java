package app.config;
import org.javalite.activeweb.freemarker.AbstractFreeMarkerConfig;

/**
 * Created with IntelliJ IDEA.
 * User: hp
 * Date: 13-12-20
 * Time: 下午10:35
 * To change this template use File | Settings | File Templates.
 */
public class FreeMarkerConfig extends AbstractFreeMarkerConfig {
    @Override
    public void init() {
        //this is to override a strange FreeMarker default processing of numbers
        getConfiguration().setNumberFormat("0.##");
    }
}
