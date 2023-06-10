package been;

public class Car {
	//atributes
	// khi new object thì ô nhớ heap luôn có đầy đủ các giá trị
        private int id;
        private String name;
        private 
        String model;
        private String color;
        private double ssalesPrice;
		
        
        //default constructore
        // hàm khởi tạo sẽ mất đi khi tạo mới 1 hàm khởi tạo
        public Car() {
        	
        }
        
        
        // constructor withh full parmeters
         public Car(int id, String name, String model, String color, double ssalesPrice) {
			
			this.id = id;
			this.name = name;
			this.model = model;
			this.color = color;
			this.ssalesPrice = ssalesPrice;
		}
         //getter, setter
         // phương thưc cho phep ben ngoài truye cập giá trị của vác thuộc tính private
         // vì sao ko cho thuộc tính public khỏi cần getter, setter
         // c1.id <=> c1.getId();



		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public double getSsalesPrice() {
			return ssalesPrice;
		}


		public void setSsalesPrice(double ssalesPrice) {
			this.ssalesPrice = ssalesPrice;
		}
		@Override
		public String toString() {
			return "Car [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", ssalesPrice="
					+ ssalesPrice + "]";
		}
}
