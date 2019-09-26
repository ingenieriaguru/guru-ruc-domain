package guru.ruc.domain.modelproject;

import java.util.List;

public class NotiMessage {

	CompanyDTO company;

	List<ProductDTO> products;

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

}
