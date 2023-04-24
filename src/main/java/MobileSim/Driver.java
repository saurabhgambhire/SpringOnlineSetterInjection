package MobileSim;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Driver 
{
	
	public static void main(String[] args)
	{
		ClassPathResource classPathResource = new ClassPathResource("mobileSim.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Mobile mobile   = (Mobile) beanFactory.getBean("Mobile");
		System.out.println(mobile);
	}

}
