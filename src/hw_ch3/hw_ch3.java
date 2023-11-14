package hw_ch3;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class hw_ch3{
	public static void main(String[] args) throws IOException{
		/*Car car1=new Car();
		Car car2=new Car(1234,20.5);*/
		/*car1.gas=20.5;
		car1.num=1234;*/
		
		/*Car car2=new Car();
		car2.gas=30.5;
		car2.num=4321;*/
		
		//car1.show();
		
		/*car1.setGas(20.5);
		car1.setNum(1234);*/
		
		//car1.showcar();
		
		//car1.setNumGas(1234, 20.5);
		
		/*car1.setCar(1234);
		car1.show();
		car1.setCar(20.5);
		car1.show();
		car1.setCar(1234,20.5);*/
		/*car1.show();
		car2.show();*/
		/*int num=car1.getNum();
		double gas=car1.getGas();
		System.out.println("車號是"+num+"油量是"+gas);*/
		
		/*String str="hello";
		char ch1=str.charAt(0);
		char ch2=str.charAt(1);
		int len=str.length();
		System.out.println(str+"第1個字元是"+ch1);
		System.out.println(str+"第2個字元是"+ch2);
		System.out.println(str+"的長度是"+len);*/
		
		/*System.out.println("請輸入英文字母");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();*/
		/*String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		System.out.println("大寫:"+stru+"小寫:"+strl);*/
		
		/*System.out.println("請輸入要搜尋的字");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		char ch=str1.charAt(0);
		int num= str1.indexOf(ch);
		if(num !=-1)
			System.out.println(str+"中的"+ch+"在第"+num+"個位置");
		else
			System.out.println(str+"中的沒有"+ch+"這個字");*/
		
		/*System.out.println("請輸入要新增的字");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		StringBuffer sb=new StringBuffer(str);
		sb.append(str1);
		System.out.println(str+'+'+str1+'='+sb);*/
		
		System.out.println("請輸入兩個數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		int ans=Math.max(num1, num2);
		System.out.println(num1+"與"+num2+"較大的是"+ans);
	}
}

class Car{
	public static int sum=0;
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0;
		sum++;
		System.out.println("生產了車子");
	}
	public static void showSum() {
		System.out.println("車子有"+sum+"台");
	}
	
	public Car(int n, double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+this.num+"油量為"+this.gas+"的車子");
	}
	/*public void setNumGas(int n,double g) {
		if(g>0&&g<100) {
			num=n;
			gas=g;
			System.out.println("車號設為"+this.num+"油量設為"+this.gas);
		}
		else {
			System.out.println("錯誤");
		}
	}*/
	
	/*double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
	int getNum() {
		System.out.println("調查車號");
		return num;
	}*/
	
	/*void setNum(int n) {
		num=n;
		System.out.println("車號設為"+this.num);
	}
	void setGas(double g) {
		gas=g;
		System.out.println("油量設為"+this.gas);
	}*/
	
	/*void setCar(int n) {
		num=n;
		System.out.println("車號設為"+this.num);
	}
	void setCar(double g) {
		gas=g;
		System.out.println("油量設為"+this.gas);
	}
	void setCar(int n,double g) {
		gas=g;
		num=n;
		System.out.println("車號設為"+this.num);
		System.out.println("油量設為"+this.gas);
	}*/
	
	/*public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("油量是"+this.gas);
	}*/
	/*void showcar() {
		System.out.println("開始顯示資料");
		show();
	}*/
}