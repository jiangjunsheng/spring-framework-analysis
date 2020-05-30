package mytest.awaretest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareTest implements BeanFactoryAware {

	private BeanFactory beanFactory;

	// 声明bean的时候spring会自动注入BeanFactory
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void testAware() {
		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.say();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mytest/awaretest/awareTest.xml");
		AwareTest awareTest = (AwareTest) ctx.getBean("awareTest");
		awareTest.testAware();
	}
}
