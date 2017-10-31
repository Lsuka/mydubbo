package cn.unicorn.mydubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import cn.unicorn.mydubbo.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo(String str) {
		return "【ECHO】" + str;
	}
}
