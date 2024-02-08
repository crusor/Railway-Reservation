package ReservationApplication;

public class Train {
	private int TrainNo;
	private boolean Ac; 
	private  int capacity;
		 public Train(int TrainNo,boolean Ac,int capacity ){
			this.TrainNo=TrainNo ;
			this.Ac=Ac;
			this.capacity=capacity;
		 }
		 public int getTrainNo() {
			return TrainNo;
			  
		 } 
		public boolean getAc() {
			return Ac;
		}
		public void setAc( boolean Ac) {
			this.Ac = Ac;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		  public void displaytraininfo() {
			  
			  System.out.println("TrainNo"+TrainNo+"Ac"+Ac+"Capacity"+capacity);
		  }
		 
		 

}
