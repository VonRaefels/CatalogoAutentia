package jorge.autentia.catalogo.service;

import java.util.List;

import jorge.autentia.catalogo.model.Curso;

public interface CursoService {
	public void insertCurso(Curso curso);
	public List<Curso> findAllCursos(int start, int offset);
}
