package org.yeetong.rpc.service.srpcs;

import javax.annotation.Resource;

import org.yeetong.rpc.interfaces.UserService;
import org.yeetong.rpc.model.UserModel;
import org.yeetong.rpc.service.model.TdUser;
import org.yeetong.rpc.service.service.TdUserService;

public class UserServiceImple implements UserService {

	@Resource
	TdUserService tdUserService;

	@Override
	public UserModel getByUserId(String userId) {
		UserModel user = new UserModel();
		TdUser tdUser = tdUserService.findBy("userId", userId);
		if (tdUser == null) {
			user.setUserId("0");
		} else {
			user.setUserId(tdUser.getId().toString());
		}
		return user;
	}

}
