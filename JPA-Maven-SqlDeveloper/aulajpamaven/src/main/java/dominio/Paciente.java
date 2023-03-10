package dominio;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id 
	private int rg;
	private String nome;
	private String endereco;
	private String telefone;
	@Column (name = "DATA_NASC")
	private String dtNascimento;
	private String profissao;
	private String email;

	public Paciente() {

	}

	public Paciente( int rg, String nome, String endereco, String telefone, String dtNascimento, String profissao,
			String email) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.profissao = profissao;
		this.email = email;

	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", rg=" + rg + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dtNascimento=" + dtNascimento + ", profissao=" + profissao + ", email=" + email + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
