package StreamAndFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by zhangwenqiang on 2017/3/9.
 */
public class CopyFileReaderToFileWriter {
    public static void main(String[] args) {
        File inputFile=new File("E:1.dat");
        File originalFile=new File("E:2");
        if (!originalFile.exists()){
            originalFile.mkdirs();
        }
        File outputFile=new File(originalFile,"2.dat");

        try {
            FileReader input=new FileReader(inputFile);
            FileWriter output=new FileWriter(outputFile);
            //这个是char数组了，不再是byte数组了
            char[] buf=new char[2];
            while(input.read(buf)!=-1){
                output.write(buf);
            }
            //没有flush()数据不会复制到2.dat，所以必须加
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
