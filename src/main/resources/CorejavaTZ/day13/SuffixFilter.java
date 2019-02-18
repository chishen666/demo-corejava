package com.corejava.day13;

import java.io.File;
import java.io.FilenameFilter;

/**文件名过滤器*/
public class SuffixFilter implements FilenameFilter {

	private String str;

	public SuffixFilter(String str) {
		this.str = str;
	}

	@Override
	public boolean accept(File dir, String name) {
		
		File file = new File(dir, name);
		
		if (file.isDirectory()) {
			return true;
		}
		//过滤后缀
		if (file.getName().endsWith(str)) {
			return true;
		}
		return false;
	}
}
