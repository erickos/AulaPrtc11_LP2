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
		// Instantiates two types of clients.
		PessoaJuridica client1 = new PessoaJuridica( "erick", "rua 1", "0800", "01281-7", "fantasy" );
		PessoaFisica client2 = new PessoaFisica( "test", "rua 2", "1080", "1012-7" );

		// Init a client's database.
		Database banco = new Database();

		// Adding the two clients on database.
		banco.addCliente( client1 );
		banco.addCliente( client2 );

		// Showing the total of clients on database.
		System.out.println( "Quantidade de clientes : " + banco.qtdClientes() );

		// Showing the total of each client type on database.
		banco.qtdClientesPorTipo();

		// Printing all database elements.
		banco.imprimirDatabase();

		// Remove a Legal client of database.
		banco.removeCliente( client1 );

		// Showing the total of clients on database. Now expecting 1 client on database.
		System.out.println( "Quantidade de clientes : " + banco.qtdClientes() );

		// Showing the total of each client type on database. Now expecting 0 legal clients.
		banco.qtdClientesPorTipo();

	}
}