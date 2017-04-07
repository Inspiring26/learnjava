import java.io.IOException;
import java.io.RandomAccessFile;
public class Seek
{
	public static void main(String[] args)throws Exception
	{
		RandomAccessFile rf = new RandomAccessFile("hello2.txt", "rw");
		


		System.out.println("全文共有"+rf.length()+"个字节。");
		int[] array = new int[128];
		
		for (int i=0;i<rf.length() ;i++ ) {
			int j = rf.readByte();
			
			array[j]++;	
			
		}
		
		int[] array1 = new int[26];
		int total=0,single=0;int all=0;
		for(int i=0;i<26;i++){	array1[i]=array[i+65]+array[i+97];if(array1[i]!=0)total++;if(array1[i]==1)single++;}
		System.out.print("全文中共出现了"+total+"个字母，");
		System.out.println("其中有"+single+"个字母只出现了一次。");
		System.out.println("每个字母出现的频率如下：");
		for(int i=0;i<26;i++){all=all+array1[i];}
		System.out.println("字母的总数量为："+all);
		
		int[] sortedArray =(int[])array1.clone();bubbleSort(sortedArray);
		
		for(int i=0;i<26;i++){
			for(int j=0;j<26;j++){
				if(array1[j]==sortedArray[i]&&array1[j]!=-1){
				char c=(char)(j+97);
				//为了更好的控制输出的数据的形式，使之都保持小数点后四位，此处用了printf
				System.out.printf("%s:%.4f(共%d个)%n",c,(float)array1[j]/all,array1[j]);
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