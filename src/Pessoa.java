
public class Pessoa {

	private int idAt;
	private String nomeAt;
	private int idadeAt;
	
	public Pessoa(){
		
	}
	
	public Pessoa(int idPar, String nomePar, int idadePar){
		this.idAt = idPar;
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
	}
	
	public int getId(){
		return idAt;
	}
	
	public String getNome(){
		return nomeAt;
	}
	
	public int getIdade(){
		return idadeAt;
	}
	
	public void setId(int id){
		this.idAt = id;
		
	}
	
	public void setNome(String nome){
		this.nomeAt = nome;
	}
	
	public void setIdade(int idade){
		this.idadeAt = idade;
	}
}
