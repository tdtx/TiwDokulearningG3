package es.uc3m.tiw.model.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.Cupon;


public class CuponDAO {
	
	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public CuponDAO(EntityManager em, UserTransaction ut) {  
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public Cupon guardarCupon(Cupon nuevoCupon) throws Exception{
		 ut.begin();
		 em.persist(nuevoCupon);
		 ut.commit();
		 return nuevoCupon;
	 }
	 public Cupon actualizarCupon(Cupon actualCupon) throws Exception{
		 ut.begin();
		 em.merge(actualCupon);
		 ut.commit();
		 return actualCupon;
	 }
	 public void borrarCupon(Cupon cupon) throws Exception{
		 ut.begin();
		 em.remove(em.merge(cupon));
		 ut.commit();
		 
	 }
	 
	    public Cupon buscarCupon(Long id) {
	        return em.find(Cupon.class, id);
	    } 
	    
	   public List<Cupon> cuponesNoUsados (String identificador) throws Exception {
			return em.createQuery("select u from Cupon u where u.identificador='"+identificador+"'",Cupon.class).getResultList();
		}
	   
	 //busqueda por codigo
		public Cupon buscarCupon(String codigoVale) throws Exception{
			return em.createQuery("select u from Vale u where u.codigo='"+codigoVale+"'",Cupon.class).getSingleResult();
		}

	
	

}