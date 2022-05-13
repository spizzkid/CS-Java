package question2;

import java.io.File;

public class delDir {
	private static void delDir(File f) {
		File[] files = f.listFiles();
		
		if (files.length > 0) {
			for (File f1 : files) {
				if (f1.isDirectory()) {
					delDir(f1);
				} else {
					f1.delete();
				}
			} 
		}
		f.delete();
		System.out.println("删除完毕");
	}
	
	
	public static void main(String[] args) {
		File f = new File("./t/e/s/t");
		if (f.mkdirs()) {
			System.out.println("多级目录创建成功");
		} else {
			System.out.println("创建失败");
		}
		
		
		File f1 = new File("./t");
		delDir(f1);
	}
}
