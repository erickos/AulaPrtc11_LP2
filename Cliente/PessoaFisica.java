
/**
 * A physical client.
 * The physical client have name, address and phone number.
 * In specific he had a cpf number.
 *
 * @author Erick de O. Silva
 * @version 2017.08.30
 */

public class PessoaFisica extends Cliente
{
	// A client's cpf.
	private String cpf;

	/**
	 * Physical client constructor.
	 * @param nome Physical client's name.
	 * @param endereco Physical client's address.
	 * @param telefone Physical client's phone number.
	 * @param cpf Physical client's cpf.
	 */
	public PessoaFisica( String nome, String endereco, String telefone, String cpf )
	{
		super( nome, endereco, telefone );

		this.cpf = cpf;
	}

	/**
	 * Returns the client's phone number.
	 * @return Client's cpf.
	 */
	public String getCpf()
	{
		return cpf;
	}

	/**
	 * Set the client's name.
	 * @param cpf Client's cpf.
	 */
	public void setCpf( String cpf )
	{
		this.cpf = cpf;
	}


	/**
	 * Convert a physical client object to a String representation.
	 * @return The String representation of this physical client.
	 */
	@Override
	public String toString()
	{
		return "\n>>> Physical Client <<<\n" + super.toString() + "\nCPF : " + cpf + "\n";
	}


	public void imprimirDados()
	{
		System.out.println( toString() );
	}

}