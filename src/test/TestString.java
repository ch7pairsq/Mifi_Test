package test;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String lz ="zhangzhang����,�Ǹ���ͬ־��ͬ־haotongzhi,��ѧϰ";
		int k = lz.indexOf(",");
		if(k!=-1){

		}
		//��һ��
		lz= lz.substring(k+1, lz.length());
		System.out.println(lz);

	}

}
