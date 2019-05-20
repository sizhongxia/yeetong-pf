package org.yeetong.apix.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yeetong.rcp.api.interfaces.todo.TdPlanRpcService;
import org.yeetong.rcp.api.interfaces.todo.TdTokenRpcService;
import org.yeetong.rcp.api.interfaces.todo.TdUserLikeRpcService;
import org.yeetong.rcp.api.interfaces.todo.TdUserRpcService;
import org.yeetong.rcp.api.interfaces.todo.TdUserWxRpcService;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;

@RestController
@RequestMapping("/yeetong/base")
public class BaseController {

	@MotanReferer
	TdPlanRpcService tdPlanRpcService;
	@MotanReferer
	TdUserRpcService tdUserRpcService;
	@MotanReferer
	TdUserWxRpcService tdUserWxRpcService;
	@MotanReferer
	TdTokenRpcService tdTokenRpcService;
	@MotanReferer
	TdUserLikeRpcService tdUserLikeRpcService;

	@RequestMapping("index")
	public Map<String, Object> index(HttpServletRequest request) {
		Map<String, Object> data = new HashMap<>();
		data.put("plans", tdPlanRpcService.findBy("id", 57L));
		data.put("users", tdUserRpcService.findBy("id", 1L));
		data.put("userWxs", tdUserWxRpcService.findBy("id", 1L));
		data.put("tokens", tdTokenRpcService.findBy("id", 1L));
		data.put("userLikes", tdUserLikeRpcService.findBy("id", 1L));

		Map<String, Object> param = new HashMap<>();
		param.put("nickName", "%夏%");
		param.put("deleteFlag", "N");
		data.put("userLikes2", tdUserRpcService.findByPage(1, 10, param));

		return data;
	}

}
