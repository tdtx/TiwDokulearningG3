package es.uc3m.tiw.model.daos;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.direccion;

@Entity
public class direccionDAO {
	private final EntityManager em;
	private final UserTransaction ut;

	public direccionDAO(EntityManager em, UserTransaction ut) {
		super();
		this.em = em;
		this.ut = ut;
	}

	public direccion guardarDireccion(direccion nuevaDireccion)
			throws Exception {
		ut.begin();
		em.persist(nuevaDireccion);
		ut.commit();
		return nuevaDireccion;
	}

	public direccion actualizarDireccion(direccion actualDireccion)
			throws Exception {
		ut.begin();
		em.merge(actualDireccion);
		ut.commit();
		return actualDireccion;
	}

	public void borrarDireccion(direccion direccion) throws Exception {
		ut.begin();
		em.remove(em.merge(direccion));
		ut.commit();

	}

	public direccion buscarDireccion(Long id) {
		return em.find(direccion.class, id);
	}

}
