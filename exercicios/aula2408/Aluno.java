package aula2408;

public class Aluno 
{
	private String ra;
	private String nome;
	private Curso curso;
	
	public Aluno(String ra, String nome, Curso curso)
	{
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}
	
	public void setRa(String ra)
	{
		this.ra = ra;
	}
	
	public String getRa()
	{
		return  this.ra;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return  this.nome;
	}
	
	public void setCurso(Curso curso)
	{
		this.curso = curso;
	}
	
	public Curso getCurso()
	{
		return  this.curso;
	}
	
	public void exibirInfo() 
	{
	    System.out.println("RA: " + this.ra + 
	                       " | Nome: " + this.nome + 
	                       " | Curso: " + this.curso.getNome() + 
	                       " - " + this.curso.getPeriodo());
	}
}

