package guru.ruc.domain.modelproject;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddressDTO {

	@JsonIgnore
	private CompanyDTO company;

	private UUID id;

	private AddressDataDTO addressData;

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public AddressDataDTO getAddressData() {
		return addressData;
	}

	public void setAddressData(AddressDataDTO addressData) {
		this.addressData = addressData;
	}

}
