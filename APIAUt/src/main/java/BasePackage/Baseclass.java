package BasePackage;


import org.apache.http.client.protocol.RequestProxyAuthentication;
import org.apache.http.protocol.ResponseServer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;



public class Baseclass {
	
	public static RequestProxyAuthentication httpRequest;
	public static ResponseServer response;
	
	
	public Logger logger;
	
	@BeforeClass
	public void setup(){
		
		logger=Logger.getLogger("Fox API");//added Logger
		PropertyConfigurator.configure("Log4j.properties"); //added logger
		logger.setLevel(Level.DEBUG);
		
	}
	
	


}
