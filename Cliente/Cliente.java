
/**
 * A client.
 * The client hava name, address and phone number.
 *
 * @author Erick de O. Silva
 * @version 2017.08.29
 */
public class Cliente
{
	// A client name.
	private String nome;

	// A client address.
	private String endereco;

	// A client phone number.
	private String telefone;

	/**
	 * Constructor for a client.
	 * @param nome Client's name.
	 * @param endereco Client's address.
	 * @param telefone Client's phone number.
	 */
	public Cliente( String nome, String endereco, String telefone )
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	/**
	 * Returns the client name.
	 * @return Client's name.
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * Returns the client's address.
	 * @return Client's address.
	 */
	public String getEndereco()
	{
		return endereco;
	}

	/**
	 * Returns the client's phone number.
	 * @return Client's phone number.
	 */
	public String getTelefone()
	{
		return telefone;
	}

	/**
	 *
	 */
	public void setNome( String nome )
	{
		this.nome = nome;
	}

	/**
	 *
	 */
	public void setEndereco( String endereço )
	{
		this.endereco = endereco;
	}

	/**
	 *
	 */
	public void setTelefone( String telefone )
	{
		this.telefone = telefone;
	}

}