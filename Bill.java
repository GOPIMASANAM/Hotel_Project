package hotel;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Bill { 
	private float idly=0,dosa=0,puri=0,chapathi=0,upma=0,tea=0,coffe=0,milk=0,total=0,grand_total=0;
	 private Scanner sc=null;
	    public Bill() {
	    	if(sc==null)
	        sc = new Scanner(System.in);
	     }	
	 public static void main(String[] args) throws IOException  {
		try {
		 Bill bobj=new Bill(); 		
		 bobj.details(); 		
		 bobj.confirm(); 
		 System.out.println("THANKYOU VISIT AGAIN"); 
		 bobj.destruct();
		}
		catch(Exception e) {
		System.out.println(e);
		} 	
	}
	private void destruct() {
		if(sc!=null) 
			sc.close();		
	}
	public void details() {  
		try {
		System.out.println("---------------WELCOME TO HOTEL ABC----------------");
		System.out.println("1. Idly     -->25");
		System.out.println("2. Dosa     -->35");
		System.out.println("3. Puri     -->40");
		System.out.println("4. Chapathi -->45");
		System.out.println("5. Upma     -->20");
		System.out.println("6. Tea      -->10");
		System.out.println("7. Coffe    -->15");
		System.out.println("8. Milk      -->8");
		System.out.println("9. Exit ");
		int ch=0,plates=0,cups=0;
		do {
		
		System.out.println("Please Enter your choice: ");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1: System.out.println("Enter no.of plates: ");
		  		plates=sc.nextInt();
		  		System.out.println("Idly: 25*"+plates+" = "+(plates*25));
			    idly=idly+(plates*25);				 
		        break;
		case 2: System.out.println("Enter no.of plates: ");
				plates=sc.nextInt();
				System.out.println("Dosa: 35*"+plates+" = "+(plates*35));
				dosa=dosa+(plates*35);			
				break;
		case 3: System.out.println("Enter no.of plates: ");
				plates=sc.nextInt();
				System.out.println("Puri: 40*"+plates+" = "+(plates*40));
	    		puri=puri+(plates*40);		
	    		break;
		case 4: System.out.println("Enter no.of plates: ");
				plates=sc.nextInt();
				System.out.println("Chapathi: 45*"+plates+" = "+(plates*45));
				chapathi=chapathi+(plates*45);		
				break;
		case 5: System.out.println("Enter no.of plates: ");
				plates=sc.nextInt();
				System.out.println("Upma: 20*"+plates+" = "+(plates*20));
				upma=upma+(plates*20);		
				break;
		case 6: System.out.println("Enter no.of Cups: ");
				cups=sc.nextInt();
				System.out.println("Tea: 10*"+cups+" = "+(cups*10));
				tea=tea+(cups*10);		
				break;
		case 7: System.out.println("Enter no.of cups: ");
				cups=sc.nextInt();
				System.out.println("coffe: 15*"+cups+" = "+(cups*15));
				coffe=coffe+(cups*15);		
				break;
		case 8: System.out.println("Enter no.of cups: ");
				cups=sc.nextInt();
				System.out.println("Milk: 8*"+cups+" = "+(cups*8));
				milk=milk+(cups*8);		
				break;
		case 9: break; 
		default: System.out.println("Please enter 1 to 9 only ");
		    }
		    total=(idly+dosa+puri+chapathi+upma+tea+coffe+milk);
		    System.out.println("Present Total: "+total);
	     }while(ch!=9); 
       }
		catch(InputMismatchException ie) {
			System.out.println(" Input Mismatch Exception ");
		    }
		catch(NumberFormatException ne) {
			System.out.println(" Number Format Exception ");	
		    }
			 catch(Exception e) {
	    	 System.out.println("You entered wrong inputs choose \"Again\"");
	}			
}  
	 public void confirm() { 
		 int op=0;
		 float cGST=0,sGST=0; 
		 try {
		    do {  
			   System.out.println("If you want to purchase again Enter \"1\"");
			   System.out.println("You want final bill Enter \"2\"");
			   op=sc.nextInt();
			   switch(op) { 			   
			   case 1: 
				        details();
			   			break;
			   case 2: System.out.println("----------FINAL BILL DETAILS---------- ");
				   		cGST=(8f/100)*total;
			   		   sGST=(12f/100)*total;
			   		   grand_total=(total+cGST+sGST);
			   		   System.out.println("TOTAL BILL: "+total);
			   		   System.out.println("CGST: "+cGST);
			   		   System.out.println("SGST: "+sGST);
			   		   System.out.println("GRAND TOTAL: "+grand_total);	
			   		   break;
			 }
		  }  while(op!=2);			   
		}    catch(InputMismatchException ie){		 
			 System.out.println("Input Mismatch Exception ");
		     }
		     catch(NumberFormatException  ne){		 
			 System.out.println("Number Format Exception ");
		     }
			 catch(Exception e) {
			 System.out.println("You entered wrong inputs choose \"Again\"");
		     }
	    } 	 
 }		

