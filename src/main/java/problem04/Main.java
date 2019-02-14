package problem04;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		//세자리 랜덤 수 생성
			String answer=String.valueOf((int)(Math.random()*899)+100);
			String myanswer="";
			int b=0;
			int s=0;
			int count=0;
			
			char[] list = new char[3];
			
			System.out.println(answer);
			Scanner sc=new Scanner(System.in);
			
			BufferedWriter fwrite=null;
			try {
				fwrite=new BufferedWriter(new FileWriter("record.txt"));
				
			}catch(FileNotFoundException e) {
				
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			long start=System.currentTimeMillis();
			while(s!=3) {
			
			s=0;
			b=0;
			
			System.out.print("입력 : ");
			myanswer=sc.next();
			
			for(int i=0;i<3;i++) {
				list[i]=answer.charAt(i);
				if(myanswer.charAt(i)==list[i])
					s++;
					list[i]='a';
				}
					
			if(list[0]==myanswer.charAt(1)) {b++; list[0]='a';}
			else if(list[0]==myanswer.charAt(2)) {b++; list[0]='a';}
			if(list[1]==myanswer.charAt(0)) {b++; list[1]='a';}
			else if(list[1]==myanswer.charAt(2)) {b++; list[1]='a';}
			if(list[2]==myanswer.charAt(0)) {b++; list[2]='a';}
			else if(list[2]==myanswer.charAt(1)) {b++; list[2]='a';}
			
			int o=3-(b+s);
				
			count++;
			System.out.println(count+"-S:"+s+",B:"+b+",O:"+o);
			
			}
			long cur=System.currentTimeMillis();
			long time=cur-start;
			try {
				fwrite.write(answer+"/"+count+":"+time);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("게임종료");
			
			
			
	}
}