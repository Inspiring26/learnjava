//做一个可以运行的程序
import java.awt.*;
import javax.swing.*;

public class AProgram
{
	public static void main(String[] args) {
		//System.out.println("hello world");
		Frame frame = new Frame("胡歌");
		ImageIcon bg = new ImageIcon("12.jpg");
		JLabel label = new JLabel(bg);
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//frame.getLayeredPane().add(label,newInteger(Integer.MIN_VALUE));
		JPanel jp=(JPanel)frame.getContentPane();
		jp.setOpaque(false);//设置透明
        //测试用的JPanel
        JPanel panel=new JPanel(); 
        panel.setOpaque(false);//也要让他透明
        panel.setLayout(null);//为了使用按钮的定位
        JButton button=new JButton("OK");
        button.setSize(100, 20);
        button.setLocation(100, 50);
        panel.add(button);
        frame.add(panel);



		frame.setSize(500,500);
		frame.setVisible(true);

	}
}