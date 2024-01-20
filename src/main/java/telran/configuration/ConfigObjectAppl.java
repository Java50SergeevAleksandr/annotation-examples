package telran.configuration;

public class ConfigObjectAppl {

	public static void main(String[] args) throws Exception {
		ConfigObject configObj = new ConfigObject();
		Configuration configuration = new Configuration(configObj);
		try {
			configuration.configInjection();
		} catch (Exception e) {

			System.out.println(e);
		}
		System.out.println(configObj);
	}

}
