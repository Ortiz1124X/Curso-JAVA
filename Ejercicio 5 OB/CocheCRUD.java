package Interfaces;

import com.Documentacion.CocheCRUDImpl;
import com.Documentacion.CocheMain;

import java.util.List;

/**
 * Se declaron los metodos, no se implementan.
 *
 * Actua como un contrato, dice lo que hay pero no lo hace.
 */
public interface CocheCRUD{



    void save(CocheCRUD cochecrud);

    List <CocheCRUD> findAll();

    void delete (CocheCRUD cochecrud);





}


