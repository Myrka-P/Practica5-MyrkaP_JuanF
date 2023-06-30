
package ec.edu.ups.practica5.myrka_pallo.juan_fernandez.dao;


import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.Idao.IPersonaDAO;
import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo.Cancion;
import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo.Cantante;
import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo.Compositor;
import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo.Disco;
import ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PersonaDAO implements IPersonaDAO{
//crear una lista
    private List<Persona> listaPersona;

    public PersonaDAO() {
        listaPersona = new ArrayList<>();
    }
    
 //crear, eliminar , ingresar y actualizar de la persona en un bucle for
    
    @Override
    public void create(Persona p) {
        listaPersona.add(p);
    }

    @Override
    public Persona read(int id) {
        for (Persona aux : listaPersona) {
            if (aux.getCodigo() == id) {
                if(aux instanceof Cantante){
                    System.out.println("");
                    return (Cantante) aux;
                }
                return (Compositor) aux;
            }
        }
        return null;
    }

    @Override
    public void update(Persona p) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Persona aux = listaPersona.get(i);
            if (aux.getCodigo() == p.getCodigo()) {
                listaPersona.set(i, p);
                break;
            }
        }

    }

    @Override
    public void delete(Persona p) {
        Iterator<Persona> it = listaPersona.iterator();
        while (it.hasNext()) {
            Persona aux = it.next();
            if (aux.getCodigo() == p.getCodigo()) {
                it.remove();
                break;
            }
        }
    }
    
    
    @Override
    public Persona buscarCantantePorDisco(String n){
        for (Persona aux : listaPersona) {
            if(aux instanceof Cantante){
                for (Disco d : ((Cantante) aux).getDiscografia()) {
                    if(d.getNombre().equalsIgnoreCase(n)){
                        return aux;
                    }
                    
                }
            }
        }
        return null;
    }
    
    @Override
    public Persona buscarCompositorPorCancion(String n){
        for (Persona aux : listaPersona) {
            if(aux instanceof Compositor){
                for (Cancion c : ((Compositor) aux).getCancionesTop100Billboard()) {
                    if(c.getTitulo().equalsIgnoreCase(n)){
                        return aux;
                    }
                    
                }
            }
        }
        return null;
    }

    
    @Override
    public List<Persona> findAll() {
        return listaPersona;
    }


    
}
