package guru.ruc.domain.modelproject;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyDTO extends AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public CompanyDTO() {
		super();
	}

	private UUID id;

	@JsonProperty("account-id")
	private Long accountId;

	private List<UserDTO> users;

	private String businessName;

	private String cuit;

	private String webUrl;

	private List<String> categories;

	private ImageDTO companyLogo;

	private String businessDescription;

	private List<String> contactPhones;

	private String whatsapp;

	private String facebook;

	private String instagram;

	private String twitter;

	private List<String> emails;

	private AddressDTO address;

	private List<ImageDTO> images;

	private List<ProductDTO> products;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public List<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public ImageDTO getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(ImageDTO companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getBusinessDescription() {
		return businessDescription;
	}

	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}

	public List<String> getContactPhones() {
		return contactPhones;
	}

	public void setContactPhones(List<String> contactPhones) {
		this.contactPhones = contactPhones;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public List<ImageDTO> getImages() {
		return images;
	}

	public void setImages(List<ImageDTO> images) {
		this.images = images;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ \"company\": {");
		if (businessName != null) {
			sb.append("\"businessName\": \"");
			sb.append(businessName);
			sb.append("\", ");
		}
		if (categories != null && !categories.equals(Collections.EMPTY_LIST)) {
			sb.append("\"categories\": ");
			sb.append("[");
			for (int i = 0; i < categories.size(); i++) {
				if (i == 0) {
					sb.append("\"");
					sb.append(categories.get(i));
					sb.append("\"");
				} else {
					sb.append(", \"");
					sb.append(categories.get(i));
					sb.append("\"");
				}
			}
			sb.append("], ");
		}
		if (businessDescription != null) {
			sb.append("\"businessDescription\": \"");
			sb.append(businessDescription);
			sb.append("\", ");
		}
		if (contactPhones != null && !contactPhones.equals(Collections.EMPTY_LIST)) {
			sb.append("\"contactPhones\": ");
			sb.append("[");
			for (int i = 0; i < contactPhones.size(); i++) {
				if (i == 0) {
					sb.append("\"");
					sb.append(contactPhones.get(i));
					sb.append("\"");
				} else {
					sb.append(", \"");
					sb.append(contactPhones.get(i));
					sb.append("\"");
				}
			}
			sb.append("]");
			sb.append(", ");
		}
		if (emails != null && !contactPhones.equals(Collections.EMPTY_LIST)) {
			sb.append("\"emails\": ");
			sb.append("[");
			for (int i = 0; i < emails.size(); i++) {
				if (i == 0) {
					sb.append("\"");
					sb.append(emails.get(i));
					sb.append("\"");
				} else {
					sb.append(", \"");
					sb.append(emails.get(i));
					sb.append("\"");
				}
			}
			sb.append("], ");
		}
		if (address != null) {
			sb.append("\"address\": ");
			sb.append("{");
			sb.append(address.toString());
			sb.append("}, ");

		}
		if (products != null && !products.equals(Collections.EMPTY_LIST)) {
			sb.append("\"products\": ");
			sb.append("[");
			for (ProductDTO product : products) {
				sb.append("{");
				if (product instanceof WebsiteDTO) {
					sb.append("\"domain\": \"");
					sb.append(((WebsiteDTO) product).getDomain());
					sb.append("\", \"subdomain\": \"");
					sb.append(((WebsiteDTO) product).getSubdomain());
					sb.append("\", \"websiteType\": \"");
					sb.append(((WebsiteDTO) product).getWebsiteType());
					sb.append("\", \"customAttributes\": ");
					sb.append(((WebsiteDTO) product).getCustomAttributes().toString());
				}
				sb.append("}");
			}
			sb.append("]");
		}
		sb.append("}");
		sb.append("}");
		return sb.toString();
	}

}
