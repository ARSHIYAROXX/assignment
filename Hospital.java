import java.util.Scanner;
public class Hospital{
    static int local_patient;
	static int outofstation;
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int n;
        System.out.println("Enter the no of patient's:");
		n=in.nextInt();
		String name[]=new String[n];
		Scanner s1=new Scanner(System.in);
        
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of patient  "+i);
			name[i]=s1.nextLine();
	
		System.out.println("Select place: ");
        System.out.println("1.Bangalore");
        System.out.println("2.Hubli");
        System.out.println("3.Mangalore");
        System.out.println("4.Other's");

        System.out.println("Please enter your choice:");
        
        //Get user's choice
        int choice=in.nextInt();
         
        //Display the title of the chosen module
        switch (choice) {
            case 1: System.out.println("Bangalore\n"); 
	   break;
            case 2: System.out.println("Hubli\n");
                    break;
            case 3: System.out.println("Mangalore\n"); 
                    break;
            case 4: System.out.println("Other's\n"); 
                     break;
            default: System.out.println("Invalid choice");
        }//end of switch
        if(choice==1) {
        	local_patient++;
        }
        	else{
        		outofstation++;
        		
		}
    
		}//end of for
		
		System.out.println("\n\nLocal Patient's="+local_patient);
        System.out.println("OutofStation Patient's="+outofstation);
    }//end of the main method
}//end of class
