
public class Motor {
	//class parent
	
		private int harga;
		String name="Honda";//default
		
		void namaToko() {//default atau tanpa modifier
			System.out.println("EKA PRIMA");
		}
		public void motor() {
			System.out.println("Motor 1");
		}
		
		public void setharga(int harga){
			this.harga=harga;
		}
		
		public int getharga() {
			return harga;
		}

		public void jenis(){
			System.out.println(name+" Supra");
		}
		protected void beban() {
			System.out.println("20 kg");
		}
		
}
