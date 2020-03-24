package com.epam.task;

import static org.junit.Assert.*;
import org.junit.Test;

public class RemoveFirst2A {

	public static Object remove(String string,char ch1) {
		// TODO Auto-generated method stub
		 ch1 = string.charAt(0);
		if(ch1 == 'A'){
		 return string.substring(1);
		}
		return string;
		}

	public static Object removetest(String string, char ch2) {
		// TODO Auto-generated method stub
		 ch2 = string.charAt(1);
		 if(ch2 == 'A'){
				return string.charAt(0)+string.substring(2);
			}
		return string;
	}

	public static Object removeT(String string, char c) {
		// TODO Auto-generated method stub
		int strlen = string.length();
		String result = "";
		if(strlen == 0){
			result = "";
		}
		return result;
	}


	public static Object removeFS(String string, char ch1,char ch2) {
		// TODO Auto-generated method stub
		 ch2 = string.charAt(1);
		 ch1 = string.charAt(0);
		 if(ch1 == 'A' && ch2 == 'A'){
			 return string.substring(1+2);
	}
		return string;
	}
}

