package atAcesso.portaria.bean.quem;

public class Pessoa {

	private Long id;
	private String primeiroNome;
	private String apelido;
	private String sobrenome;

	private Long idResponsavel;
	private Pessoa responsavel;

	private Long idDependente;
	private Pessoa dependente;

	public Pessoa() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Long getIdResponsavel() {
		return idResponsavel;
	}

	public void setIdResponsavel(Long idResponsavel) {
		this.idResponsavel = idResponsavel;
	}

	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}

	public Long getIdDependente() {
		return idDependente;
	}

	public void setIdDependente(Long idDependente) {
		this.idDependente = idDependente;
		
	}

	public Pessoa getDependente() {
		return dependente;
	}

	public void setDependente(Pessoa dependente) {
		this.dependente = dependente;
	}

}
