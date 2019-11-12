package guru.ruc.domain.modelproject;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("websplanet")
public class WebsplanetDTO {

	public WebsplanetDTO() {
		super();
	}

	private String provider_id;

	private String password;

	private String status;

	private String message;

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
