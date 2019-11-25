package guru.ruc.domain.modelproject;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PersonDTO extends AbstractAuditingEntity {

	private static final long serialVersionUID = 1L;

	private UUID id;

	@JsonIgnore
	private List<UserDTO> users;

	private String name;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public List<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
