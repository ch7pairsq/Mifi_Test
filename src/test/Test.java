package test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	private static int counter = 0;
  public static void main(String[] args) throws ParseException {
	 // int k = Test.countStr("02,03", ",");
	  //System.out.println(k);
	  SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	  String str_date = sdf.format(new Date());
//	  Timestamp tt =  Timestamp.valueOf(sdf.format(new Date()));
//	  Date date =sdf.parse(str_date);

	 // java.sql.Date dd = new java.sql.Date(sdf.parse(sdf.format(new Date())));
	 // System.out.println(dd);

}

  public static int countStr(String str1, String str2) {

      if (str1.indexOf(str2) == -1) {
          return 0;
      } else if (str1.indexOf(str2) != -1) {
          counter++;
          countStr(str1.substring(str1.indexOf(str2) +
                 str2.length()), str2);
             return counter;
      }
          return 0;
  }
}
