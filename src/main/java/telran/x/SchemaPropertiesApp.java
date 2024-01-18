package telran.x;

import telran.reflect.ShemaProperties;

public class SchemaPropertiesApp {
	public static void main(String[] args) {
		PersonNomal np = new PersonNomal();
		PersonNoId noId = new PersonNoId();
		PersonTwoId twoId = new PersonTwoId();
		try {
			ShemaProperties.displayFieldProperties(np);
			ShemaProperties.displayFieldProperties(noId);
			ShemaProperties.displayFieldProperties(twoId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
