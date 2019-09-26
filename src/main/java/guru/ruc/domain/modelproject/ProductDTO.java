package guru.ruc.domain.modelproject;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
include = JsonTypeInfo.As.PROPERTY,
property = "type")
@JsonSubTypes({ @Type(value = WebsiteDTO.class,
name = "website"),
		@Type(value = AdvertiseDTO.class,
		name = "advertise") })
public abstract class ProductDTO extends BaseProductsEntity {

	private CompanyDTO company;

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

}
