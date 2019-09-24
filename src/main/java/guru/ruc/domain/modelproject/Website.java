package guru.ruc.domain.modelproject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity(name = "website")
@JsonTypeName("website")
public class Website extends Product implements Serializable {

	private static final long serialVersionUID = 1L;

	public Website() {
		super();
	}

	@Column(name = "domain")
	private String domain;

	@Column(name = "subdomain")
	private String subdomain;

	@Column(name = "websiteType")
	private String websiteType;

	@Type(type = "json")
	@Column(columnDefinition = "json",
	name = "custom_attributes")
	private Websplanet customAttributes;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public String getWebsiteType() {
		return websiteType;
	}

	public void setWebsiteType(String websiteType) {
		this.websiteType = websiteType;
	}

	public Websplanet getCustomAttributes() {
		return customAttributes;
	}

	public void setCustomAttributes(Websplanet customAttributes) {
		this.customAttributes = customAttributes;
	}

}
