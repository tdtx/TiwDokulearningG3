package es.uc3m.tiw.model.daos;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import es.uc3m.tiw.model.dominios.resultadosPruebas;

//import java.util.List;

public class resultadoPruebaDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public resultadoPruebaDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public resultadosPruebas guardarResultadoPrueba(resultadosPruebas nuevoResultadoPrueba) throws Exception{
        ut.begin();    
        em.persist(nuevoResultadoPrueba); 
        ut.commit();   
        return nuevoResultadoPrueba;
    }
    public resultadosPruebas actualizarResultadoPrueba(resultadosPruebas resultadoPrueba) throws Exception{
        ut.begin();
        em.merge(resultadoPrueba);
        ut.commit();
        return resultadoPrueba;
    }
    
    public void borrarResultadoPrueba(resultadosPruebas resultadoPrueba)throws Exception{
        ut.begin();
        em.remove(em.merge(resultadoPrueba));
        ut.commit();
    }
    
     
     
    public resultadosPruebas buscarCliente(Long id) {
        return em.find(resultadosPruebas.class, id);
    } 
}

