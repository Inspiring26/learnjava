//测试文件还能不能执行
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class SeekWord313{
	public static void main(String[] args)throws Exception{
		RandomAccessFile rf = new RandomAccessFile("hello3.txt", "rw");
		System.out.println("总共有"+rf.length()+"个字节");
		String temp= rf.readLine();
		int key=0;
		List l = new ArrayList();
		
		//String temp= rf.readLine();
		while(temp!=null){
			String[] str=temp.split(" ");
			//System.out.println(temp);
			
			//System.out.println("l:"+l);
			for (int i=0;i<str.length ;i++ ) {
				for (Iterator it=l.iterator();it.hasNext() ;) {
				if (it.next()==str[i]) {
					key=1;
					break;
					}
				}
				//
				//如果没有重复的，则把该单词加到集合中
				if (key==0) {
					System.out.println(str[i]);
					//l.add(str[i])；
				}
				key=0;
			}
			
			/*
			for (int i=0;i<str.length ;i++ ) {
				if (str[i]!=" ") {
					l.add(str[i]);
					//System.out.println(s);
					//List.add[s];
				}
				
			}
			*/

			/*String[] data=new String[11];
			for (int i=0;i<11 ;i++ ) {
			data[i]=str[i];
			}
			for (int i=10;i>=0 ;i-- ) {
			System.out.println("data["+i+"]的单词是："+data[i]);
			}*/
			temp= rf.readLine();

		}
		//
		//System.out.println(l.size());
		/*
		for(Iterator it=l.iterator();it.hasNext() ; ) {
			System.out.println(it.next());
		}
		*/
		//打印一些看看
		/*
		for (int i=0;i<50 ;i++ ) {
			System.out.println(data[i]);
		}
		*/
	

	}
}