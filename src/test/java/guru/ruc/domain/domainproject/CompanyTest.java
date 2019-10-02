package guru.ruc.domain.domainproject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.ruc.domain.modelproject.AddressDTO;
import guru.ruc.domain.modelproject.CompanyDTO;
import guru.ruc.domain.modelproject.WebsiteDTO;
import guru.ruc.domain.modelproject.WebsplanetDTO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { CompanyDTO.class, AddressDTO.class, WebsiteDTO.class, WebsplanetDTO.class })
public class CompanyTest {

	@Test
	public void testToString() {
		String json = "123";
		String jsonb = "123";
		Assert.assertEquals(json, jsonb);
	}

}
