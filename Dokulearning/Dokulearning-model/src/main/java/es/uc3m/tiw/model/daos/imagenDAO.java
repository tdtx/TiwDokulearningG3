package es.uc3m.tiw.model.daos;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import es.uc3m.tiw.model.dominios.imagenes;

//import java.util.List;

public class imagenDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public imagenDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public imagenes guardarImagen(imagenes nuevaImagen) throws Exception{
        ut.begin();    
        em.persist(nuevaImagen); 
        ut.commit();   
        return nuevaImagen;
    }
    public imagenes actualizarImagen(imagenes imagen) throws Exception{
        ut.begin();
        em.merge(imagen);
        ut.commit();
        return imagen;
    }
    
    public void borrarImagen(imagenes imagen)throws Exception{
        ut.begin();
        em.remove(em.merge(imagen));
        ut.commit();
    }
    
     
    public imagenes buscarImagen(Long id) {
        return em.find(imagenes.class, id);
    } 
}
