package com.qainfotech.TestNgProject;

import java.util.ArrayList;

public class ConsecutiveLettersStrings {
	 
	public  static ArrayList consecutiveStrings(ArrayList A)
	{
		ArrayList<String> result=new ArrayList<String>();
		int counter=0,parseS=0,parseI=0,print=0;
		String word=null;
		char alphabet1,alphabet2;
		for(counter=0;counter<A.size();counter++)
		{
			word=(String) A.get(counter);
			print=0;
			for(parseS=0;parseS<word.length();parseS++)
			{   alphabet1=word.charAt(parseS);
			if((parseS+1)>word.length())
				continue;
			    alphabet2=word.charAt(++parseS);
			    if(alphabet1==alphabet2)
			    {   
			    	print=1;
			    	break;
			    }
			
			}
			 if(print==1)
			    	result.add(word);
		}
		System.out.println(result);
		return result;
	}
}


