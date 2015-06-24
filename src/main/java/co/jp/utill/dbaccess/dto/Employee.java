package co.jp.utill.dbaccess.dto;

public class Employee {

	private final long empId;
	private final String familyName;
	private final String lastName;
	private final String email;
	private final String extension;

	public Employee(long empId, String familyName, String lastName,
			String email, String extension) {
		this.empId = empId;
		this.familyName = familyName;
		this.lastName = lastName;
		this.email = email;
		this.extension = extension;
	}

	public long getEmpId() {
		return empId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getExtension() {
		return extension;
	}
}
