package telran.configuration;

import telran.configuration.annotations.Value;

public class ConfigObject {
	@Value("app.number.prop:20")
	int number;
	@Value("app.lnumber.prop:200000000")
	long longNumber;
	@Value("app.str.prop:Hello")
	String str;
	@Value("app.fnumber.prop:0.5")
	float floatNumber;
	@Value("app.dnumber.prop")
	double doubleNumber;

	@Override
	public String toString() {
		return "ConfigObject [number=" + number + ", longNumber=" + longNumber + ", str=" + str + ", floatNumber="
				+ floatNumber + ", doubleNumber=" + doubleNumber + "]";
	}

}
