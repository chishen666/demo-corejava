package com.corejava.test;

import org.junit.Assert;
import org.junit.Test;

import com.corejava.day16.Plus;

/**��Ԫ������*/
public class TestPlus {

	//���Է���
	@Test
	
	//@Test(expected=NullPointerException.class)
	
	//���ܲ���
	//@Test(timeout=2000)
	public void testAdd(){
		int z = new Plus().add(7, 9);
		
		//����
		Assert.assertEquals(16, z);
	}
}
