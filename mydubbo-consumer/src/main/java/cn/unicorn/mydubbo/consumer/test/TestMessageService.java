package cn.unicorn.mydubbo.consumer.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.unicorn.mydubbo.service.IMessageService;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
	@Resource
	private IMessageService messageService;

	@Test
	public void testEcho() {
		String echo = this.messageService.echo("喉咙痛,最好稳喉x灵");
		System.err.println(echo);
	}
}
