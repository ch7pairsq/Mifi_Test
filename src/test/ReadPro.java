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
		 //��classpath��·����ע��б��
		//InputStream in = ReadPro.class.getResourceAsStream("\\cc.properties");
		 //����������
		InputStream in = ReadPro.class.getResourceAsStream("cc.properties");
		pp.load(in);

		String a = pp.getProperty("zhang");
		String b = pp.getProperty("liu");

		System.out.println(a+"---------"+b);

	}

}
