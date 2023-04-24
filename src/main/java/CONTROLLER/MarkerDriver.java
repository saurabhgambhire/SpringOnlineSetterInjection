package CONTROLLER;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import DTO.*;

public class MarkerDriver
{
	public static void main(String[] args)
	{
		ClassPathResource classPathResource = new ClassPathResource("Core.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Marker marker   = (Marker) beanFactory.getBean("Marker");
		System.out.println(marker);
		
	}

}
