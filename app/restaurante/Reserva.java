package app.restaurante;

import jello.model.JelloEntity;
import jello.annotation.Association;
import jello.security.Accessible;
import jello.annotation.Expose;
import jello.ux.Validation;
import java.util.List;
import jello.annotation.Reference;
import jello.rest.IllegalRequestResource;
import java.util.Date;
import jello.security.Role;
import javax.jdo.annotations.NotPersistent;
import com.google.appengine.api.datastore.Key;
import jello.ux.Preview;
import jello.annotation.KeyElement;
import jello.annotation.Required;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Accessible( Role.ALL )public class Reserva extends JelloEntity {

	private static final long serialVersionUID = -6528837167524467642L;

	@NotPersistent
	@Association(filteredBy="cantidad_disponible")
	@Expose
	private List<Bebida> bebida;

	@Reference(Cliente.class)
	@Preview(element="cod_cliente")
	@Expose
	@Required
	public Key cliente;

	@Expose
	@KeyElement
	public String cod_reserva;

	@Expose
	@Required
	public Date fecha;

	@Expose
	@Required
	public String hora;

	@NotPersistent
	@Association(filteredBy="disponibilidad")
	@Expose
	private List<Menu> menu;

	@NotPersistent
	@Association(filteredBy="disponibilidad")
	@Expose
	private List<Mesa> mesa;

	@Validation(min=11,max=60)
	@Expose
	@Required
	public Integer min_espera;

	@Expose
	@NotPersistent
	private Integer monto_total;
	public Integer monto_total() {
		//TODO Auto-generated method stub
		return null;
	}

	@Expose
	@Required
	public String tipo_pago;

	@Override
	protected JelloEntity beforeSave() throws IllegalRequestResource {
		// TODO Auto-generated method stub
		return this;
	}



}
