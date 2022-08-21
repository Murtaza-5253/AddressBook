package AddressBook;

public class Contacts
{
    private String firstName;
    private String lastName;
    private String mobNum;
    private String emailID;
    private String address;
    private String city;
    private String state;
    private String pinCode;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setMobNum(String mobNum){
        this.mobNum = mobNum;
    }

    public String getMobNum(){
        return mobNum;
    }

    public void setEmailID(String emailID){
        this.emailID = emailID;
    }

    public String getEmailID(){
        return emailID;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }

    public String getPinCode(){
        return pinCode;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobNum='" + mobNum + '\'' +
                ", emailID='" + emailID + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
