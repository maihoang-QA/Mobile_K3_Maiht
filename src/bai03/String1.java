package bai03;
import java.lang.String;
public class String1 {

    public static void main(String[] args) {
        //Khi so sánh chuỗi String dùng equal
        String s1= "Cat";
        //String s2 = "Cat";
        //String s3 = new String("Cat");
        //System.out.println(s1.equals(s2));
    }
    //Khi làm vs chuỗi gốc gán lại giá trị thì chuỗi gốc ko bh thay đổi
    // nó sẽ sinh ra 1 chuỗi mới cho mình

   java.lang.String myPasswordStr = "123myPassword";
    char[] myCharacters = myPasswordStr.toCharArray();


    //SubString, indexOf..., split
    java.lang.String url = "https://google.com";

    //existence of Character
    //url.indexOf("x"); //ko có trong chuỗi trả về số < 0
    //url.indexOf("m");//trả về index của m trong chuỗi
    //url.indexOf("com"); //trả về index của ký tự đầu tiên của từ

    //Sub-string
    String domainName = url.substring(8, url.length());
    //lấy bắt đầu từ vị trí index 8 -> vị trí lenght


    //Split: chặt chuỗi ra theo 1 quy luật gì đó
    String[] splitStr = url.split("");
    //split mà ko đưa quy luật gì bên trong nó sẽ in từng chữ ra

    String[] splitStr1 = url.split("://");
    //sẽ in ra 2 chuỗi là https và google.com

    //Regular Expression
    String myCookTimes = " 105 mins      ";
    //in ra sẽ = 105
    String getMyCookTimes = myCookTimes.replaceAll("[^0-9]", "");
    //tất cả những gì thuộc ký tự từ 0-9 sẽ đem thay thế bằng ""
    //chuyển từ chuỗi sang số
    int myCookTimeInt = Integer.parseInt(myPasswordStr);

    //Concat: nối 2 chuỗi
    String prefix = "Hello ";
    String postfix = "World!!";
    String completeGreetingStr = prefix.concat(postfix).concat("!");
    //sẽ in ra dc Hello World!


    //baitap
    //bai1:
    //string: "2hrs and 5 minutes"
    //Hãy tính tổng thời gian theo phút

    //bai 2:
    //String myPassword = "password123";
    //cho user nhập đúng 3 lần, k đúng thì out chương trình hay pải chờ j đó

    //bai3:
    //String myStr = "100 minutes";
    //ko được dùng regular phải cho ra output = 100
    // cho "12345n678"-> cho ra "12345678"

    //bai4:
    //String url = "https://google.com";
    //kiểm tra là http hay https, domain name là j, .com hay là .net

    //đếm số loại ký tự
    String getMyPasswordStr = "123myPassword";
    char[] myCharacter = myPasswordStr.toCharArray();
    int totalDigits = 0;
    int totalUpperCase = 0;
    int totalLowerCases = 0;

    //for(char character : myCharacters){
        //if (Character.isDigit(character));
        //totalDigits++;
        //nếu character là số thì tổng số digit tăng lên 1

        //if (Character.isUpperCase(character))
            //totalUpperCase++;
        //if (Character.isLowerCase(character))
            //totalLowerCases++;
    }
    //if(totalDigits == 0 || totalLowerCases == 0|| totalUpperCase==0){
        //System.out.println ("Incorrect password");
            //}else{
            //System.out.println ("You are all set");

            //}












