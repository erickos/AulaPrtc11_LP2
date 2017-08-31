/**
 * A database of clients.
 * 
 * @author Erick de O. Silva
 * @version 2017.08.30
 */

import java.util.ArrayList;

public class Database
{
	// Client's list.
	private ArrayList< Cliente > clientes;

	/**
	 * Constructs the database and init the client list.
	 */
	public Database()
	{
		clientes = new ArrayList< Cliente >();
	}

	/**
	 * Adds a client on database.
	 *
	 * @param cliente The client's.
	 */
	public void addCliente( Cliente cliente )
	{
		clientes.add( cliente );
	}

	/**
	 * Remove a client on database.
	 *
	 * @param cliente The client's.
	 */
	public void removeCliente( Cliente cliente )
	{
		clientes.remove( cliente );
	}

	/**
	 * Informs the quantity of registered clients.
	 *
	 * @return Quantity of clients.
	 */
	public int qtdClientes()
	{
		return clientes.size();
	}

	/**
	 * Informs the quantity of each client type registered on database.
	 */
	public void qtdClientesPorTipo()
	{
		int fisicos = 0;
		int juridicos = 0;

		for( Cliente current : clientes )
		{
			if ( current instanceof PessoaFisica )
			{
				fisicos++;
			} else if ( current instanceof PessoaJuridica )
			{
				juridicos++;
			}
		}

		System.out.println( "On Database have " + fisicos + " physical clients. And have " + juridicos + " legal clients " );
	}	


	/**
	 * Prints each client on database.
	 */
	public void imprimirDatabase()
	{
		for( Cliente current : clientes )
		{
			System.out.println( current );
		}
	}

}