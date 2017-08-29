/**
 * A savings.
 * The savings has a income day.
 * And calculates the new balance in this day.
 * @author Erick de O. Silva
 * @version 2017.08.29
 */
public class ContaPoupanca extends ContaBancaria
{
	// Account saving's day.
	private int dia_de_rendimento;
	
	/**
	 * A Saving's account constructor.
	 * @param cliente Client name owner of this account.
	 * @param num_conta Account id number.
	 * @param saldo Initial balance.
	 * @param dia_de_rendimento Day when the balance is recalculated.
	 */
	public ContaPoupanca( String cliente, int num_conta, double saldo, int dia_de_rendimento )
	{
		super( cliente, num_conta );
		
		depositar( saldo );
		
		this.dia_de_rendimento = dia_de_rendimento;
	}
	
	/**
	 * Calculates the variation of this balance.
	 * @param taxa Tax of income.
	 * @return Value of the new Account Balance.
	 */
	public double calcularNovoSaldo( double taxa )
	{
		// Access the actual balance.
		double saldo = getSaldo();
		saldo += saldo * taxa;
		
		return saldo;
	}

	/**
	 * Informs the String representation of this Account.
	 * @return String representation of this Account.
	 */
	@Override
	public String toString()
	{	
		return super.toString() + "Day of income : " + dia_de_rendimento + "\n";
	}
}
