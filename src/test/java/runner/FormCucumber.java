package runner;

public class FormCucumber {
    private String name;
    private String phone;
    private String dni;
    private String email;
    private String address;
    private String phone2;

    public FormCucumber(){}

    public FormCucumber(String name,String phone,String dni,String email,String address,String phone2){
        this.name=name;
        this.phone=phone;
        this.dni=dni;
        this.email=email;
        this.address=address;
        this.phone2=phone2;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
}
