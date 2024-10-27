package yang.BookChapterSeven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther yangzhe
 * @date 2022/7/3 20:35
 */
public class App {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//	DemoAnnotationService demoAnnotationService = (DemoAnnotationService) context.getBean(DemoAnnotationService.class);
//	DemoMethodService demoMethodService = (DemoMethodService) context.getBean(DemoMethodService.class);
//	demoAnnotationService.add();//基于注解的拦截
//	demoMethodService.add();//给予方法规则的拦截
//	context.close();
}