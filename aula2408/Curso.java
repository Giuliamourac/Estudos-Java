package aula2408;

public class Curso 
{
	private String sigla;
	private String nome;
	private Periodo periodo;
	
	public Curso(String sigla, String nome, Periodo periodo)
	{
		this.sigla = sigla;
		this.nome = nome;
		this.periodo = periodo;
	}
	
	public void setSigla(String sigla)
	{
		this.sigla = sigla;
	}
	
	public String getSigla()
	{
		return  this.sigla;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return  this.nome;
	}
	
	public void setPeriodo(Periodo periodo)
	{
		this.periodo = periodo;
	}
	
	public Periodo getPeriodo()
	{
		return  this.periodo;
	}
	
	public void exibirInfo() 
	{
	    System.out.println("Sigla: " + this.sigla + 
	                       " | Nome: " + this.nome + 
	                       " | Período: " + this.periodo);
	}
}
