import common.basic.logs.Logger;
import common.playframework2.logs.LoggerPlay2;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {
	@Override
	public void onStart(Application app) {

        Logger.setLogger(new LoggerPlay2());
        Logger.setDebug(true);
        Logger.i();
    }
}
