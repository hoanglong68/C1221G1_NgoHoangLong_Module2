package case_study.models.person;

public class Customer extends Person {
    private String idCustomer, typeOfCustomer, address;

    public Customer() {
    }

    public Customer(String idCustomer, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toConvert() {
        return idCustomer + COMMA +
                super.toConvert() + COMMA +
                typeOfCustomer + COMMA +
                address
                ;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                super.toString() +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
