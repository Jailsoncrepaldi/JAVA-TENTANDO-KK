import javax.swing.JOptionPane;

public class ExcluirColaborador
{
	public static void ExcCol()
	{ 
      int aux=0, m=0;
	  String nomeaux="",s="";
	  nomeaux=JOptionPane.showInputDialog("Nome Procurado: ");
	  for (int i=0; i<=menu.c;i++)
		{
			s=s+menu.codcolab[i]+"    "+menu.nomecolab[i]+"    "+menu.total[i]+"      "+menu.tipo[i]+"\n";
			if (nomeaux.equals(menu.nomecolab[i]))
			{
				m=i;
				aux=1;
			}
		}
		if (aux==1)
		{
		   s=menu.codcolab[m]+"    "+menu.nomecolab[m]+"    "+menu.total[m]+"      "+menu.tipo[m]+"\n";
		   	 JOptionPane.showMessageDialog(null,s);
		   for (int i=m; i<menu.c; i++)
		   {
		      menu.tipo[i]=menu.tipo[i+1];
		      menu.nomecolab[i]=menu.nomecolab[i+1];
		      menu.codcolab[i]=menu.codcolab[i+1];
		      menu.total[i]=menu.total[i+1];
		   }
		   JOptionPane.showMessageDialog(null,"Dados Excluídos!");	 
	    }   
		if (aux==0)
		{
		  
		  s="Nenhum colaborador Encontrado Com Este Nome!";
		  JOptionPane.showMessageDialog(null,s); 
		}  
	}
}