import javax.swing.JOptionPane;

public class CustosOperacionais
{
	public static void CustOp()
	{
	   if(menu.g <200)
		{
			menu.g++;
			menu.codgasto[menu.g]=menu.g+1;
		    menu.tkw=Double.parseDouble(JOptionPane.showInputDialog("Código:"+menu.codgasto[menu.g]+"\nTotal de Kw: "));
	        if (menu.tkw<=150)	 
	           menu.tg=(menu.tkw*0.39);
	        if((menu.tkw>150)&&(menu.tkw<=300))   	 
	           menu.tg=(((menu.tkw-150)*0.56)+58.5);
	        if(menu.tkw>300)   	 
	           menu.tg=(((menu.tkw-300)*0.67)+141.94);
	        for (int i=0; i<=menu.c; i++)   
	           menu.lucrobt= menu.bruto[i]+menu.lucrobt;
	        if(menu.lucrobt<20000)
	           menu.icms=((menu.lucrobt*17)/100);
	        else
	           menu.icms=((menu.lucrobt*23)/100);
	        for (int i=0; i<=menu.c; i++)
	            menu.salarios=menu.salb[i]+menu.salarios;
	        menu.ll=(menu.lucrobt-(menu.tg+menu.salarios+menu.icms));
	        JOptionPane.showMessageDialog(null," "+menu.lucrobt+"   " +menu.tg+"   "+menu.salarios+"    "+menu.icms+"   "+menu.ll+"\n");
		 }
		 
     }
 }	