package br.mso.empresaspringjpa.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.mso.empresaspringjpa.boot.domain.Cargo;
import br.mso.empresaspringjpa.boot.domain.Departamento;
import br.mso.empresaspringjpa.boot.domain.Funcionario;
import br.mso.empresaspringjpa.boot.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;

  @RequestMapping(method = RequestMethod.GET, value = "/cadastrar")
  public String cadastrar() {
    return "funcionario/cadastro.html";
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "/listar")
  public String listar() {
    return "funcionario/lista.html";
  }
  @RequestMapping(method = RequestMethod.POST, value = "/salvar")
  public String salvar(Funcionario funcionario, RedirectAttributes attr) {
    funcionarioService.salvar(funcionario);
    attr.addFlashAttribute("success", "Funcionario inserido com sucesso");
    return "redirect:/funcionarios/cadastrar";
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "/editar/{id}")
  public String preEditar(@PathVariable("id") Long id, ModelMap model) {
    model.addAttribute("funcionario", funcionarioService.buscarPorId(id));
    return "funcionario/cadastro.html";
  }
  
  @RequestMapping(method = RequestMethod.POST, value="/editar")
  public String editar(Funcionario funcionario, RedirectAttributes attr) {
	  attr.addFlashAttribute("success", "Registro atualizado com sucesso");
	  return "redirect:/funcionarios/cadastrar";
  }
  
  @ModelAttribute("funcionarios")
  public List<Funcionario> listaDeFuncionarios() {
    return funcionarioService.buscarTodos();
  }
}
