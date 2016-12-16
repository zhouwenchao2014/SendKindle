package cn.zhou.myhomespace.utils;

import java.io.*;

/**
 * 文件读取
 * Created by zhouwenchao on 2016/12/9.
 */
public class FileReadUtils {

    private static String SPLIT="/";

    public static String fileReadFromPathFile(String path,String fileName){
        StringBuffer stringBuffer=new StringBuffer();
        File dir=new File(path);
        if(!dir.exists()){
            return null;
        }
        File file=new File(path+SPLIT+fileName);
        if(!file.exists()){
            return null;
        }

        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            while((line=bufferedReader.readLine())!=null){
                stringBuffer.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuffer.toString();
    }
}
