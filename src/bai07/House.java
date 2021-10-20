package bai07;

//Buider Design Patter
//Giải quyết bài toán gặp 1 loại dữ liệu lúc có lúc ko trên 1 tập attribute
//Dùng Builder Design Pattern ở tầng Runner
public class House {

    //private int mainDoor =1;
    //private String color = "White";
    //private String topRoof = "Ngoi";

    //contructor ko có đối số: lấy toàn bộ giá trị default
    //public House() {
    //}

    //muốn khởi tạo để thay đổi maiDoor
    //public House(int mainDoor) {
    //this.mainDoor = mainDoor;
    //}

    //Contructor có đầy đủ các đối số
    //public House(int mainDoor, String color, String topRoof) {
    //this.mainDoor = mainDoor;
    //this.color = color;
    //this.topRoof = topRoof;
    //}


    private final boolean hasOngKhoi;
    private final String color;

    private House(Builder builder) {
        this.hasOngKhoi = builder.hasOngKhoi;
        this.color = builder.color;
    }

    //hàm build 1 house mặc định
    public void buildHouse() {
        System.out.println("Build the house with ong khoi:" + this.hasOngKhoi);

        if (this.color == null){
            System.out.println("Build the house with color: Blue");
        }else {
            System.out.println("Build the house with color:" + this.color);

        }
    }

    //Inner Class
    //Đây là đội đi lấy thông tin về cho đội Builder
    public static class Builder {
        //ở Builder có j thì ở đây có đó để đi lấy đúng thông tin về nói lại Builder
        private boolean hasOngKhoi;
        private String color;


        Builder() {

        }

        //kiểu trả về  = Builder
        //Thông tin dc đi lấy về
        public Builder hasOngKhoi(boolean hasOngKhoi) {
            this.hasOngKhoi = hasOngKhoi;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        //Sau khi lấy dc thông tin thì sẽ build ra 1 nhà mới như yêu cầu
        public House build(){
            return new House(this);
        }
    }
}
