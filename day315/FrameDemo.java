import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.util.Date;
class FrameDemo
{
	public static void main(String[] args) 
	{
		//定义该图形中所需的组件的引用。
		//开mpv时caps lock键切换输入法就失败。

		Frame frame = new Frame("my frame ");
		frame.addWindowListener(new MyWindowListener());

		Button button = new Button("click me");
		button.addActionListener(new MyListener());
		//第一行创建只添加标题的，第二行才在里面添加 new 监听器

		//把button添加到frame上去
		frame.add(button);


		frame.setSize(200,200);
		frame.setLocation(200,200);
		//button.setSize(50,50);
		frame.setVisible(true);//方法都是第一个单词小写的，类名是每个单词首字母都大写

	}
}

class MyWindowListener implements WindowListener
{
	@Override
	public void windowOpened(WindowEvent e)
	{

	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.out.println("关闭窗口");
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e)
	{

	}

	@Override
	public void windowIconified(WindowEvent e)
	{

	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{

	}

	@Override
	public void windowActivated(WindowEvent e)
	{

	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{

	}



}


class MyListener implements ActionListener 
{
	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	{
		//这三个是读取时间，打印时间相关联的，要一块记住
		//
		long milliSeconds = e.getWhen();
		Date date = new Date(milliSeconds);
		System.out.println(date.toLocaleString());
		System.out.println("hahah");
	}
}











