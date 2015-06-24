package co.jp.utill.dbaccess.dto;

public class RoleDto {

	private long roleId;
	private String roleName;
	private String description;

	public RoleDto(long roleId, String roleName, String description) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.description = description;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
