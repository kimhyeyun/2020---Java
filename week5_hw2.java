
public class week5_hw2 {

	public static class Square{
		private String color;
		private int Area;
		
		public Square(){
			this.color="하얀";
			this.Area=1;
		}
		public Square(String color){
			this.color=color;
			this.Area=1;
		}
		public Square(int Area){
			this.Area=Area;
			this.color="하얀";
		}
		public Square(String color, int Area){
			this.color=color;
			this.Area=Area;
		}
		void printSquare() {
			System.out.println("정사각형은 넓이가 "+this.Area+"인 "+this.color+"색 입니다." );
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square("빨강",5);
		Square s2 = new Square("주황");
		Square s3 = new Square(3);
		Square s4 = new Square();
		s1.printSquare();
		s2.printSquare();
		s3.printSquare();
		s4.printSquare();
	}

}
