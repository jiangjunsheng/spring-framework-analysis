package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupMethodTestMain {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("mytest/lookupTest.xml");
		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
		test.showMe();
	}

}
