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
@Accessible( Role.ALL )public class Cliente extends JelloEntity {

	private static final long serialVersionUID = -7102728553986601989L;

	@Expose
	@Required
	public String apellido;

	@Expose
	@KeyElement
	public String cod_cliente;

	@Expose
	@Required
	public String correo_electronico;

	@Expose
	@Required
	public String nombre;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
