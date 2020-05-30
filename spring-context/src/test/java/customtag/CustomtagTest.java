package customtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomtagTest {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("customtag/test.xml");
		User user = (User)bf.getBean("testbean");
		System.out.println(user.getUserName() + ", " + user.getEmail());
	}

}
