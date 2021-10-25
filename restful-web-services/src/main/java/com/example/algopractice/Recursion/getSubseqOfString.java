package com.example.algopractice.Recursion;

public class getSubseqOfString {
   public static void main(String args[])
   {
	   String str="vineet";
	   int len=str.length();
	   
	   getSubseq(str,len);
	   
	   
	   
	   
   }

private static void getSubseq(String str, int len) {
	// TODO Auto-generated method stub
	  
	if(str.length()==1)
	{
		return str;
	}
	
	 String  substr= getSubSeq(str,len-1);
	 
	
}
   
	 
}
