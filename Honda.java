
public class Honda extends Motor{//subclass dari Motor
	public void motor() {
		System.out.println("Motor 2");
	}
	public void jenis(){
		System.out.println(super.name+" CBR 150");
				
	}
	protected void beban() {
		System.out.println("25 kg");
	}
	public static void main(String[] args) {
		Motor produk= new Motor();
		produk.namaToko();
		produk.motor();
		produk.jenis();
		produk.setharga(6000000);
		System.out.println("Rp "+produk.getharga());
		produk.beban();
		//produk.hasil;// akan error 
		
		Honda merk= new Honda();
		merk.motor();
		merk.jenis();
		merk.setharga(30000000);
		System.out.println("Rp "+merk.getharga());
		merk.beban();
		//merk.hasil;//akan error
	}
	
}
