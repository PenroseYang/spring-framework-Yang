package yang.OriginTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther yangzhe
 * @date 2022/5/3 4:34 下午
 */
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UserTest user = (UserTest) context.getBean("user");
		System.out.println(user.getUserName());
	}

}
