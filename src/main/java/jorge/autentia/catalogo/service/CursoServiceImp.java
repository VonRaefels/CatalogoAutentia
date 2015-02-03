package jorge.autentia.catalogo.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jorge.autentia.catalogo.mappers.CursoMapper;
import jorge.autentia.catalogo.model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cursoService")
@ManagedBean(name="cursoService")
@ViewScoped
public class CursoServiceImp implements CursoService{
	
	@Autowired
	private CursoMapper cursoMapper;
	
	@Transactional
	public void insertCurso(Curso curso) {
		cursoMapper.insertCurso(curso);
	}

	public List<Curso> findAllCursos(int start, int offset) {
		return cursoMapper.findAllCursos(start, offset);
	}

	public int countCursos() {
		return cursoMapper.countCursos();
	}
}
