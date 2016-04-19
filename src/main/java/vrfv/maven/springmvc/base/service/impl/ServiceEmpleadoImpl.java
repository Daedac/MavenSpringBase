    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrfv.maven.springmvc.base.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vrfv.maven.springmvc.base.dao.EmpleadoDao;
import vrfv.maven.springmvc.base.dto.Empleado;
import vrfv.maven.springmvc.base.service.ServiceEmpleado;

/**
 *
 * @author FAVV879F
 */
@Service("empleado")
public class ServiceEmpleadoImpl implements ServiceEmpleado{

    @Autowired
    private EmpleadoDao emp;

    @Override
    public List<Empleado> consultaEmpleados() {
        return emp.consultaEmpleados();
    }

    @Override
    public Empleado consultaEmpleadoPorId(Integer idEmpleado) {
        return emp.consultaEmpleadoPorId(idEmpleado);
    }

    @Override
    public List<Empleado> consultaPorIndicioNombre(String indicioNombre) {
        return emp.consultaPorIndicioNombre(indicioNombre);
    }
    
}
