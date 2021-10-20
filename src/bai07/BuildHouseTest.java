package bai07;

public class BuildHouseTest {
    public static void main(String[] args) {
        //build 1 cái nhà lấy toàn bộ thông tin ống khói + color mà đội Builder cung cấp
        //muốn 1 cái nhà mới thì nói chuyện vs builder là có ống khói + color-> xong xuôi build sẽ trả về 1 kiểu House
        House house1 = new House.Builder().hasOngKhoi(true).color("Black").build();
        House house2 = new House.Builder().hasOngKhoi(false).color("white").build();
        //nhà bình thường
        House house3 = new House.Builder().build();
//3 kiểu House gọi là Immutable Object: ko thay đổi dc giá trị nữa
        // tương tự việc hợp đồng xây dựng đã ký thì k thay đổi dc, đội Builder xây như hợp đồng
        house1.buildHouse();
        house2.buildHouse();
        house3.buildHouse();


    }


}
