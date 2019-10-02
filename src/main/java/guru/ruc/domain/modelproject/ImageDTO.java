package guru.ruc.domain.modelproject;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ImageDTO {

	@JsonIgnore
	private CompanyDTO company;

	private UUID id;

	private String s3route;

	private String title;

	private String extension;

	private String server;

	private String bucket;

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

	public String getS3route() {
		return s3route;
	}

	public void setS3route(String s3route) {
		this.s3route = s3route;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

}
