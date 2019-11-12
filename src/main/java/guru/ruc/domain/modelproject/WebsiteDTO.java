package guru.ruc.domain.modelproject;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("website")
public class WebsiteDTO extends ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public WebsiteDTO() {
		super();
	}

	private WebsiteDataDTO websiteData;

	public WebsiteDataDTO getWebsiteData() {
		return websiteData;
	}

	public void setWebsiteData(WebsiteDataDTO websiteData) {
		this.websiteData = websiteData;
	}

}
