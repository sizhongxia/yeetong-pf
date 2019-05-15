package org.yeetong.rpc.interfaces;

import org.yeetong.rpc.model.UserModel;

public interface UserService {

	public UserModel getByUserId(String userId);

}
