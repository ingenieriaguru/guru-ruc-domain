package guru.ruc.domain.domainproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.ruc.domain.modelproject.Address;
import guru.ruc.domain.modelproject.Company;
import guru.ruc.domain.modelproject.Constants;
import guru.ruc.domain.modelproject.Product;
import guru.ruc.domain.modelproject.Website;
import guru.ruc.domain.modelproject.Websplanet;
import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {Company.class, Address.class, Website.class, Websplanet.class})
public class CompanyTest {

	@Test
	public void testToString() {
		String json = "{ \"company\": "
		+ "{\"businessName\": \"Guruland\", \"categories\": [\"cd14571b-78d0-4a3b-85bf-f1c8f3a5f3a7\"]"
		+ ", \"businessDescription\": \"OFRECEMOS SOLUCIONES PARA MEJORAR LA PRESENCIA DE TU NEGOCIO EN INTERNET,"
		+ " DESTACARLO PARA CONSEGUIR MÁS CLIENTES, Y AUMENTAR TUS VENTAS.\", \"contactPhones\": [\""
		+ "+5408006668888\"], \"emails\": [\"clientes@gurusoluciones.com.ar\"], \"address\": {\"province\""
		+ ": 76, \"locality\": 16101, \"street\": \"Colectora Panamericana\", \"number\": 1804, \"floor\": 0, \"dept\""
		+ ": \"\", \"zipCode\": \"1607\", \"lat\": \"-34.50239\", \"lng\": \"-58.54424\"}, \"products\": [{\"domain\""
		+ ": \"\", \"subdomain\": \"\", \"websiteType\": \"websplanet\", \"customAttributes\": {"
		+ "\"provider_id\": \"\", \"password\": \"Guru\", \"status\": \"websplanet-not-created\"}}]}}";
		Company company = new Company();
		company.setBusinessName("Guruland");
		company.setCategories(new ArrayList<String>(Arrays.asList("cd14571b-78d0-4a3b-85bf-f1c8f3a5f3a7")));
		company.setBusinessDescription("OFRECEMOS SOLUCIONES PARA MEJORAR LA PRESENCIA DE TU NEGOCIO EN INTERNET, "
		+ "DESTACARLO PARA CONSEGUIR MÁS CLIENTES, Y AUMENTAR TUS VENTAS.");
		company.setContactPhones(new ArrayList<String>(Arrays.asList("+5408006668888")));
		company.setEmails(new ArrayList<String>(Arrays.asList("clientes@gurusoluciones.com.ar")));
		Address address = new Address();
		address.setProvince(76);
		address.setLocality(16101);
		address.setStreet("Colectora Panamericana");
		address.setNumber(1804);
		address.setFloor(0);
		address.setDept("");
		address.setZipCode("1607");
		address.setLat("-34.50239");
		address.setLng("-58.54424");
		company.setAddress(address);
		List<Product> products = new ArrayList<Product>();
		Website website = new Website();
		website.setDomain("");
		website.setSubdomain("");
		website.setWebsiteType("websplanet");
		Websplanet customAttributes = new Websplanet();
		customAttributes.setProvider_id("");
		customAttributes.setPassword("Guru");
		customAttributes.setStatus(Constants.NOT_CREATED);
		website.setCustomAttributes(customAttributes);
		products.add(website);
		company.setProducts(products);
		Assert.assertEquals(company.toString(), json);
	}

}
