import javax.swing.JOptionPane;


public class CadastroClientes {
	
	public static void cadcli(){
		
		int aux=0;
		String nomeaux="";
		if (menu.c<200)
		{
				menu.c++;
				menu.codcli[menu.c] = menu.c+1;
				
				nomeaux = JOptionPane.showInputDialog
			("C�digo: "+menu.codcli[menu.c]+"\nNome: ");
				
				for (int i=0;i<menu.c;i++)
					
					if (nomeaux.equals(menu.nome[i]))
							aux = 1;
					if (aux==1)
					{
						menu.c--;
						JOptionPane.showMessageDialog(null, "J� Cadastrado!!");
					}
					else
					{
						menu.nome[menu.c] = nomeaux;
						menu.fone[menu.c] = JOptionPane.showInputDialog("Fone: ");
					}							
					
		}
		else					
			JOptionPane.showMessageDialog(null, "Vetor Cheio!");			
	}
	
}
