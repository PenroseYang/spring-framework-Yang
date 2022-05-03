package yang.OriginTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther yangzhe
 * @date 2022/5/3 4:35 下午
 */
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public UserTest user(){
		return new UserTest("杨喆--测试成功了！");
	}
}
