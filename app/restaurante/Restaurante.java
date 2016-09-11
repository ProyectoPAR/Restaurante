package app.restaurante;

import jello.model.JelloEntity;
import jello.annotation.Expose;
import jello.security.Accessible;
import jello.rest.IllegalRequestResource;
import jello.annotation.KeyElement;
import jello.security.Role;
import jello.annotation.Required;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Accessible( Role.ALL )public class Restaurante extends JelloEntity {

	private static final long serialVersionUID = -5490028613702305320L;

	@Expose
	@KeyElement
	public String codigo;

	@Expose
	@Required
	public String eslogan;

	@Expose
	@Required
	public String nombre;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
