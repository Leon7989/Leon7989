
import java.util.Scanner;
public class English_word {
    public static void main(String[] args){
        System.out.println("请输入一个字母:");
        Scanner a = new Scanner(System.in);
//        char word = a.next().charAt(0);         //接受字符输入
//        if (word>='a'&&word<='z')           //转换成大写的部分
//        {
//            word = (char) (word-32);
//            System.out.println("转换成大写为:"+word);
        System.out.print(Character.toUpperCase('a'));           //java内置库中字母大小写转换的方法
//        }
//        else if (word>='A'&&word<='Z')          //转换成小写的部分
//        {
//            word = (char) (word+32);
//            System.out.println("转换成小写为:"+word);
//        }
        System.out.print(Character.toLowerCase('A'));

        a.close();
    }
}




