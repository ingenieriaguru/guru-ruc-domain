package guru.ruc.domain.modelproject;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class CompanyDTO extends AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public CompanyDTO() {
		super();
	}

	private UUID id;

	private CompanyDataDTO companyData;

	private List<UserDTO> users;

	private List<ProductDTO> products;

	private AddressDTO address;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public CompanyDataDTO getCompanyData() {
		return companyData;
	}

	public void setCompanyData(CompanyDataDTO companyData) {
		this.companyData = companyData;
	}

	public List<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

}
