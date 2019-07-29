package kr.green.spring.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
	
	public static String uploadFile(String uploadPath, String originalName, byte[] fileData) throws Exception{
		
		UUID uid = UUID.randomUUID();
		String savedName = uid.toString() +"_" + originalName;
		String savedPath = calcPath(uploadPath); //업로드 날짜를 기준으로 파일 경로를 추가
		File target = new File(uploadPath + savedPath, savedName);
		FileCopyUtils.copy(fileData, target);
		String uploadFileName = makeIcon(uploadPath, savedPath, savedName);
		
		return uploadFileName;
	}
	
	private static String calcPath(String uploadPath) {
		
		Calendar cal = Calendar.getInstance(); //------? 얘는 어떤형태로 날짜의 값을 가져오는것인가??
		
		String yearPath = File.separator + cal.get(Calendar.YEAR);												  // /2019
		String monthPath = yearPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1); // /2019/07
		String datePath = monthPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.DATE));	  // /2019/07/29
		makeDir(uploadPath, yearPath, monthPath, datePath); 													  // 폴더생성
		
		return datePath;
 
	}
	private static void makeDir(String uploadPath, String... paths) {
		if(new File(uploadPath+paths[paths.length-1]).exists())
			return;
		for(String path : paths) {
			File dirPath = new File(uploadPath + path);
			if( !dirPath.exists())
				dirPath.mkdir();
		}
	}
	private static String makeIcon(String uploadPath, String path, String fileName)
        	throws Exception{
		String iconName = uploadPath + path + File.separator + fileName;
		return iconName.substring(uploadPath.length()).replace(File.separatorChar, '/');
	}

}
