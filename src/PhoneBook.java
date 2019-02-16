import java.util.ArrayList;

public class PhoneBook extends Phone {
    ArrayList<KhuonMau> listPhone;

    public PhoneBook(ArrayList<KhuonMau> listPhone) {
        this.listPhone = listPhone;
    }

    public void insertPhone(String name, String phone) {
          listPhone.add(new KhuonMau(name,phone));
    }

    @Override
    void removePhone(String name) {
        for(int i = 0 ; i<listPhone.size();i++){
            if(name.equals(listPhone.get(i).name)){
                listPhone.remove(listPhone.get(i));
                System.out.println("Xoá thành công thanh niên "+name);
            }
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (int i = 0; i < listPhone.size(); i++) {
           if(name.equals(listPhone.get(i).name)){
               listPhone.get(i).phone=newphone;
               System.out.println("Thay đổi thành công ");
           }
        }
    }

    @Override
    void searchPhone(String name) {
        for (int i = 0; i < listPhone.size(); i++) {
            if(name.equals(listPhone.get(i).name)){
                System.out.println(listPhone.get(i).phone);
            }
        }
    }

    @Override
    void sort() {
    }

    public void getData() {
        for (int i = 0; i < listPhone.size(); i++) {
            System.out.println(listPhone.get(i).name);
        }
    }
}
