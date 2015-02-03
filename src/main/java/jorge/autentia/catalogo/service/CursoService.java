package jorge.autentia.catalogo.service;

import java.util.List;

import jorge.autentia.catalogo.model.Curso;

public interface CursoService {
	public void insertCurso(Curso curso);
	public List<Curso> findAllCursosOffset(int start, int offset);
	public List<Curso> findAllCursos();
	public int countCursos();
	public Curso findOneCurso(long id);
}
