package Mobile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource resource = new ClassPathResource("core.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Mobile mobile   = (Mobile)beanFactory.getBean("Mobile");
		System.out.println(mobile);
	}

}
