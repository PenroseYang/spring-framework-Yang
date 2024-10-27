package yang.BookChapterTwo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @auther yangzhe
 * @date 2022/5/3 5:21 下午
 */
public class Hello {
	public void sayHello() {
		System.out.println("Hello, spring");
	}

	/**
	 * 踩坑记录
	 * (1) 目录不许有中文，必须英文
	 * (2) XmlBeanDefinitionReader 不能直接用，需要包装
	 * https://blog.csdn.net/u010316188/article/details/98891028
	 * (3) 2022-05-03，当时好像真的很开心哪，五一放假的第四天
	 * 晚上来就能敲断点了！！！
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * demo1:
		 * BeanFactory 实现的，这个用来看 1-5章
		 */
		Resource resource = new ClassPathResource("applicationContext.xml");

		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
		bdr.loadBeanDefinitions(resource);

		// 无参构造bean
//		Hello hello = (Hello) beanFactory.getBean("hello");
		// 有参构造bean
//		Person person = (Person) beanFactory.getBean("person");

		/*
		 * demo2:
		 * 第六章以后估计要看这个了
		 */
		ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) bf.getBean("hello");
		hello.sayHello();
	}
}