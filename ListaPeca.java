import javax.swing.JOptionPane;

public class ListaPeca
{
	public static void Listap()
	{
		int aux=0, m=0;
		String nomeaux="",s="";
		nomeaux=JOptionPane.showInputDialog("Nome da peça a ser  procurado: ");
		for (int i=0; i<=menu.p;i++)
		{
			s=s+menu.codpeca[i]+"                  "+menu.nomepeca[i]+"    "+menu.preco[i]+"\n";
			if (nomeaux.equals(menu.nomepeca[i]))
			{
				m=i;
				aux=1;
			}
		}
		if (aux==1)
		   s=menu.codpeca[m]+"    "+menu.nomepeca[m]+"    "+menu.preco[m]+"\n";
	    if ((aux==0)&&(!nomeaux.equals("")))
		s="Nenhuma Peça  encontrada com este nome";
		JOptionPane.showMessageDialog(null,"-Codigo -Nome- Preço \n"+s);   
	}
}	

