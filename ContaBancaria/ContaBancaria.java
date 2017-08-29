/**
 * A bank account.
 * Bank accounts have a unique client, a unique account number and your balance.
 * The bank account balance can be increased (cash deposit) or decreased (cash out).
 * @author Erick de O. Silva
 * @version 2017.08.29
 */


import java.lang.IllegalArgumentException;
public class ContaBancaria
{	
	// A unique client for this account.
	private String cliente;

	// A unique ID number for this account.
	private int num_conta;

	// The balance of this account.
	private double saldo;

	/**
	 * Account constructor.
	 * @param cliente A client name of the account.
	 * @param num_conta A account id.
	 */
	public ContaBancaria( String cliente, int num_conta )
	{
		this.cliente = cliente;
		this.num_conta = num_conta;
		saldo = 0.0;
	}

	/**
	 * Informs the name
	 * @return Client's name.
	 */
	public String getCliente()
	{
		return cliente;
	}

	/**
	 * Informs the account number.
	 * @return account number.
	 */
	public int getNumConta()
	{
		return num_conta;
	}

	/**
	 * Informs the actual balance.
	 * @return Actual balance.
	 */
	public double getSaldo()
	{
		return saldo;
	}


	
	/**
	 * Gerency the balance.
	 * @param New balance.
	 */
	public void setSaldo( double novo_saldo )
	{
		saldo = novo_saldo;
	}


	/*
	 * Cash out.
	 * @param saque Value to be decreased of this account.
	 * @throws IllegalArgumentException if the 'saque' value is negative or bigger than balance of this account.
	 * @return The new account balance.
	 */
	public double sacar( double saque ) throws IllegalArgumentException
	{
		if ( saque <= 0.0 || saque > saldo )
		{
			throw new IllegalArgumentException( "Enter with a valid value to cash out! ( 0.0 < value <= account_balance )" );
		}

		// cash out.
		saldo -= saque;
		return saldo;
	}

	
	/**
	 * Cash deposit.
	 * @param deposito Value to be increased in this account.
	 * @throws IllegalArgumentException if the 'deposito' value is negative.
	 * @return The new account balance.
	 */
	public double depositar( double deposito )
	{
		if ( deposito <= 0.0 )
		{
			throw new IllegalArgumentException( "Enter with a valid deposit value! ( value > 0.0 )" );
		}
		
		// cash deposit.
		saldo += deposito;
		return saldo;	
	}

	/**
	 * Convert a account object to a String representation.
	 * @return The String representation of this account.
	 */
	@Override
	public String toString()
	{
		return "Client name : " + cliente + "\nAccount ID : " + num_conta + "\nActual account Balance : " + saldo + "\n";
	}

	/**
	 * Compare one account with another.
	 * @return True if his client name and account number are equals, False in otherwise.
	 */
	public boolean equals( ContaBancaria conta ) 
	{
    	if ( this.cliente == conta.getCliente() 
    		&& this.num_conta == conta.getNumConta()  )
    	{
        	return true;
    	}
    	return false;
	}

}   
