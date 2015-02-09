package jorge.autentia.catalogo.service;

import java.util.List;

import javax.faces.bean.ViewScoped;

import jorge.autentia.catalogo.mappers.CursoMapper;
import jorge.autentia.catalogo.model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cursoService")
@ViewScoped
public class CursoServiceImp implements CursoService{
	
	@Autowired
	private CursoMapper cursoMapper;
	
	@Transactional
	public void insertCurso(Curso curso) {
		cursoMapper.insertCurso(curso);
	}

	public List<Curso> findAllCursosOffset(int start, int offset) {
		return cursoMapper.findAllCursosOffset(start, offset);
	}

	public int countCursos() {
		return cursoMapper.countCursos();
	}

	public Curso findOneCurso(long id) {
		return cursoMapper.findOneCurso(id);
	}

	public List<Curso> findAllCursos() {
		return cursoMapper.findAllCursos();
	}
}
