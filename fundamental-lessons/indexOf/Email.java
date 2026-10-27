package fundamental-lessons.indexOf;

public class Email {
    
private String address;

public Email(String address) {
    this.address = address;
}

public String toString() {
    return address;
}

public int getAtIndex() {
    return address.indexOf("@")
}

public String getUser() {
    return address.substring(0,getAtIndex())
    
}

public String getDomain() {
    return address.substring(getIndexOf()+1)
}

public boolean isSchool() {

}


}
