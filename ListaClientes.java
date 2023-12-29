import javax.swing.JOptionPane;


public class ListaClientes {
	
	public static void listacli(){
		
		int aux=0,p=0;
		String nomeaux="",s="";
		
		nomeaux = JOptionPane.showInputDialog("Nome Procurado: ");
		
		for (int i=0;i<=menu.c;i++)
		{
			s = s + "     "+menu.codcli[i]+"        "+menu.nome[i]+"     "+menu.fone[i]+"\n";
				if (nomeaux.equals(menu.nome[i]))
				{
					p=i;
					aux=1;
				}
		}		
		if (aux == 1)
		{
			s = "     "+menu.codcli[p]+"        "+menu.nome[p]+"     "+menu.fone[p];
		}
		
		if ((aux==0)&&(!nomeaux.equals("")))
			s = "Nenhum Cliente com este nome";
		JOptionPane.showMessageDialog(null, "Código  Nome      Fone\n"+s);
	}
}
