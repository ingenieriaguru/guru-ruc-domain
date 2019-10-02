package guru.ruc.domain.modelproject;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("advertise")
public class AdvertiseDTO extends ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public AdvertiseDTO() {
		super();
	}

	private Integer edithorAdvertiseId;

	public Integer getEdithorAdvertiseId() {
		return edithorAdvertiseId;
	}

	public void setEdithorAdvertiseId(Integer edithorAdvertiseId) {
		this.edithorAdvertiseId = edithorAdvertiseId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edithorAdvertiseId == null) ? 0 : edithorAdvertiseId.hashCode());
		result = prime * result + ((this.getCompany().getCompanyData().getBusinessName() == null) ? 0 : this.getCompany().getCompanyData().getBusinessName().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdvertiseDTO other = (AdvertiseDTO) obj;
		//		} else if (!email.equals(other.email))
		//			return false;
		//		if (direccion == null) {
		//			if (other.direccion != null)
		//				return false;
		//		} else if (!direccion.equals(other.direccion))
		//			return false;
		//		if (imagenes == null) {
		//			if (other.imagenes != null)
		//				return false;
		//		} else if (!imagenes.equals(other.imagenes))
		//			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Advertise{");
		if (this.edithorAdvertiseId != null) {
			if (this.edithorAdvertiseId != null)
				stringBuilder.append(", advertiseId:");
			else
				stringBuilder.append("advertiseId:");
			stringBuilder.append(getEdithorAdvertiseId());
		}
		//		if (this.razonSocial != null) {
		//			stringBuilder.append(", razonSocial:'");
		//			stringBuilder.append(getRazonSocial());
		//			stringBuilder.append("'");
		//		}
		//		if (this.cuit != null) {
		//			stringBuilder.append(", cuit:'");
		//			stringBuilder.append(getCuit());
		//			stringBuilder.append("'");
		//		}
		//		if (this.categories != null) {
		//			stringBuilder.append(", rubros:[");
		//			for (int i = 0; i < getCategories().size(); i++) {
		//				if (i != 0)
		//					stringBuilder.append(",'");
		//				else
		//					stringBuilder.append("'");
		//				stringBuilder.append(getCategories().get(i));
		//				stringBuilder.append("'");
		//			}
		//			stringBuilder.append("]");
		//		}
		//		if (this.logoAnuncio != null) {
		//			stringBuilder.append(", logoAnuncio:{s3route:'");
		//			stringBuilder.append(getLogoAnuncio().getS3route());
		//			stringBuilder.append("'}");
		//		}
		//		if (this.advertiseDescription != null) {
		//			stringBuilder.append("', descripcionAnuncio:'");
		//			stringBuilder.append(getAdvertiseDescription());
		//			stringBuilder.append("'");
		//		}
		//		if (this.contactPhones != null) {
		//			stringBuilder.append(", telefonosContacto:[");
		//			for (int i = 0; i < getContactPhones().size(); i++) {
		//				if (i != 0)
		//					stringBuilder.append(",'");
		//				else
		//					stringBuilder.append("'");
		//				stringBuilder.append(getContactPhones().get(i));
		//				stringBuilder.append("'");
		//			}
		//			stringBuilder.append("]");
		//		}
		//		if (this.facebook != null) {
		//			stringBuilder.append(", facebook:'");
		//			stringBuilder.append(getFacebook());
		//			stringBuilder.append("'");
		//		}
		//		if (this.instagram != null) {
		//			stringBuilder.append(", instagram:'");
		//			stringBuilder.append(getInstagram());
		//			stringBuilder.append("'");
		//		}
		//		if (this.whatsapp != null) {
		//			stringBuilder.append(", whatsapp:'");
		//			stringBuilder.append(getWhatsapp());
		//			stringBuilder.append("'");
		//		}
		//		if (this.twitter != null) {
		//			stringBuilder.append(", twitter:'");
		//			stringBuilder.append(getTwitter());
		//			stringBuilder.append("'");
		//		}
		//		if (this.email != null) {
		//			stringBuilder.append(", email:[");
		//			for (int i = 0; i < getEmail().size(); i++) {
		//				if (i != 0)
		//					stringBuilder.append(",'");
		//				else
		//					stringBuilder.append("'");
		//				stringBuilder.append(getEmail().get(i));
		//				stringBuilder.append("'");
		//			}
		//			stringBuilder.append("]");
		//		}
		//		if (this.direccion != null) {
		//			stringBuilder.append(", direccion:{ provincia:");
		//			stringBuilder.append(getDireccion().getProvincia());
		//			stringBuilder.append(", localidad:");
		//			stringBuilder.append(getDireccion().getLocalidad());
		//			stringBuilder.append(", calle:'");
		//			stringBuilder.append(getDireccion().getCalle());
		//			stringBuilder.append("', numero:");
		//			stringBuilder.append(getDireccion().getNumero());
		//			stringBuilder.append(", piso:");
		//			stringBuilder.append(getDireccion().getPiso());
		//			stringBuilder.append(", departamento:'");
		//			stringBuilder.append(getDireccion().getDepartamento());
		//			stringBuilder.append("', codigoPostal:'");
		//			stringBuilder.append(getDireccion().getCodigoPostal());
		//			stringBuilder.append("', latitud:");
		//			stringBuilder.append(getDireccion().getLatitud());
		//			stringBuilder.append(", longitud:");
		//			stringBuilder.append(getDireccion().getLongitud());
		//			stringBuilder.append("}");
		//		}
		//		if (this.imagenes != null) {
		//			stringBuilder.append(", imagenes");
		//			for (int i = 0; i < getImagenes().size(); i++) {
		//				if (i != 0)
		//					stringBuilder.append(",{ s3route:'");
		//				else
		//					stringBuilder.append(":[{ s3route:'");
		//				stringBuilder.append(getImagenes().get(i).getS3route());
		//				stringBuilder.append("', title:'");
		//				stringBuilder.append(getImagenes().get(i).getTitle());
		//				stringBuilder.append("', extension:'");
		//				stringBuilder.append(getImagenes().get(i).getExtension());
		//				stringBuilder.append("', server:'");
		//				stringBuilder.append(getImagenes().get(i).getServer());
		//				stringBuilder.append("', bucket:'");
		//				stringBuilder.append(getImagenes().get(i).getBucket());
		//				stringBuilder.append("', uuid:'");
		//				stringBuilder.append(getImagenes().get(i).getUuid());
		//				stringBuilder.append("'}]");
		//			}
		//		}
		stringBuilder.append("}");
		return stringBuilder.toString();
	}
}
