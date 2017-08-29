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
		if ( (saldo - saque) < ((-1) * limite) )
		{
			throw new IllegalArgumentException( "The cash out value exceeded the minimun balance defined value!" );
		} else 
		{
			// cash out.
			return saldo - saque;
		}
	}
	
}
