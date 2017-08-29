/**
 * A bank special account.
 * Bank special accounts have a unique client, a unique account number, your balance and a limit.
 * The bank special account balance can be increased (cash deposit, until the defined limit) or decreased (cash out).
 * @author Erick de O. Silva
 * @version 2017.08.29
 */


import java.lang.IllegalArgumentException;

public class ContaEspecial extends ContaBancaria
{
	// Limit of negative balance.
	private double limite;

	/**
	 * Especial account constructor.
	 * @param cliente Client account name.
	 * @param num_conta Client account ID.
	 * @param saldo Account initial balance.
	 * @param limite Account balance limit.
	 */
	public ContaEspecial( String cliente, int num_conta, double saldo, double limite )
	{
		super( cliente, num_conta );
		
		depositar( saldo );

		this.limite = limite;
	}

	/**
	 * Cash out the balance of this account.
	 * @param Cash out value.
	 * @return The new account balance value.
	 * @throws IllegalArgumentException if the limit value of this account has been exceeded.
	 */
	@Override
	public double sacar( double saque ) throws IllegalArgumentException
	{
		if ( (getSaldo() - saque) < ((-1) * limite) )
		{
			throw new IllegalArgumentException( "The cash out value exceeded the minimun balance defined value!" );
		} else 
		{
			// cash out.
			setSaldo( getSaldo() - saque );
			return getSaldo() - saque;
		}
	}

	/**
	 * Informs the String representation of this Account.
	 * @return String representation of this Account.
	 */
	@Override
	public String toString()
	{	
		return ">>> Special Account <<<\n" + super.toString() + "Account Limit : " + limite + "\n";
	}
	
}
