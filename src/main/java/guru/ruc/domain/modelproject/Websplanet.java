package guru.ruc.domain.modelproject;

import java.io.Serializable;

import javax.persistence.Column;

public class Websplanet implements Serializable {

	private static final long serialVersionUID = 1L;

	public Websplanet() {
		super();
	}

	@Column(name = "provider_id")
	private String provider_id;

	@Column(name = "password")
	private String password;

	@Column(name = "status")
	private String status;

	public String getProvider_id() {
		return provider_id;
	}

	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"provider_id\": \"");
		sb.append(provider_id);
		sb.append("\", \"password\": \"");
		sb.append(password);
		sb.append("\", \"status\": \"");
		sb.append(status);
		sb.append("\"");
		sb.append("}");
		return sb.toString();
	}

}
