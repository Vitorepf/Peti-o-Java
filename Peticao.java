
public class Peticao {
	private String EnderecoR;
	private String Procurador;
	private String Nacionalidade;
	private String EstadoCivil;
	private String Cpf;
	private long Rg;
	private String Endereco;
	private Long cep;
	/**
	 * @return the enderecoR
	 */
	public String getEnderecoR() {
		return EnderecoR;
	}
	/**
	 * @return the procurador
	 */
	public String getProcurador() {
		return Procurador;
	}
	/**
	 * @return the nacionalidade
	 */
	public String getNacionalidade() {
		return Nacionalidade;
	}
	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return EstadoCivil;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return Cpf;
	}
	/**
	 * @return the rg
	 */
	public long getRg() {
		return Rg;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return Endereco;
	}
	/**
	 * @return the cep
	 */
	public long getCep() {
		return cep;
	}
	
	
	
	/**
	 * @param enderecoR the enderecoR to set
	 */
	
	
	
	public void setEnderecoR(String enderecoR) {
		EnderecoR = enderecoR;
	}
	/**
	 * @param procurador the procurador to set
	 */
	public void setProcurador(String procurador) {
		Procurador = procurador;
	}
	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}
	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	/**
	 * @param cpf the cpf to set
	 */
	
	public void setCpf(String cpf) {
		Cpf=(cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
		//Cpf = cpf;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(long rg) {
		Rg = rg;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(long cep) {
		this.cep = cep;
	}
}
