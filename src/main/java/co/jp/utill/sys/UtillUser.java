package co.jp.utill.sys;

public final class UtillUser {

	private long empId;
	private String userId;
	private long roleId;

	public UtillUser(long empId, String userId, long roleId) {
		this.empId = empId;
		this.userId = userId;
		this.roleId = roleId;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

}
