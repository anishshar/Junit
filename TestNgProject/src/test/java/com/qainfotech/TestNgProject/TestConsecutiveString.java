package com.qainfotech.TestNgProject;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.AssertJUnit;

//import org.junit.Test;

//import org.junit.Assert;
//import org.junit.Test;

//import org.junit.Assert;
//import static org.junit.Assert.*;

public class TestConsecutiveString {
    @Test
	public void TestcheckConsecutive()
	{
		ArrayList<String> StringI=new ArrayList<String>();
		ArrayList<String> StringO=new ArrayList<String>();
		ArrayList<String> StringE=new ArrayList<String>();
		ConsecutiveLettersStrings obj=new ConsecutiveLettersStrings();
		StringI.add("Hello");
		StringI.add("Dome");
		StringI.add("winner");
		StringE.add("Hello");
		StringE.add("winner");
		StringO=obj.consecutiveStrings(StringI);
		AssertJUnit.assertEquals(StringE,StringO);
	}

	@Test
	public void TestcheckConsecutiveNull()
	{
		ArrayList<String> StringI=new ArrayList<String>();
		ArrayList<String> StringO=new ArrayList<String>();
		ArrayList<String> StringE=new ArrayList<String>();
		ConsecutiveLettersStrings obj=new ConsecutiveLettersStrings();
		StringI.add("");
		StringO=obj.consecutiveStrings(StringI);
		AssertJUnit.assertEquals(StringE,StringO);
	}
}

