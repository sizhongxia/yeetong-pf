package org.yeetong.rpc.service.configurer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;

@Component
@Order(value = 1)
public class MotanSwitcherRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
		System.out.println("server start...");
	}
}