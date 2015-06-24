package co.jp.utill.dbaccess.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.jp.utill.dbaccess.dto.UserDto;

@Component
public class UserDao {

	@Autowired
	private DataSource dataSource;

	private static final String INSERT_USER = "INSERT INTO usr "
			+ " (emp_id, user_id, pass, role_id, last_login, prc_date) "
			+ " VALUES(?, ?, ?, ?, ?, NOW())";

	private static final String CERTIFICATE_USER = "SELECT emp_id, user_id, role_id "
			+ " FROM usr WHERE user_id = ? AND pass = ? ";

	private static final String UPDATE_ROLE_USER = "UPDATE usr SET role_id = ?, "
			+ " WHERE user_id = ?";

	@Transactional
	public void insert(UserDto user) {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update(INSERT_USER, user.getUserId(), user.getPass(),
				user.getEmpId(), user.getRoleId());
	}

	public UserDto getUser(long empId) {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template.queryForObject(CERTIFICATE_USER,
				new RowMapper<UserDto>() {
					@Override
					public UserDto mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						return new UserDto(rs.getLong(1), rs.getString(2), rs
								.getLong(3));
					}
				}, empId);
	}

	public UserDto certificateUser(final String userId, final String pass) {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		List<UserDto> userList = template.query(CERTIFICATE_USER,
				new RowMapper<UserDto>() {
					@Override
					public UserDto mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						return new UserDto(rs.getLong(1), rs.getString(2), rs
								.getLong(3));
					}
				}, userId, pass);
		return DataAccessUtils.singleResult(userList);
	}

	@Transactional
	public void updateUser(UserDto user) {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update(UPDATE_ROLE_USER, user.getRoleId(), user.getUserId());
	}
}
