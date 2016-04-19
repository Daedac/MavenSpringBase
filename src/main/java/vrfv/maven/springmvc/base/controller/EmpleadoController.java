/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrfv.maven.springmvc.base.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vrfv.maven.springmvc.base.dto.Empleado;
import vrfv.maven.springmvc.base.service.ServiceEmpleado;

/**
 *
 * @author FAVV879F
 */
@Controller("empleadoCtrl")
public class EmpleadoController implements Serializable{
    @Autowired
    private ServiceEmpleado serviceEmp;
    private Empleado empleado;
    
    @PostConstruct
    public void init(){
        //TODO
    }
    
    public void consultaEmpleado(ActionEvent ae){
     //TODO
    }
    
    public List<Empleado> completaEmpleado(String cityPrefix) {
        return serviceEmp.consultaPorIndicioNombre(cityPrefix);
    }

    public ServiceEmpleado getServiceEmp() {
        return serviceEmp;
    }

    public void setServiceEmp(ServiceEmpleado serviceEmp) {
        this.serviceEmp = serviceEmp;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
