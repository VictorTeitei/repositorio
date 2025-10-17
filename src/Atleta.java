
public class Atleta extends Pessoa{
	String modalidade;
	
	public Atleta(int idPar, String nomePar, int idadePar, String modalidadePar){
		super(idPar, nomePar, idadePar);
		this.modalidade = modalidadePar;
	}
	
	public String getModalidade(){
		return modalidade;
	}
	
	public void setModalidade(String modalidadePar){
		this.modalidade = modalidade;
	}
}
