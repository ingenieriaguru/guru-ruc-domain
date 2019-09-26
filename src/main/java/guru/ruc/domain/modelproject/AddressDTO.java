package guru.ruc.domain.modelproject;

public class AddressDTO {

	private Long id;

	private CompanyDTO company;

	private Integer province;

	private Integer locality;

	private String street;

	private Integer number;

	private Integer floor;

	private String dept;

	private String zipCode;

	private String lat;

	private String lng;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getLocality() {
		return locality;
	}

	public void setLocality(Integer locality) {
		this.locality = locality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (province != null) {
			sb.append("\"province\": ");
			sb.append(province);
			sb.append(", ");
		}
		if (province != null) {
			sb.append("\"locality\": ");
			sb.append(locality);
			sb.append(", ");
		}
		if (street != null) {
			sb.append("\"street\": \"");
			sb.append(street);
			sb.append("\", ");
		}
		if (number != null) {
			sb.append("\"number\": ");
			sb.append(number);
			sb.append(", ");
		}
		if (floor != null) {
			sb.append("\"floor\": ");
			sb.append(floor);
			sb.append(", ");
		}
		if (dept != null) {
			sb.append("\"dept\": \"");
			sb.append(dept);
			sb.append("\", ");
		}
		if (zipCode != null) {
			sb.append("\"zipCode\": \"");
			sb.append(zipCode);
			sb.append("\", ");
		}
		if (lat != null) {
			sb.append("\"lat\": \"");
			sb.append(lat);
			sb.append("\", ");
		}
		if (lng != null) {
			sb.append("\"lng\": \"");
			sb.append(lng);
			sb.append("\"");
		}
		return sb.toString();
	}

}
