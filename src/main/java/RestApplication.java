import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

@ApplicationPath("/rest")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
