package pe.edu.cibertec.appcinecibertectarde.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;
import pe.edu.cibertec.appcinecibertectarde.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertectarde.services.EstadoService;

import java.util.List;
import java.util.ResourceBundle;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {


    private EstadoService estadoService;

    @GetMapping("/frmestado")
    public String frmestado(Model model){
        model.addAttribute("listaestados",estadoService.listarEstados());
        return "administracion/frmestado";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarEstado(@RequestBody Estado objEstado){
        return estadoService.registrarEstado(objEstado);
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Estado> listarEstado(){
        return estadoService.listarEstados();
    }

    @DeleteMapping("/eliminar")
    @ResponseBody
    public ResultadoResponse eliminarEstado(@RequestBody Estado objEstado){
        return estadoService.eliminarEstado(objEstado.getIdestado());
    }
}
