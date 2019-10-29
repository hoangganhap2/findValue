import java.util.Scanner;

public class findValue {
    public static void main(String[] args) {
        String[] student={"Hoàng","Đức","Nam","Tùng","Dư","Hậu","Quý","Bách","Hiếu","Bảo"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập tên học sinh");
        String input_name=scanner.nextLine();

        boolean isExit=false;
        for(int i=0;i<student.length;i++){
            if(student[i].equals(input_name)){
                System.out.println("Position of the student in the list "+ input_name+"is: "+(i+1));
                isExit=true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found"+input_name+" in the list.");
    }
}
