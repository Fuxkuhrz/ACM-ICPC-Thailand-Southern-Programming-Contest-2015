/*
# ACM-ICPC-Thailand-Southern-Programming-Contest-2015
Problem B. Thai Lottery Checking 
จงเขียนโปรแกรมตรวจผลรางวัลสลากกินแบ่งรัฐบาลประเทศไทย ซึLงล็อตเตอรีL(Lottery) ประกอบด้วย
ตัวเลขหกหลัก โดยรางวัลทีLตรวจจะมีดังต่อไปนี  รางวัลทีL 1, รางวัลเลขหน้าสามตัว 2 รางวัล, รางวัลเลขท้ายสามตัว
2 รางวัล และรางวัลเลขท้ายสองตัว 1 รางวัล
 กรณีล็อตเตอรีLถูกรางวัลมากกว่าหนึLงรางวัล ให้รวมเงินรางวัลเข้าด้วยกัน โดยให้ตรวจหาเงินรางวัลทั งหมด
ทีLเป็นไปได้ของล็อตเตอรีLแต่ละใบ
Input
 กําหนดให้ อินพุตประกอบด้วยสองส่วน ส่วนแรกเป็นรายละเอียดของหมายเลขทีLได้รางวัลในแต่ละบรรทัด
ประกอบไปด้วย หมายเลขทีLออกและจํานวนเงินรางวัล ตามลําดับดังนี  รางวัลทีL 1, รางวัลเลขหน้าสามตัว W รางวัล,
รางวัลเลขท้ายสามตัว W รางวัล และรางวัลเลขท้ายสองตัว 1 รางวัล
 ส่วนทีLสอง เป็นเลขล็อตเตอรีLทีLต้องการจะตรวจ บรรทัดละหนึLงหมายเลข(ตัวเลขหกหลัก) โดยจะจบบรรทัด
สุดท้ายด้วย -1
Output
 แต่ละบรรทัด ให้พิมพ์จํานวนเงินรางวัลรวมทีLได้ตามลําดับของล็อตเตอรีLจากอินพุต
 
Sample Input 
021094 3000000
260 2000
403 2000
068 2000
819 2000
89 1000
100967
403094
260809
201216
198025
260989
123819
195800
021094
008589
-1
Sample Output 
0
2000
2000
0
0
3000
2000
0
3000000
1000 



*/



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
