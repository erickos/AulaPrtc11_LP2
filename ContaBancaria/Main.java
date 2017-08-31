/**
 * Class for tests.
 * 
 * @author Erick de O. Silva
 * @version 2017.08.30
 */
public class Main
{
	public static void main( String[] args )
	{

		// Init a bank database.
		Banco bank = new Banco();

		// Instantiates two types of accounts.
		ContaEspecial conta = new ContaEspecial( "erick", 1, 50.0, 10.0 );
		ContaPoupanca conta2 = new ContaPoupanca( "erick", 2, 25.00, 19 );

		// Adding the accounts on database.
		bank.addConta( conta );
		bank.addConta( conta2 );

		// Show the acocunts details
		bank.showAll();

		// Show the quantity of accounts on database. Expected : 2.
		System.out.println( "Actually have " + bank.qtdContas() + " accounts on bank database." );

		// Test for remove account.
		bank.removeConta( conta );

		// Show the quantity of accounts on database. Expected : 1.
		System.out.println( "Actually have " + bank.qtdContas() + " accounts on bank database." );

		// New test of account details expecting a new print without the removed account.
		bank.showAll();
	}
}

