import javax.swing.JOptionPane;

public class AlterarColaborador
{
	public static void AltCol()
	{
	  int aux=0, m=0, aux1=0, aux2=0, pecaux=0, qpaux=0;
	  String nomeaux="",s="", n="";
	  double valor=0, total=0;
	  nomeaux=JOptionPane.showInputDialog("Nome Procurado: ");
	  for (int i=0; i<=menu.p;i++)
		{
			s=s+menu.codcolab[i]+"    "+menu.nomecolab[i]+"    "+menu.salb[i]+"      "+menu.desconto[i]+"      "+menu.saliq[i]+"\n";
			if (nomeaux.equals(menu.nomecolab[i]))
			{
				m=i;
				aux=1;
			}
		}
		if (aux==1)
		{
		   s=menu.codcolab[m]+"    "+menu.nomecolab[m]+"    "+menu.salb[m]+"      "+menu.desconto[m]+"      "+menu.saliq[m]+"\n";
		   	 JOptionPane.showMessageDialog(null," Código - Nome do Colaborador -  Salário Bruto - Desconto - Salário liquido   \n"+s);
		   n=JOptionPane.showInputDialog("Deseja Alterar o Nome do Colaborador?(S/N)").toUpperCase();
		    if (n.equals("S"))
		   {   
		     nomeaux=JOptionPane.showInputDialog("Novo Nome: ");
		     for(int i=0;i<=menu.c;i++)
			 if(nomeaux.equals(menu.nomecolab[i]))
			   aux1=1;
			 if (aux1==1)
				JOptionPane.showMessageDialog(null,"Nome Já Existente!");
			  else
				menu.nomecolab[m]=nomeaux;
			}
			if (aux1==0)
			{ 
				   n=JOptionPane.showInputDialog("Deseja Alterar o Tipo  de Peças (Por código) ?(S/N)").toUpperCase();
				  if (n.equals("S"))
				  {
					  menu.tipo[m]=Integer.parseInt(JOptionPane.showInputDialog("Novo Tipo de Peças (Por código): "));
					  for (int i=0; i<=menu.p; i++)
						  if (pecaux==menu.total[i])
							  aux2=1;
					  	if(aux2==0)
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
						} {
								menu.tipo[m]=pecaux;
								for(int i=0; i<=menu.p;i++)
				   	   if(menu.tipo[m]==menu.codpeca[i])
				   	      valor=menu.preco[i];
				     total=valor*menu.total[m];
				     menu.bruto[m]=total;
				     if(menu.total[m]<2000)
				       menu.salb[m]=(((total*15)/100)+350);
				     if(menu.total[m]>=2000)
				       menu.salb[m]=(((total*19)/100)+350);
				     menu.salfun=menu.salfun+menu.salb[m];
				     if(menu.salb[m]<=300)
				     {   
				        menu.desconto[m]=((menu.salb[m]*5)/100);
				        menu.saliq[m]=menu.salb[m]-menu.desconto[m];
				     }
				     if((menu.salb[m]>300)&&(menu.salb[m]<=500))
				     {   
				        menu.desconto[m]=((menu.salb[m]*7)/100);
				        menu.saliq[m]=menu.salb[m]-menu.desconto[m];
				     }
				     if((menu.salb[m]>500)&&(menu.salb[m]<=750))
				     {   
				        menu.desconto[m]=((menu.salb[m]*8.5)/100);
				        menu.saliq[m]=menu.salb[m]-menu.desconto[m];
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
				  
				  n=JOptionPane.showInputDialog("Deseja Alterar a quantidade de peças produzidas?(S/N)").toUpperCase();
					if(n.equals("S"))
					{
						 qpaux=Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de peças produzidas"));		
						menu.total[menu.c]=qpaux; 		
					}
					else
					{
					
					}
					
					}
			
			}       
		      JOptionPane.showMessageDialog(null,"Dados Alterados!");	 
		   
		   if (aux==0)
		   {
		  
		   s="Nenhum Colaborador Encontrado Com Este Nome!";
		   JOptionPane.showMessageDialog(null,s); 
		   }  
	}
}
