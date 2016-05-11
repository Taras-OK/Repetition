package com.company.prog.m2.copyFileWithProgress;

public class MyClass {

	private static class Progress implements IProgress {
		long n = 0;
		
		@Override
		public void update(double p) {
			final long rounded = Math.round(p);
			long add = rounded - n;
			n = rounded;
			
			while (add-- > 0)
				System.out.print('.');
		}
	}
	
	public static void main(String[] args) {
		Copy c = new Copy("D:\\Install\\ACad\\Autodesk_AutoCAD_Electrical_2012_EN-RU.isz", "d:\\AutoCAD.isz", new Progress());
		c.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.interrupt();

	}
}