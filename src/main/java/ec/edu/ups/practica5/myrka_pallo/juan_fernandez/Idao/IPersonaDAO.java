
package ec.edu.ups.practica5.myrka_pallo.juan_fernandez.Idao;
import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo.Persona;
import java.util.List;


public interface IPersonaDAO {
    //creacion del CRUD
    public void create(Persona p);
    public Persona read(int id);
    public void update(Persona p);
    public void delete(Persona p);
    public Persona buscarCantantePorDisco(String n);
    public Persona buscarCompositorPorCancion(String n);
    public List<Persona> findAll();
}
