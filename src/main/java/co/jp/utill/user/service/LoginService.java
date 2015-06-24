package co.jp.utill.user.service;

import co.jp.utill.sys.UtillUser;

public interface LoginService {

	public UtillUser getUser(String userId, String pass);
	
}
