package jorge.autentia.catalogo.controller;

import java.util.List;

import jorge.autentia.catalogo.model.Curso;
import jorge.autentia.catalogo.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("curso")
public class CursoController {

	@Autowired
	private CursoService studentService;
	
	@RequestMapping(value="/cursos", method=RequestMethod.GET)
	public List<Curso> cursos() {
		return studentService.findAllCursos();
	}
}
