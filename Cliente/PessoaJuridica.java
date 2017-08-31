
/**
 * A legal client.
 * The legal client have name, address, phone number, cnpj, company's name.
 *
 * @author Erick de O. Silva
 * @version 2017.08.29
 */
public class PessoaJuridica extends Cliente
{
	// A legal client cnpj.
	private String cnpj;

	// A legal client company name.
	private String nomeFantasia;

	/**
	 * Constructor for a legal client.
	 * 
	 * @param nome Legal Client's name.
	 * @param endereco Legal Client's address.
	 * @param telefone Legal Client's phone number.
	 * @param cnpj Legal Client's cnpj number.
	 * @param nomeFantasia Legal Client company's name.
	 */
	public PessoaJuridica( String nome, String endereco, String telefone, String cnpj, String nomeFantasia )
	{
		super( nome, endereco, telefone );

		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}


	/**
	 * Return a legal client cnpj number.
	 * 
	 * @return Legal client's cnpj number.
	 */
	public String getCnpj()
	{
		return cnpj;
	}

	/**
	 * Return a legal client company name.
	 *
	 * @return Legal client's company name.
	 */
	public String getNomeFantasia()
	{
		return nomeFantasia;
	}

	/**
	 * Return a legal client company name.
	 * 
	 * @return Legal client's company number.
	 */
	public void setNomeFantasia( String nomeFantasia )
	{
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * Convert a legal client object to a String representation.
	 * 
	 * @return The String representation of this legal client.
	 */
	@Override
	public String toString()
	{
		return "\n>>> Legal Client <<<\n" + super.toString() + "\nCNPJ : " + cnpj + "\nCompany's name : " + nomeFantasia + "\n";
	}


	/**
	 * Prints all the legal client data.
	 */
	public void imprimirDados()
	{
		System.out.println( toString() );
	}



}