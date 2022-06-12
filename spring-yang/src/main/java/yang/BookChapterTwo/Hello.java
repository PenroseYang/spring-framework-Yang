package yang.BookChapterTwo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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
	 * (3)
	 * 晚上来就能敲断点了！！！
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
		bdr.loadBeanDefinitions(resource);

		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.sayHello();
	}

}