import java.util.*;
public class Test {
	public static void main(String[] args){
		int n, lCount = 0 , oCount = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Patients");
		n=s.nextInt();
		String name[]=new String[n];
		String place[]=new String[n];
		String c="bangalore";
		Scanner s1=new Scanner(System.in);
		//if patient's less than 1
		if(n>0) {
		for(int i=0;i<=n-1;i++)
		{
			System.out.println("Enter the "+i+" patient name");
			name[i]=s1.nextLine();
			System.out.println("Enter the "+i+" patient place");
			place[i]=s1.nextLine();
			place[i].toLowerCase();
		}
			String words[]=place;
			for(String w: words){
				//System.out.println(w);
				
			int m=w.compareTo(c);
			
			if(m==0){
				
				lCount++;
			}
			else{
			       oCount++;
			}
			
		}
		
			System.out.println("Local Patient's= "+lCount );
			System.out.println("OutofStation Patient's="+oCount);
		}
		else {
			System.out.println("exit");
		}
	}
		
}
