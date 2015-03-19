package atAcesso.portaria.bean.oque;

/*
 * @author Tiago Ferezin
 */
import java.util.Calendar;

import atAcesso.portaria.bean.quem.Emissor;

public class Documento {

	private Long id;
	private String numeroDocumento;

	private Long idEmissor;
	private Emissor emissor;

	private Calendar dataEmissao;
	private Calendar dataDesativacao;

	public Documento() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Long getIdEmissor() {
		return idEmissor;
	}

	public void setIdEmissor(Long idEmissor) {
		this.idEmissor = idEmissor;
	}

	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Calendar getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Calendar dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

}
