package DAO;
import java.util.List;

public interface DAO<T, K> {
    
    void insertar(T alum);
    
    List<T> obtenerTodos(); 
    
    void eliminar(T alum);
   
    void modificar(T alum);
    
    T obtener(K id);
}
