import java.io.IOException;
import java.io.RandomAccessFile;
public class SeekLetter
{
	public static void main(String[] args)throws Exception {
		RandomAccessFile rf = new RandomAccessFile("hello.txt","rw");
		System.out.println("全文共有"+rf.length()+"字节");
		int[] array = new int[128];
		for (int i=0;i<rf.length() ;i++ ) {
			int j = rf.readByte();
			array[j]++;
		}
		int[] array1 = new int[26];
		int total=0,single=0,all=0;
		for (int i=0;i<26 ;i++ ) {
			array1[i]=array[i+65]+array[i+97];
			if(array1[i]!=0)
				total++;
			if(array1[i]==1)
				single++;
		}
		System.out.print("全文中共出现了"+total+"个单词，");
		System.out.println("其中有"+single+"个单词只出现了一次。");
		System.out.println("每个单词出现的频率如下：");
		for(int i=0;i<26;i++){
			all=all+array1[i];
		}
		System.out.println("单词的总数量为："+all);
		int[] sortedArray =(int[])array1.clone();bubbleSort(sortedArray);
		for(int i=0;i<26;i++){
			for(int j=0;j<26;j++){
				if(array1[j]==sortedArray[i]&&array1[j]!=-1){
					char c=(char)(j+97);
					System.out.println(c+":"+(float)array1[j]/all+"(共"+array1[j]+"个)");
					array1[j]=-1;
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
            if(numbers[j] < numbers[j+1])  //交换两数位置
            {
            temp = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
            }
        }
        }
    }
}