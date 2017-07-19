package com.dovetailsystems.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dovetailsystems.trials.PalindromeTester;

public class PalindromeTesterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void checkPalindromeTestSuccess() {
		PalindromeTester palindromeTester = new PalindromeTester();
//		assertEquals(true, palindromeTester.checkPalindrome("Malayalam"));
		assertTrue(palindromeTester.checkPalindrome("Malayalam"));
		
		
	}
	
	@Test
	public void testCheckPalindrome1() {
		PalindromeTester palindromeTester = new PalindromeTester();
		assertEquals(false, palindromeTester.checkPalindrome("Malayala"));
	}

}
