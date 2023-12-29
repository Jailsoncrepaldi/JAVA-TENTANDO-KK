
import javax.swing.JOptionPane;

public class ExcluirPecas
{
	public static void ExcPec()
	{ 
       int aux=0, m=0;
	  String nomeaux="",s="";
	  nomeaux=JOptionPane.showInputDialog("Nome procurado: ");
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
		   	 JOptionPane.showMessageDialog(null,s);
		   for (int i=m; i<menu.p; i++)
		   {
		      menu.preco[i]=menu.preco[i+1];
		      menu.nomepeca[i]=menu.nomepeca[i+1];
		      menu.codpeca[i]=menu.codpeca[i+1];
		   }
		   JOptionPane.showMessageDialog(null,"Dados Excluídos com sucesso");	 
	    }   
		if (aux==0)
		{
		  
		  s="Nenhuma Peça Encontrada Com Este Nome!";
		  JOptionPane.showMessageDialog(null,s); 
		}  
	}
}
