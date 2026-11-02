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
    return address.substring(getIndexOf(@)+1)
}

public boolean isSchool() {
    return getIndexOf("hcvsd.org") != -1;
}

   // ===== CHALLENGE 1 =====
// Method name: getFirstName
// School addresses are formatted first.last@cuny.edu
// Return the first name: the part of the user before the ".".
//     "ana.lee@hcvsd.org" -> "ana"
// Hint: call your helper method getUser() first and store it in a variable.
// Hint: find the "." in that variable, not in address.
// Tools: getUser, indexOf, substring

public String getFirstName() {
    user = getUser();
    return user.substring(0, getIndexOf("."));
}

//===== CHALLENGE 2 =====
// Method name: changeDomain
// Return a new address with the same user but a different domain.
//     "ana@hcvsd.org", "gmail.com" -> "ana@gmail.com"
// Reminder: this method must TAKE IN a parameter (the new domain).
//     What type is it? What will you name it?
// Hint: you don't need indexOf. getUser() already does the cutting.
// Hint: join Strings with +. Don't forget the "@".
// Tools: getUser, +
  
public String changeDomain() {
    newUser = (getUser() + "@gmail.com")
    return newUser
}

// Method name: getLabel
// Label the address as "School" or "Personal", followed by the domain.
//     "ana.lee@hcvsd.org" -> "School: hcvsd.org"
//     "ana99@gmail.com"   -> "Personal: gmail.com"
// Hint: isSchool() already returns true or false, so use it as your condition.
// Hint: every path through the method needs a return.
// Tools: if/else, isSchool, getDomain

public String getLabel() {
    if (isSchool()) {
        return "school: "+ getDomain();
    }
    else {
        return "personal: "+ getDomain();
    }

// ===== CHALLENGE 4 =====
// Method name: isStaffFormat
// Return true only if BOTH are true:
//     1. the full address contains "hcvsd.org"
//     2. the user has a "." in it (first.last format)
//     "ana.lee@hcvsd.org" -> true
//     "ana99@hcvsd.org"   -> false   (no "." in user)
//     "ana.lee@gmail.com" -> false   (not school)
// Rule: do NOT use address or isSchool(). Use toString() to get the full address.
// Hint: toString() returns a String, so you can call indexOf on it.
// Hint: for condition 2, search getUser(), not toString(). Why?
// Hint: two conditions that must both be true -> &&
// Tools: toString, getUser, indexOf, -1, &&

public boolean isStaffFormat() {
    if 
}

}



}
