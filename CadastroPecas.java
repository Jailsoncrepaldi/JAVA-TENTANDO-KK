
import javax.swing.JOptionPane;

public class CadastroPecas
{
	public static void CadPec()
	{
	  int aux=0;
	  String nomeaux="";
	  if(menu.p<200)
		{
			menu.p++;
			menu.codpeca[menu.p]=menu.p+1;
			nomeaux=JOptionPane.showInputDialog("C�digo: "+menu.codpeca[menu.p]+"\nNome: ");	
			for(int i=0;i<=menu.p;i++)
			   if(nomeaux.equals(menu.nomepeca[i]))
			   aux=1;
			if (aux==1)
			{
				menu.p--;
				JOptionPane.showMessageDialog(null,"Nome J� Existe!");
			}
			else
			{
				menu.nomepeca[menu.p]=nomeaux;
				menu.preco[menu.p]=Double.parseDouble(JOptionPane.showInputDialog("Pre�o Unit�rio: "));
			}
			}
		else
		    JOptionPane.showMessageDialog(null,"N�mero M�ximo de Pe�as Atingido.");
	}
}
