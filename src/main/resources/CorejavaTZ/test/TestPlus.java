package com.corejava.test;

import org.junit.Assert;
import org.junit.Test;

import com.corejava.day16.Plus;

/**单元测试类*/
public class TestPlus {

	//测试方法
	@Test
	
	//@Test(expected=NullPointerException.class)
	
	//性能测试
	//@Test(timeout=2000)
	public void testAdd(){
		int z = new Plus().add(7, 9);
		
		//断言
		Assert.assertEquals(16, z);
	}
}
