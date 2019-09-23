package com.guru.ruc.orchestrator.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "company")
public class Company extends AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public Company() {
		super();
	}

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID",
	strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id",
	updatable = false,
	nullable = false)
	@Type(type = "uuid-char")
	private UUID id;

	@Column(name = "account_id")
	@JsonProperty("account-id")
	private Long accountId;

	@OneToMany(cascade = { CascadeType.ALL })
	@Column(name = "user")
	private List<User> users;

	@Column(name = "business_name")
	private String businessName;

	@Column(name = "cuit")
	private String cuit;

	@Column(name = "webUrl")
	private String webUrl;

	@ElementCollection
	@Column(name = "categories")
	private List<String> categories;

	@OneToOne(cascade = { CascadeType.ALL })
	private Image companyLogo;

	@Column(name = "business_description")
	private String businessDescription;

	@ElementCollection
	@Column(name = "contact_phones")
	private List<String> contactPhones;

	@Column(name = "whatsapp")
	private String whatsapp;

	@Column(name = "facebook")
	private String facebook;

	@Column(name = "instagram")
	private String instagram;

	@Column(name = "twitter")
	private String twitter;

	@ElementCollection
	@Column(name = "emails")
	private List<String> emails;

	@OneToOne(cascade = { CascadeType.ALL })
	private Address address;

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Image> images;

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Product> products;

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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
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

	public Image getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(Image companyLogo) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
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
		Company other = (Company) obj;
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
		sb.append("\"businessName\": \"");
		sb.append(businessName);
		sb.append("\", \"categories\": ");
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
		sb.append("]");
		sb.append(", \"businessDescription\": \"");
		sb.append(businessDescription);
		sb.append("\", \"contactPhones\": ");
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
		sb.append(", \"emails\": ");
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
		sb.append("]");
		sb.append(", \"address\": ");
		sb.append("{");
		sb.append(address.toString());
		sb.append("}");
		sb.append(", \"products\": ");
		for (Product product : products) {
			sb.append("{");
			if (product instanceof Website) {
				sb.append("\"domain\": \"");
				sb.append(((Website) product).getDomain());
				sb.append("\", \"subdomain\": \"");
				sb.append(((Website) product).getSubdomain());
				sb.append("\", \"websiteType\": \"");
				sb.append(((Website) product).getWebsiteType());
				sb.append("\", \"customAttibutes\": ");
				sb.append(((Website) product).getCustomAttributes().toString());
			}
			sb.append("}");
		}
		sb.append("}");
		sb.append("}");
		return sb.toString();
	}

}
