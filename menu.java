import javax.swing.JOptionPane;

public class menu
{
  
 //peças
 static int p=-1;
 static int codpeca[]=new int[200];
 static String nomepeca[]=new String[200];
 static double preco[]=new double[200];
 
 //colaboradores
 static int c=-1;
 static int codcolab[]=new int[200];
 static String nomecolab[]=new String[200];
 static double total[]=new double[200];
 static int tipo[]=new int [200];
 static double salb[]=new double [200];
 static double desconto[]=new double [200];
 static double saliq[]=new double [200];
 static double bruto[]=new double[200];
 
 //empresa
 static double lucro=0;
 static double salfun=0;
 static int codgasto[]=new int [200];
 static int g=-1;
 static double tkw;
 static double tg;
 static double lucrobt;
 static double icms;
 static double salarios;
 static double ll;

 
 public static void main(String[] args)
{
	String op="";
	while (!op.equals("S"))
	{
		op=(JOptionPane.showInputDialog("A- Cadastro das Peças\nB- Cadastro de Colaboradores\nC- Listagem de Colaboradores\nD- Alterar Peça\nE- Alterar Colaborador\nF- Excluír Peça\nG- Excluír Colaborador\nH- Custos Operacionais\nI - Listar peças \nS  -Sair\n\n").toUpperCase());
		if(op.equals("A")) CadastroPecas.CadPec();
		if(op.equals("B")) CadastroColaborador.CadCol();
		if(op.equals("C")) ListaColaborador.ListCol();
		if(op.equals("D")) AlterarPeca.AltPec();
		if(op.equals("E")) AlterarColaborador.AltCol();
		if(op.equals("F")) ExcluirPecas.ExcPec();
		if(op.equals("G")) ExcluirColaborador.ExcCol();
		if(op.equals("H")) CustosOperacionais.CustOp();
		if(op.equals("I")) ListaPeca.Listap();
		if(op.equals("S")) System.exit(0);
	
	}
}
	
 
}	