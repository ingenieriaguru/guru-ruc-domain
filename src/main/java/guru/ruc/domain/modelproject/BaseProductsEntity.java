package guru.ruc.domain.modelproject;

import java.util.UUID;

public class BaseProductsEntity extends AbstractAuditingEntity {

	private static final long serialVersionUID = 1L;

	private UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
