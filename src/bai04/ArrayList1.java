package bai04;
import java.util.*;


public class ArrayList1 {
    public static void main(String[] args) {
       List myStringList = new ArrayList<>();
        //cách thêm phần tử vào mảng rỗng
        myStringList.add(1);
        myStringList.add("2");

        //Cách in List ra

        for (int elementIndex = 0; elementIndex < myStringList.size();elementIndex++){
            System.out.println(myStringList.get(elementIndex));
        }

        //Nếu khai báo như này thì sẽ k nhét dc số vào
        //List <> myStringList = new ArrayList<>();

        //List<String> myStringList = new ArrayList<>();
        //Đưa vào list trực tiếp
        Integer[] myNumbers ={1,2,3,4};
        List<Integer> myIntList = Arrays.asList(myNumbers);
        //khi khao báo list nên khai báo là List k khai báo là ArrayList

        //Khai báo List với những dữ liệu bị trùng
        Set<String> set = new HashSet<>(11223344);
        //Loại bỏ hết những giá trị trùng và list = (1,2,3,4)
        List<String> listWithoutDupplicateValues = new ArrayList<>(set);

        //Update Value
        myStringList.set(0,"1");
        myStringList.set(2,"3");

        //in ra giá trị list
        //for (String s : myStringList){
            //System.out.println(s);
        //}

        //remove a value from list
        myStringList.remove("4");
    }
}
