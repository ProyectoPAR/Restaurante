package app.restaurante;

import jello.model.JelloEntity;
import jello.annotation.ReadOnly;
import jello.annotation.Expose;
import jello.security.Accessible;
import jello.rest.IllegalRequestResource;
import jello.annotation.KeyElement;
import jello.security.Role;
import jello.annotation.Required;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Accessible( Role.ALL )public class Ubicacion extends JelloEntity {

	private static final long serialVersionUID = -6083129695785163472L;

	@Expose
	@KeyElement
	public String calle;

	@Expose
	@KeyElement
	public String ciudad;

	@Expose
	@KeyElement
	public String estado_dpto;

	@Expose
	@Required
	@ReadOnly
	public String latitud;

	@Expose
	@Required
	@ReadOnly
	public String longitud;

	@Expose
	@KeyElement
	public String pais;

	@Expose
	@KeyElement
	public String zip_code;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
