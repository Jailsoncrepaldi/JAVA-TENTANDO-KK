import javax.swing.JOptionPane;

public class AlterarPeca
{
	public static void AltPec()
	{
	  int aux=0, m=0, aux1=0;
	  String nomeaux="",s="", n="";
	  nomeaux=JOptionPane.showInputDialog("Nome Procurado: ");
	  for (int i=0; i<=menu.p;i++)
		{
			s=s+menu.codpeca[i]+"    "+menu.nomepeca[i]+"    "+menu.preco[i]+"\n";
			if (nomeaux.equals(menu.nomepeca[i]))
			{
				m=i;
				aux=1;
			}
		}
		if (aux==1)
		{
		   s=menu.codpeca[m]+"    "+menu.nomepeca[m]+"    "+menu.preco[m]+"\n";
		   	 JOptionPane.showMessageDialog(null,"Codigo da pe�a - Nome da pe�a -  Pre�o  \n"+s);
		   n=JOptionPane.showInputDialog("Deseja Alterar O Nome da Pe�a?(S/N").toUpperCase();
		    if (n.equals("S"))
		   {   
		     nomeaux=JOptionPane.showInputDialog("Novo Nome: ");
		     for(int i=0;i<=menu.p;i++)
			 if(nomeaux.equals(menu.nomepeca[i]))
			   aux1=1;
			 if (aux1==1)
				JOptionPane.showMessageDialog(null,"Nome J� Existente!");
			  else
			menu.nomepeca[m]=nomeaux;
			}
			if (aux1==0)
			{ 
		      n=JOptionPane.showInputDialog("Deseja Alterar o Pre�o da Pe�a ? (S/N)").toUpperCase();
		      if (n.equals("S"))
		         menu.preco[m]=Double.parseDouble(JOptionPane.showInputDialog("Novo Pre�o: "));
		      JOptionPane.showMessageDialog(null,"Dados Alterados!");	
		    } 
		}   
		   if (aux==0)
		   {
		  
		   s="Nenhuma Pe�a Encontrada Com Este Nome!";
		   }  
	}
}