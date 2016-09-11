package app.restaurante;

import jello.model.JelloEntity;
import jello.annotation.Expose;
import jello.security.Accessible;
import jello.ux.Preview;
import com.google.appengine.api.datastore.Key;
import jello.ux.Validation;
import jello.annotation.Reference;
import jello.rest.IllegalRequestResource;
import jello.annotation.Attachment;
import jello.annotation.KeyElement;
import jello.security.Role;
import jello.annotation.Required;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Accessible( Role.ALL )public class Mesa extends JelloEntity {

	private static final long serialVersionUID = -7001876476942265770L;

	@Validation(min=1)
	@Expose
	public Integer cantidad_personas;

	@Expose
	@KeyElement
	public String cod_mesa;

	@Expose
	@Required
	public Boolean disponibilidad;

	@Attachment(accept="image/*")
	@Expose
	@Required
	public String foto;

	@Reference(TipoMesa.class)
	@Preview(element="cod_tipo")
	@Expose
	@Required
	public Key tipo;

	@Expose
	@Required
	public String ubicacion;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
