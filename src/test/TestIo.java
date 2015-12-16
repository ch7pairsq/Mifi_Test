package test;

import java.io.IOException;

public class TestIo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String newFileName = "F:\\workspace_eGrateWall\\suppreg\\DefaultWebApp\\fileuploadsave\\GYSGL_ZC_DA_FZXX_ZZZS";
	      java.io.File fileDst = new java.io.File(newFileName);
	      fileDst.mkdirs();
	      //fileDst.createNewFile();

	}

}
