package yang.BookChapterSeven;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @auther: yangzhe
 * @date 2022/7/3 20:32
 */
@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface Action {
	String name();
}