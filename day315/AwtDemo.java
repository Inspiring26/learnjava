import java.awt.*;
class FrameDemo{
	public static void main(String[] args) {
		Frame f = new Frame("my awt");
		f.setSize(500,700);
		f.setLocation(300,200);
		f.setLayout(new FlowLayout());//这点有点奇怪

		Button b = new Button("按钮");
		f.add(b);

		f.setVisible(true);
	}
}