package StreamAndFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by zhangwenqiang on 2017/3/9.
 */
public class CopyFileInputStreamToFileOutputStream {
    public static void main(String[] args) {
        File inputFile=new File("E:1.dat");
        //必须先创建目录
        File originalOutputFile=new File("E:2");
        if(!originalOutputFile.exists()){
            originalOutputFile.mkdirs();
        }
        //再创建文件
        File outputFile=new File(originalOutputFile,"2.dat");
        /**
         * //必须先创建目录//再创建文件(自己写的小工具中的)
         *         //  d://Docid
         docidDir = p.getProperty("allTxt.url");
         File dir = new File(docidDir);
         if (!dir.exists()) {
         dir.mkdirs();
         }
         File f = new File(dir, now + "@Docid.txt");
         saveToFile(f, docIdsStr.toString(), now);
         */
        try {
            FileInputStream inputStream=new FileInputStream(inputFile);
            FileOutputStream outputStream=new FileOutputStream(outputFile);
            byte n[]=new byte[10];
            int result=inputStream.read(n);
            //==0的话会陷入死循环中
            while(result!=-1){
                outputStream.write(n);
                result=inputStream.read(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
