import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class SeekWord {
	public static void main(String[] args)throws Exception{
		RandomAccessFile rf = new RandomAccessFile("hello2.txt", "rw");
		//System.out.println("ȫ�Ĺ���"+rf.length()+"���ֽڡ�");
		String temp= rf.readLine();
		
		
		int key=0;
		//System.out.println(str[0]);
		//����˼���ǣ��Ȱ�����Ԫ�ض��浽һ�������У������Ԫ�ز����ظ��ļ��ϡ�
		//Ȼ���ڰ�����Ԫ�ض�ȡ�������ŵ�һ���ַ������У�
		//Ȼ���ڰ��ļ�����һ�飬�����Ĺ����м���

		//����˼���ǣ��Ȱ�����Ԫ�ض��浽һ�������У������Ԫ�ز����ظ��ļ��ϡ�
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
		/*��ӡ��Array�����е�Ԫ��
		for (Iterator it=al.iterator();it.hasNext() ; ) {
			System.out.println(it.next());
		}
		for (Iterator it=al.iterator();it.hasNext() ; ) {
			System.out.println(it.next());
		}
		*/

		
	}
}