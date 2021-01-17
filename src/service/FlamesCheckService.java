package service;
import java.util.*;
// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2){
		char res='n';
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		
		
		char[] arr1=name1.toCharArray();
		char[] arr2=name2.toCharArray();
		int count=0;
		for(int i=0;i<arr2.length;i++) {
			int ind=String.valueOf(arr1).indexOf(""+arr2[i]);
			if(ind==-1) { //matching chars
				
			}else {
				count++;
				arr1[ind]=' ';
				arr2[i]=' ';
			}
		}
       
      count=name1.length()+name2.length()-(2*count);
       
       ArrayList<Character> flames=new ArrayList<Character>();
       flames.add('f');
       flames.add('l');
       flames.add('a');
       flames.add('m'); 
       flames.add('e');
       flames.add('s');
       
       int j=0;
       //System.out.println(String.valueOf(arr1)+" "+String.valueOf(arr2)+" "+count);
       while(flames.size()>1) {
    	   int rem=count%flames.size();
    	   j=rem-1+j;
    	   
    	   j=(j)%flames.size();
    	   if(j<0) j=flames.size()+j;
    	//   System.out.println("Rem:"+rem+" j:"+j);
    	   flames.remove(j);
       }
       
		res=flames.get(0);
		System.out.println("Your Name:"+name1);
		System.out.println("Partner Name:"+name2);	
		
		System.out.println(res);
		switch(res) {
		case 'f': System.out.println("Friends"); break;
		case 'l': System.out.println("Lovers");break;
		case 'a': System.out.println("Affection");break;
		case 'm':System.out.println("Marriage"); break;
		case 'e':System.out.println("Enemies"); break;
		case 's':System.out.println("Siblings"); break;
		
		
		}
		return res;
		
	}
}