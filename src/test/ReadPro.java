package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPro {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		 Properties pp = new Properties();
		 //在classpath根路径下注意斜杠
		//InputStream in = ReadPro.class.getResourceAsStream("\\cc.properties");
		 //在所在类下
		InputStream in = ReadPro.class.getResourceAsStream("cc.properties");
		pp.load(in);

		String a = pp.getProperty("zhang");
		String b = pp.getProperty("liu");

		System.out.println(a+"---------"+b);

	}

}
