package StreamAndFile;

import java.io.*;

/**
 * Created by zhangwenqiang on 2017/3/9.
 */
public class CopyBufferReaderToBufferWriter {
    public static void main(String[] args) {
        File inputFile=new File("E:1.dat");
        //必须先创建目录
        File originalOutputFile=new File("E:2");
        if(!originalOutputFile.exists()){
            originalOutputFile.mkdirs();
        }
        //再创建文件
        File outputFile=new File(originalOutputFile,"2.dat");
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(outputFile));
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
