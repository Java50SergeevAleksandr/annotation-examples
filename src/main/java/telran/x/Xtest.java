package telran.x;

import telran.reflect.BeforeEach;
import telran.reflect.Test;

public class Xtest {
	@BeforeEach
	void be1() {
		System.out.println("Before 1");
	}

	@BeforeEach
	void be2() {
		System.out.println("Before 2");
	}

	@Test
	void f1() {
		System.out.println("test 1");
	}

	int sum(int op1, int op2) {
		System.out.println("method sum");
		return op1 + op2;
	}

	int subtract(int op1, int op2) {
		System.out.println("method subtract");
		return op1 - op2;
	}

	@Test
	void f2() {
		System.out.println("test 2");
	}

}
