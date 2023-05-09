package poryectoMartha;

public class MainAM {
	public static void main(String args[]) {
		Motor m=new Motor("12345",1.6,"Nafta");
		Auto auto= new Auto("XYZ456","KIA",34564,"Verde",m);
		System.out.println(auto);
	}
}
