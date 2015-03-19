package atAcesso.portaria.bean.quem;

import java.util.Calendar;

import atAcesso.portaria.enumerator.ETipoDocumento;

public class Emissor {

	private Long id;

	private String sigla;
	private String nome;

	private ETipoDocumento tipoDocumento;

	private Calendar dataDesativacao;

	public Emissor() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ETipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(ETipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Calendar getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Calendar dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

}
