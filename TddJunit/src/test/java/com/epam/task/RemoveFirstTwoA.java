package com.epam.task;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveFirstTwoA {
	RemoveFirst2A  removeFirst2A;
	@BeforeEach
	void setup() {
		removeFirst2A= new RemoveFirst2A();
	}
	 @Test
	    public void removeFirstA(){
	        assertEquals("BCD", RemoveFirst2A.remove("ABCD", 'A'));
	        //assertEquals("CD", RemoveFirst2A.remove("AACD", 'A'));
	        
	     
	    }
	 
	    @Test
	    public void removeScondA(){
	        assertEquals("BCD", RemoveFirst2A.removetest("BACD", 'A'));
	        
	    }
	    @Test
	    public void removeFirstSecond2A(){
	 //   	assertEquals("CD", RemoveFirst2A.removeFS("AACD", 'A','A'));
	        assertEquals("AAAAAAAAA", RemoveFirst2A.removeFS("AAAAAAAAAAAA", 'A','A'));

	    }
	 
	    @Test
	    public void Test(){
	        assertEquals("", RemoveFirst2A.removeT("", 'A'));
	        //assertEquals("", RemoveFirst2A.removeT("AAAAAAAAAAAAAAAA", 'A'));
	    }

}
