import javax.swing.JOptionPane;


public class menu() {

	static int c=-1;
	static int[]  codcli=new int[200];
	static String nome[]=new String[200];
	static String fone[]=new String[200];

		public static void main(String[] args) {
		String op="";
		while (!op.equals("S"))
		{
				op = (JOptionPane.showInputDialog
			("C - Cadastro de Clientes\nL-Lista de Clientes\nA - Altera os dados\nS - Sair\n\n")).toUpperCase();
			
			if (op.equals("C"))	
			{
				CadastroClientes.cadcli();
			}
			
			if (op.equals("L"))
			{
				ListaClientes.listacli();
			}
				
			if ((op.equals("A")))
			{
				AlteraDados.alteracli();
			}
					
		}
		System.exit(0);
	}
	
}

