package jorge.autentia.catalogo.test;


import java.io.File;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jorge.autentia.catalogo.model.Curso;
import jorge.autentia.catalogo.service.CursoService;
import junit.framework.TestCase;


public class CatalogoTests extends TestCase {

	@Test
	public void testFindCursos() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("springConfig.xml");
		CursoService service = (CursoService) cxt.getBean("cursoService");
		List<Curso> cursos = service.findAllCursos();
		assertNotNull(cursos);
		assertTrue(cursos.size() > 0);
	}
	
	@Test
	public void testInsertCurso() {
		Curso curso = new Curso();
		curso.setActivo(true);
		curso.setHoras(12);
		curso.setNivel("Avanzado");
		curso.setTemario("/var/temario");
		curso.setProfesor("Paco Perez");
		curso.setTitulo("Test");
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("springConfig.xml");
		CursoService service = (CursoService) cxt.getBean("cursoService");
		service.insertCurso(curso);
	}
}
