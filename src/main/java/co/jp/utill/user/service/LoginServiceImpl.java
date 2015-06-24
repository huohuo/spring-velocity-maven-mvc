package co.jp.utill.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.jp.utill.dbaccess.dao.UserDao;
import co.jp.utill.dbaccess.dto.UserDto;
import co.jp.utill.sys.UtillUser;

@Component
public class LoginServiceImpl implements LoginService {

	private UserDao userDao;

	@Autowired
	public LoginServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public UtillUser getUser(String userId, String pass) {
		// byte[] bytePass = DigestUtils.md5Digest(pass.getBytes());
		UserDto userDto = userDao.certificateUser(userId, pass);

		UtillUser user = null;
		if (userDto != null) {
			user = new UtillUser(userDto.getEmpId(), userDto.getUserId(),
					userDto.getRoleId());
		}

		return user;
	}

}
