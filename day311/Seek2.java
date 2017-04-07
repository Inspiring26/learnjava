import java.io.IOException;
import java.io.RandomAccessFile;
public class Seek2 {
	public static void main(String[] args)throws Exception{
		RandomAccessFile rf = new RandomAccessFile("hello3.txt", "rw");
		System.out.println("全文共有"+rf.length()+"个字节。");
		//String str[][] = new String[26][];
		//byte temp=32;
		
			System.out.println(rf.readLine());
			
		
	}
}