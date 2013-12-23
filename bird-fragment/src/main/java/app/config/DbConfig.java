package app.config;

import org.javalite.activeweb.AbstractDBConfig;
import org.javalite.activeweb.AppContext;

/**
 * Created with IntelliJ IDEA.
 * User: hp
 * Date: 13-12-20
 * Time: 下午8:59
 * To change this template use File | Settings | File Templates.
 */
public class DbConfig extends AbstractDBConfig {

    public void init(AppContext context) {

        environment("development").jdbc("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/budget_dev", "root", "x5");

        environment("development").testing().jdbc("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/budget_test", "root", "x5");

        environment("production").jndi("jdbc/budget_production");
    }
}
