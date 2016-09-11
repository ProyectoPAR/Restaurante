package app.restaurante;

import jello.model.JelloEntity;
import jello.annotation.Expose;
import jello.security.Accessible;
import jello.ux.Validation;
import jello.rest.IllegalRequestResource;
import jello.annotation.KeyElement;
import jello.security.Role;
import jello.annotation.Required;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Accessible( Role.ALL )public class TipoMesa extends JelloEntity {

	private static final long serialVersionUID = -4745502441743922235L;

	@Expose
	@KeyElement
	public String cod_tipo;

	@Expose
	@Required
	public String descripcion;

	@Validation(min=0)
	@Expose
	@Required
	public Double precio;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
