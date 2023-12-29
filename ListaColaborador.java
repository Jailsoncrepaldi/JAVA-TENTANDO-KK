import javax.swing.JOptionPane;

public class ListaColaborador
{
	public static void ListCol()
	{
		int aux=0, m=0;
		String nomeaux="",s="";
		nomeaux=JOptionPane.showInputDialog("Nome procurado: ");
		for (int i=0; i<=menu.c;i++)
		{
			s=s+menu.codcolab[i]+"                  "+menu.nomecolab[i]+"    "+menu.salb[i]+"     "+menu.desconto[i]+"        "+menu.saliq[i]+"\n";
			if (nomeaux.equals(menu.nomecolab[i]))
			{
				m=i;
				aux=1;
			}
		}
		if (aux==1)
		   s=menu.codcolab[m]+"    "+menu.nomecolab[m]+"    "+menu.salb[m]+"     "+menu.desconto[m]+"        "+menu.saliq[m]+"\n";
	    if ((aux==0)&&(!nomeaux.equals("")))
		s="Nenhum colaborador encontrado com este nome";
		JOptionPane.showMessageDialog(null,"-Codigo -Nome- Salário bruto - Desconto - Salário liquido      \n"+s);   
	}
}