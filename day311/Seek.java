import java.io.IOException;
import java.io.RandomAccessFile;
public class Seek
{
	public static void main(String[] args)throws Exception
	{
		RandomAccessFile rf = new RandomAccessFile("hello2.txt", "rw");
		


		System.out.println("ȫ�Ĺ���"+rf.length()+"���ֽڡ�");
		int[] array = new int[128];
		
		for (int i=0;i<rf.length() ;i++ ) {
			int j = rf.readByte();
			
			array[j]++;	
			
		}
		
		int[] array1 = new int[26];
		int total=0,single=0;int all=0;
		for(int i=0;i<26;i++){	array1[i]=array[i+65]+array[i+97];if(array1[i]!=0)total++;if(array1[i]==1)single++;}
		System.out.print("ȫ���й�������"+total+"����ĸ��");
		System.out.println("������"+single+"����ĸֻ������һ�Ρ�");
		System.out.println("ÿ����ĸ���ֵ�Ƶ�����£�");
		for(int i=0;i<26;i++){all=all+array1[i];}
		System.out.println("��ĸ��������Ϊ��"+all);
		
		int[] sortedArray =(int[])array1.clone();bubbleSort(sortedArray);
		
		for(int i=0;i<26;i++){
			for(int j=0;j<26;j++){
				if(array1[j]==sortedArray[i]&&array1[j]!=-1){
				char c=(char)(j+97);
				//Ϊ�˸��õĿ�����������ݵ���ʽ��ʹ֮������С�������λ���˴�����printf
				System.out.printf("%s:%.4f(��%d��)%n",c,(float)array1[j]/all,array1[j]);
				array1[j]=-1;}
}}

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