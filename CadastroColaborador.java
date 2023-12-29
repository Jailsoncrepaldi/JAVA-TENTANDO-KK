import javax.swing.JOptionPane;

public class CadastroColaborador
{
	public static void CadCol()
	{
	  int aux=0, pecaux=0, aux2=0;
	  double valor=0, total=0;
	  String nomeaux="";
	  if(menu.c<200)
		{
			menu.c++;
			menu.codcolab[menu.c]=menu.c+1;
			nomeaux=JOptionPane.showInputDialog("Código: "+menu.codcolab[menu.c]+"\nNome: ");	
			for(int i=0;i<=menu.c;i++)
			   if(nomeaux.equals(menu.nomecolab[i]))
			   aux=1;
			if (aux==1)
			{
				menu.c--;
				JOptionPane.showMessageDialog(null,"Nome Já Existente");
			}
			else
			{
				menu.nomecolab[menu.c]=nomeaux;
				menu.total[menu.c]=Double.parseDouble(JOptionPane.showInputDialog("Total de Peças Produzidas: "));
				while(aux2==0)
				{
				 pecaux=Integer.parseInt(JOptionPane.showInputDialog("Código da Peça: "));
				 for (int i=0; i<=menu.p; i++)
				   if (pecaux==menu.codpeca[i])
				      aux2=1;
				   if(aux2==0)
				      JOptionPane.showMessageDialog(null,"Código da Peça Inexistente!");
				   else
				   {
				   	 menu.tipo[menu.c]=pecaux;
				   	 for(int i=0; i<=menu.p;i++)
				   	  if(menu.tipo[menu.c]==menu.codpeca[i])
				   	     valor=menu.preco[i];
				     total=valor*menu.total[menu.c];
				     menu.bruto[menu.c]=total;
				     if(menu.total[menu.c]<2000)
				       menu.salb[menu.c]=(((total*15)/100)+350);
				     if(menu.total[menu.c]>=2000)
				       menu.salb[menu.c]=(((total*19)/100)+350);
				     menu.salfun=menu.salfun+menu.salb[menu.c];
				     if(menu.salb[menu.c]<=300)
				     {   
				        menu.desconto[menu.c]=((menu.salb[menu.c]*5)/100);
				        menu.saliq[menu.c]=menu.salb[menu.c]-menu.desconto[menu.c];
				     }
				     if((menu.salb[menu.c]>300)&&(menu.salb[menu.c]<=500))
				     {   
				        menu.desconto[menu.c]=((menu.salb[menu.c]*7)/100);
				        menu.saliq[menu.c]=menu.salb[menu.c]-menu.desconto[menu.c];
				     }
				     if((menu.salb[menu.c]>500)&&(menu.salb[menu.c]<=750))
				     {   
				        menu.desconto[menu.c]=((menu.salb[menu.c]*8.5)/100);
				        menu.saliq[menu.c]=menu.salb[menu.c]-menu.desconto[menu.c];
				     }
				      if((menu.salb[menu.c]>750)&&(menu.salb[menu.c]<=1200))
				     {   
				        menu.desconto[menu.c]=((menu.salb[menu.c]*11)/100);
				        menu.saliq[menu.c]=menu.salb[menu.c]-menu.desconto[menu.c];
				     }
				     if(menu.salb[menu.c]>1200)
				     {   
				        menu.desconto[menu.c]=((menu.salb[menu.c]*13.5)/100);
				        menu.saliq[menu.c]=menu.salb[menu.c]-menu.desconto[menu.c];
				     }
				   }
				} 	 
			  } 
			  JOptionPane.showMessageDialog(null,"Dados Cadastrados!");     
			}
		else
		    JOptionPane.showMessageDialog(null,"Número Máximo de Colaboradores Atingido.");
	}
}
