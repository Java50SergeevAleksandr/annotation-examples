package telran.x;

import telran.reflect.ShemaProperties;

public class SchemaPropertiesApp {
	public static void main(String[] args) {
		try {
			ShemaProperties.displayFieldProperties(new PersonNormal());
		} catch (Exception e) {
			throw new RuntimeException("error: PersonNormal must no throw any exceptions");
		}
		try {
			ShemaProperties.displayFieldProperties(new PersonNoId());
			throw new RuntimeException("error: PersonNoId must throw IllegalStateException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			ShemaProperties.displayFieldProperties(new PersonTwoId());
			throw new RuntimeException("error: PersonTwoId must throw IllegalStateException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
