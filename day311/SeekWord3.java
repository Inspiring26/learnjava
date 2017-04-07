import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class SeekWord3{
	public static void main(String[] args)throws Exception{
		RandomAccessFile rf = new RandomAccessFile("hello2.txt", "rw");
		String temp= rf.readLine();
		
		//基本思想是：先把所有元素都存到一个集合中，最好是元素不可重复的集合。
		//然后在把所有元素都取出来，放到一个字符串组中，
		//然后在把文件遍历一遍，遍历的过程中计数

		//基本思想是：先把所有元素都存到一个集合中，最好是元素不可重复的集合。
		HashSet hs = new HashSet();
		while(temp!=null){
		temp=temp.replace(".","");
		temp=temp.replace(",","");
		//temp=temp.replace("\r","");
		String[] str=temp.split(" ");
		for (int i=0;i<str.length ;i++ ) {
			hs.add(str[i]);
		}
		temp= rf.readLine();
		}//以上步骤，所有单词已经存到集合中


		//把集合中的单词转存到字符串组中
		String[] data= new String[hs.size()];
		int[] num= new int[hs.size()];
		int x=0;
		for (Iterator it=hs.iterator();it.hasNext() ; ){
			data[x++]=(String)it.next();
		}
		//集合中的单词转存到字符串组中


		rf.seek(0);
		temp= rf.readLine();
		while(temp!=null){
			temp=temp.replace(".","");
			temp=temp.replace(",","");
			//temp=temp.replace("\r","");
			String[] str=temp.split(" ");
			for (int i=0;i<str.length ;i++ ) {
				for (int j=0;j<data.length ;j++ ) {
					if (data[j].equals(str[i])) {
						num[j]++;
						break;
						
					}
				}
			}
			temp= rf.readLine();

		}//统计每个单词的频次结束

		
		int x1=0;
		for (int i=0;i<num.length ;i++ ) {
			if (num[i]==1) {
				x1++;
				
			}
		}
		System.out.println("总共有"+num.length+"个单词.");
		System.out.println("有"+x1+"个单词只出现一次。");
		System.out.println("各单词出现的次数为：");

		int[] sortedArray =(int[])num.clone();
		bubbleSort(sortedArray);

		

		for (int i=0;i<sortedArray.length ;i++ ) {
			for (int j=0;j<num.length ;j++ ) {
				if (num[j]==sortedArray[i]&&!data[j].equals("")) {
					System.out.println(data[j]+":"+num[j]);
					num[j]=-1;
					
				}
			}
		}




		

		
	}

	public static void bubbleSort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
        for(int j = 0 ;j < size-1-i ; j++)
        {
            if(numbers[j] < numbers[j+1])  
            {
            temp = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
            }
        }
        }
    }
}