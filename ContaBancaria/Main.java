public class Main
{
	public static void main( String[] args )
	{

		Banco bank = new Banco();

		ContaEspecial conta = new ContaEspecial( "erick", 1, 50.0, 10.0 );
		ContaPoupanca conta2 = new ContaPoupanca( "erick", 2, 25.00, 19 );

		bank.addConta( conta );

		bank.addConta( conta2 );

		bank.showAll();

		bank.removeConta( conta );

		bank.showAll();
	}
}

