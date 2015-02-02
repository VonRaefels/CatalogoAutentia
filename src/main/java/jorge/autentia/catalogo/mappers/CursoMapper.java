package jorge.autentia.catalogo.mappers;

import java.util.List;

import jorge.autentia.catalogo.model.Curso;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;


public interface CursoMapper {
	@Insert("INSERT INTO curso(activo, profesor, titulo, nivel, horas, temario) VALUES"
			+ "(#{activo}, #{profesor}, #{titulo}, #{nivel}, #{horas}, #{temario})")
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	public void insertCurso(Curso curso);
	
	@Select("SELECT * FROM curso")
	public List<Curso> findAllCursos();
}
