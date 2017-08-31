/**
 * A bank.
 * The bank guards all types of accounts.
 * @author Erick de O. Silva
 * @version 2017.08.29
 */

import java.util.ArrayList;

public class Banco
{

	// Accounts ArrayList.
	private ArrayList< ContaBancaria > contas;

	/**
	 * A bank constructor. Init the bank accounts array.
	 */
	public Banco()
	{
		contas = new ArrayList< ContaBancaria >();
	}

	/**
	 * Add a account to the bank database.
	 * @param conta Account to be added on database.
	 */
	public void addConta( ContaBancaria conta )
	{
		contas.add( conta );
	}

	/**
	 * Remove a account to the bank database.
	 * @param conta Account to be removed on database.
	 */
	public void removeConta( ContaBancaria conta )
	{
		contas.remove( conta );
	}

	/**
	 * Informs the quantity of accounts.
	 *
	 * @return Quantity of accounts.
 	 */
	public int qtdContas()
	{
		return contas.size();
	}

	/**
	 * Prints all saved accounts on database.
	 */
	public void showAll()
	{
		for ( ContaBancaria current : contas )
		{
			System.out.println( current );
		}
	}



}