package guru.ruc.domain.modelproject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

	private Long id;

	@JsonProperty("nombreDeUsuario")
	private String userName;

	private CompanyDTO company;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

}
