import java.lang.IllegalArgumentException;
/**
 * A bank account.
 * Bank accounts have a unique client, a unique account number and your balance.
 * The bank account balance can be increased (cash deposit) or decreased (cash out).
 */
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
	 * Informs the actual balance.
	 * @return Actual balance.
	 */
	public double getSaldo()
	{
		return saldo;
	}
	
	/**
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
		} else 
		{	
			// cash out.
			return saldo -= saque;
		}
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
		} else 
		{
			// cash deposit.
			return saldo += deposito;
		}		
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

}   
