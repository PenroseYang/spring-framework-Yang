//package yang.BookChapterSeven;
//
//import org.junit.After;
//import org.junit.Before;
//import org.springframework.stereotype.Component;
//
///**
// * @auther yangzhe
// * @date 2022/7/3 20:33
// */
//
//@AspectJ
//@Component
//public class LogAspect {
//	@Pointcut("@annotation(com.zy.testAop.Action)")
//	public void annotationPointCut() {
//		System.out.println("annotationPointCut");
//	}
//
//	@After("annotationPointCut()")
//	public void after(JoinPoint joinPoint) {
//		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//		Method method = signature.getMethod();
//		Action action = method.getAnnotation(Action.class);
//		System.out.println("注解式拦截" + action.name());
//	}
//
//	@Before("execution(* com.zy.testAop.DemoMethodService.*(..))")
//	public void before(JoinPoint joinPoint) {
//		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//		Method method = signature.getMethod();
//		System.out.println("方法规则式拦截，" + method.getName());
//	}
//}