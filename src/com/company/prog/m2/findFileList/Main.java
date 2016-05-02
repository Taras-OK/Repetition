package com.company.prog.m2.findFileList;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	static class MyFileFilter implements FilenameFilter {
		private String[] ext;

		public MyFileFilter(String[] ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			boolean b = false;
			for (int i = 0; i < ext.length; i++) {
				if (name.endsWith(ext[i])) {
					b = true;
				}
			}
			return b;
		}
	}

	private static void findFiles(String srcPath, String[] ext, ArrayList<String> list) throws IOException {
		File dir = new File(srcPath);
		File[] files = dir.listFiles(new MyFileFilter(ext));

		for (int i = 0; i < files.length; i++) {
			//list.add(srcPath + files[i].getName());
			list.add(files[i].getCanonicalPath());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String[] fileList = {".txt", ".xls", ".vsdx"};
		try {
			findFiles("d:\\tmp", fileList, list);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : list)
			System.out.println(s);
	}

}