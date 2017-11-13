package corespringobjectcall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class abcd {
public static void main(String args[])
{
	ApplicationContext cn=new ClassPathXmlApplicationContext("abc-servlet.xml");
	c2 objc2=(c2)cn.getBean("cc2");
	 objc2.ccc1.sum();
	 
}
}
