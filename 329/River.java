public class River
{
	public static void main(String[] args) {
		//a野人 b传道士
		int a0=0,b0=0,a1=3,b1=3,boat=1;
		while((a1!=0)&&(b1!=0))
		{
			//boat at right
			//two yeren goto other side
			if (boat==1) {
				
			
			if ((boat==1)&&(a1>=2)&&((a0+2)<=b0)&&((a1-2)<=b1)) {
				a0=a0+2;a1=a1-2;boat=0;
				System.out.println("two yeren right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((boat==1)&&(a1>=2)&&((a0+2)>b0)&&(b0==0)) {
				a0=a0+2;a1=a1-2;boat=0;
				System.out.println("two yeren right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//two chuanjiaoshi goto other side
			if ((boat==1)&&(b1>=2)&&(a0<=(b0+2))&&(a1<=(b1-2))) {
				b0=b0+2;b1=b1-2;boat=0;
				System.out.println("two chuanjiaoshi right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((boat==1)&&(b1>=2)&&(a1>(b1-2))&&((b1-2)==0)) {
				b0=b0+2;b1=b1-2;boat=0;
				System.out.println("two chuanjiaoshi right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//a yeren a chuanjiaoshi goto other side
			if ((boat==1)&&(a1>=1)&&(b1>=1)&&(a0<=b0)&&(a1<=b1)) {
				a0=a0+1;b0=b0+1;a1=a1-1;b1=b1-1;boat=0;
				System.out.println("a yeren a chuanjiaoshi right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//a yeren goto other side
			if ((boat==1)&&(a1>=1)&&((a0+1)<=b0)&&((a1-1)<=b1)) {
				a0=a0+1;a1=a1-1;boat=0;
				System.out.println("a yeren right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((boat==1)&&(a1>=1)&&((a0+1)>b0)&&(b0==0)) {
				a0=a0+1;a1=a1-1;boat=0;
				System.out.println("a yeren right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//a chuanjiaoshi goto other side
			if ((boat==1)&&(b1>=1)&&(a0<=(b0+1))&&(a1<=(b1-1))) {
				b0=b0+1;b1=b1-1;boat=0;
				System.out.println("a chuanjiaoshi right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((boat==1)&&(b1>=1)&&(a1>(b1-1))&&((b1-1)==0)) {
				b0=b0+1;b1=b1-1;boat=0;
				System.out.println("a chuanjiaoshi right to left");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			}

			//boat at left
			//a yeren goto other side
			if (boat==0) {
				
			
			if ((a0>=1)&&((a0-1)<=b0)&&((a1+1)<=b1)) {
				a0=a0-1;a1=a1+1;boat=1;
				System.out.println("a yeren left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((a0>=1)&&((a1+1)>b1)&&(b1==0)) {
				a0=a0-1;a1=a1+1;boat=1;
				System.out.println("a yeren left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//a chuanjiaoshi goto other side
			if ((b0>=1)&&(a0<=(b0-1))&&(a1<=(b1+1))) {
				b0=b0-1;b1=b1+1;boat=1;
				System.out.println("a chuanjiaoshi left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((b0>=1)&&(a0>(b0-1))&&((b0-1)==0)) {
				b0=b0-1;b1=b1+1;boat=1;
				System.out.println("a chuanjiaoshi left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//a chuanjiaoshi a yeren goto other side
			if ((a0>=1)&&(b0>=1)&&(a0<=b0)&&(a1<=b1)) {
				a0=a0-1;b0=b0-1;a1=a1+1;b1=b1+1;boat=1;
				System.out.println("a chuanjiaoshi a yeren left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//two yeren goto other side
			if ((a0>=2)&&((a0-2)<b0)&&((a1+2)<=b1)) {
				a0=a0-2;a1=a1+2;boat=1;
				System.out.println("two yeren left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((a0>=2)&&((a1+2)>b1)&&(b1==0)) {
				a0=a0-2;a1=a1+2;boat=1;
				System.out.println("two yeren left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			//two chuanjiaoshi goto other side
			if ((b0>=2)&&(a0<=(b0-2))&&(a1<=(b1+2))) {
				b0=b0-2;b1=b1+2;boat=1;
				System.out.println("two chuanjiaoshi left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			if ((b0>=2)&&(a0>(b0-2))&&((b0-2)==0)) {
				b0=b0-2;b1=b1+2;boat=1;
				System.out.println("two chuanjiaoshi left to right");
				System.out.println("left yeren chuanjiaoshi:"+a0+" "+b0+"right:"+a1+" "+b1);
			}
			}
		}
		System.out.println("a1:"+a1+",  "+"b1:"+b1+",  "+"boat:"+boat);
	}
}










