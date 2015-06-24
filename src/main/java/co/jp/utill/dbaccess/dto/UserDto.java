package co.jp.utill.dbaccess.dto;

public class UserDto {

	private long empId;
	private String userId;
	private String pass;
	private long roleId;

	public UserDto(long empId, String userId, String pass, long roleId) {
		this.empId = empId;
		this.userId = userId;
		this.pass = pass;
		this.roleId = roleId;
	}

	public UserDto(long empId, String userId, long roleId) {
		this.empId = empId;
		this.userId = userId;
		this.roleId = roleId;
	}

	public long getEmpId() {
		return empId;
	}

	public String getUserId() {
		return userId;
	}

	public String getPass() {
		return pass;
	}

	public long getRoleId() {
		return roleId;
	}
}
