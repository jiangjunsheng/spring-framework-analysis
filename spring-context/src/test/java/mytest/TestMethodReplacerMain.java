package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodReplacerMain {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("mytest/replaceMethodTest.xml");
		TestChangeMethod test = (TestChangeMethod) bf.getBean("testChangeMethod");
		test.changeMe();
	}
}
