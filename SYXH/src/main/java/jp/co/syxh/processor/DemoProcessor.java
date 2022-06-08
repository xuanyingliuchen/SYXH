package jp.co.syxh.processor;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class DemoProcessor {
	
	@Scheduled(fixedRate=10000000)
	private void DemoTask() {
		System.out.println("demo dingShi;");
	}

}
