package guru.ruc.domain.modelproject;

import java.util.List;

public class NotiMessage {

	Company company;

	List<Product> products;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
