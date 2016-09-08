import java.util.Scanner;
import java.io.*;
class Lottery 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String reward[] = new String[6];
		int money[] = new int[6];
		String input[] = new String[100];
		int result[] = new int[100];
		int i,j=0;
		
		
			for(i=0;i<6;i++){
				reward[i] = sc.next();
				money[i] = sc.nextInt();
				//System.out.print(reward[i] + " ");
				//System.out.println(money[i]);
			}

			for(;;){
				input[j] = sc.next();
				//System.out.println(input[j].substring(0,6));
				//System.out.println(input[j].substring(0,3));
				//System.out.println(input[j].substring(3,6));
				//System.out.println(input[j].substring(4,6));
				if(input[j].equals("-1")){
					System.exit(0);
				}else{
					if(input[j].substring(0,6).equals(reward[0])){
						result[j] = result[j] + money[0];
					}

					if(input[j].substring(0,3).equals(reward[1])){
						result[j] = result[j] + money[1];
					}
					if(input[j].substring(0,3).equals(reward[2])){
						result[j] = result[j] + money[2];
					}
					if(input[j].substring(3,6).equals(reward[3])){
						result[j] = result[j] + money[3];
					}
					if(input[j].substring(3,6).equals(reward[4])){
						result[j] = result[j] + money[4];
					}
					if(input[j].substring(4,6).equals(reward[5])){
						result[j] = result[j] + money[5];
					}

					
					
				}
				System.out.println(result[j]);	
			j++;
				
				
			}
			

		

	}
}
