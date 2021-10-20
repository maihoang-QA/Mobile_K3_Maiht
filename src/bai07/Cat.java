package bai07;

public class Cat {

    //Tất cả các attribute để là private
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    //lấy dc giá trị chứ ko thay đổi dc giá trị
    public String getName() {
        return name;
    }

    //hàm public: Service Method
    public void setName(String name) {
        this.name = name;

    }

    //hàm private: Support Method
    private String adjustName(String name){
        return "Cat:" +name;
    }

}
