import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class SeekWord3{
	public static void main(String[] args)throws Exception{
		RandomAccessFile rf = new RandomAccessFile("hello2.txt", "rw");
		String temp= rf.readLine();
		
		//����˼���ǣ��Ȱ�����Ԫ�ض��浽һ�������У������Ԫ�ز����ظ��ļ��ϡ�
		//Ȼ���ڰ�����Ԫ�ض�ȡ�������ŵ�һ���ַ������У�
		//Ȼ���ڰ��ļ�����һ�飬�����Ĺ����м���

		//����˼���ǣ��Ȱ�����Ԫ�ض��浽һ�������У������Ԫ�ز����ظ��ļ��ϡ�
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
		}//���ϲ��裬���е����Ѿ��浽������


		//�Ѽ����еĵ���ת�浽�ַ�������
		String[] data= new String[hs.size()];
		int[] num= new int[hs.size()];
		int x=0;
		for (Iterator it=hs.iterator();it.hasNext() ; ){
			data[x++]=(String)it.next();
		}
		//�����еĵ���ת�浽�ַ�������


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

		}//ͳ��ÿ�����ʵ�Ƶ�ν���

		
		int x1=0;
		for (int i=0;i<num.length ;i++ ) {
			if (num[i]==1) {
				x1++;
				
			}
		}
		System.out.println("�ܹ���"+num.length+"������.");
		System.out.println("��"+x1+"������ֻ����һ�Ρ�");
		System.out.println("�����ʳ��ֵĴ���Ϊ��");

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