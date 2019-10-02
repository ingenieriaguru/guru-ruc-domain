package guru.ruc.domain.modelproject;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("website")
public class WebsiteDTO extends ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public WebsiteDTO() {
		super();
	}

	private String domain;

	private String subdomain;

	private String websiteType;

	private WebsplanetDTO websplanetAttributes;

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

	public WebsplanetDTO getWebsplanetAttributes() {
		return websplanetAttributes;
	}

	public void setWebsplanetAttributes(WebsplanetDTO websplanetAttributes) {
		this.websplanetAttributes = websplanetAttributes;
	}

}
