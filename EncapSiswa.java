
package encapsiswa;


public class EncapSiswa {

    
    public String name ;
    private String address;
    private int age;
    
    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void cetak() {
        System.out.println("Nama\t: "+getName());
        System.out.println("Alamat\t: "+getAddress());
        System.out.println("Umur\t: "+getAge());
        System.out.println();
    }
}
