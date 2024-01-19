package telran.configuration;

public class ConfigObjectAppl {

	public static void main(String[] args) throws Exception {
		ConfigObject configObj = new ConfigObject();
		Configuration configuration = new Configuration(configObj);
		configuration.configInjection();
		System.out.println(configObj);

	}

}
