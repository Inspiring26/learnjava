import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class SeekWord {
	public static void main(String[] args)throws Exception{
		RandomAccessFile rf = new RandomAccessFile("hello2.txt", "rw");
		//System.out.println("全文共有"+rf.length()+"个字节。");
		String temp= rf.readLine();
		
		
		int key=0;
		//System.out.println(str[0]);
		//基本思想是：先把所有元素都存到一个集合中，最好是元素不可重复的集合。
		//然后在把所有元素都取出来，放到一个字符串组中，
		//然后在把文件遍历一遍，遍历的过程中计数

		//基本思想是：先把所有元素都存到一个集合中，最好是元素不可重复的集合。
		HashSet hs = new HashSet();
		while(temp!=null){
		String[] str=temp.split(" ");
		//System.out.println(str.length);
		for (int i=0;i<str.length ;i++ ) {
			hs.add(str[i]);
		}

		
		temp= rf.readLine();

		}
		System.out.println(hs.size());
		String[] data= new String[hs.size()];
		int[] num= new int[hs.size()];
		int i=0;
		for (Iterator it=hs.iterator();it.hasNext() ; ){
			data[i++]=(String)it.next();
		}
		//System.out.println(data[10]);

		/*
		ArrayList al = new ArrayList();
		for (int i=0;i<str.length ;i++ ) {
			for (Iterator it=al.iterator();it.hasNext() ; ) {
			String strit=it.next();
			System.out.println(strit);
			if (strit==str[i]) {
				key=1;
				
			}
		}
		if (key==0) {
			al.add(str[i]);
		}
		key=0;
			
		}
		/*打印出Array中所有的元素
		for (Iterator it=al.iterator();it.hasNext() ; ) {
			System.out.println(it.next());
		}
		for (Iterator it=al.iterator();it.hasNext() ; ) {
			System.out.println(it.next());
		}
		*/

		
	}
}