package org.yeetong.apix.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yeetong.rpc.interfaces.UserService;

@RestController
@RequestMapping("/yeetong/base")
public class BaseController {

	@Autowired
	UserService userService;

	@RequestMapping("index")
	public Map<String, Object> index(HttpServletRequest request) {
		Map<String, Object> data = new HashMap<>();
		data.put("status", userService.getByUserId("5cda87cc7ba955ddc98cbe282604e6"));
		return data;
	}

}
