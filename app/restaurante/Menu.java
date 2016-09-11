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
import jello.annotation.Attachment;

@PersistenceCapable
@Accessible( Role.ALL )public class Menu extends JelloEntity {

	private static final long serialVersionUID = -7184768732875893814L;

	@Validation(min=0)
	@Expose
	@Required
	public Integer cantidad;

	@Expose
	@KeyElement
	public String cod_menu;

	@Expose
	@Required
	public String descripcion;

	@Expose
	@Required
	public Boolean disponibilidad;

	@Validation(min=0)
	@Expose
	@Required
	public Double precio;

	@Attachment(accept="image/*")
	@Expose
	@Required
	public String foto;


	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
