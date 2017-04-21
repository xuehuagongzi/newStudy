package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/4/21.
 */
public class Add_Binary {
    public static void main(String[] args) {
        String num1 = "101";
        String num2 = "1";
        String result = addToBinary(num1, num2);
        System.out.println(result);
    }

    private static String addToBinary(String num1, String num2) {
        if(num1!=null && num2!=null) {
            if(num1.equals("0")){
                return num2;
            }
            if(num2.equals("0")){
                return num1;
            }
            char num1Char[] = num1.toCharArray();
            char num2Char[] = num2.toCharArray();
            int i = num1Char.length - 1;
            int j = num2Char.length - 1;
            int length = num1Char.length > num2Char.length ? num1Char.length + 1 : num2Char.length + 1;
            char[] result = new char[length];
            int k = 0;
            int tmp = 0;//作为进位字段  为1或者0
            while (i >= 0 && j >= 0) {
                if (num1Char[i]-48 + num2Char[j]-48 + tmp >= 2) {

                    if (num1Char[i] - 48 + num2Char[j] - 48 + tmp == 2) {
                        result[k] = '0';
                    }
                    if (num1Char[i] - 48 + num2Char[j] - 48 + tmp == 3) {
                        result[k] = '1';
                    }
                    tmp = 1;
                    k++;
                        i--;
                        j--;
                } else {

                    if (num1Char[i] - 48 + num2Char[j] - 48 + tmp == 1) {
                        result[k] = '1';
                    }
                    if (num1Char[i] - 48 + num2Char[j] - 48 + tmp == 0) {
                        result[k] = '0';
                    }
                    tmp = 0;
                    k++;
                    i--;
                    j--;
                }
            }
            while (i >= 0) {
                if (num1Char[i] - 48 + tmp == 2) {
                    result[k] = '0';
                    tmp = 1;
                    k++;
                    i--;
                } else {
                    if (num1Char[i] - 48 + tmp == 1) {
                        result[k] = '1';
                    }
                    if (num1Char[i] - 48 + tmp == 0) {
                        result[k] = '0';
                    }
                    tmp = 0;
                    k++;
                    i--;
                }
            }
            while (j >= 0) {
                if (((int) num2Char[j]) - 48 + tmp == 2) {
                    result[k] = '0';
                    tmp = 1;
                    k++;
                    j--;
                } else {
                    if (((int) num2Char[j]) - 48 + tmp == 1) {
                        result[k] = '1';
                    }
                    if (((int) num2Char[j]) - 48 + tmp == 0) {
                        result[k] = '0';
                    }
                    tmp = 0;
                    k++;
                    j--;
                }
            }
            char[] newResult=new char[length-1];
            if (tmp == 1) {
                result[k] = '1';
                newResult=result;
            }else {
                for (int l = 0; l < length - 1; l++) {
                    newResult[l]=result[l];
                }
            }
            StringBuffer stringBuffer = new StringBuffer(new String(newResult));
            String res = stringBuffer.reverse().toString();
            return res;
        }else {
            return " ";
        }
    }
}
