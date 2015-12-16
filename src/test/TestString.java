package test;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String lz ="zhangzhang张张,是个好同志好同志haotongzhi,爱学习";
		int k = lz.indexOf(",");
		if(k!=-1){

		}
		//第一个
		lz= lz.substring(k+1, lz.length());
		System.out.println(lz);

	}

}
