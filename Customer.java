package Entity;

public class Customer {
	public Customer(){}
public int id;
public String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Customer(int id, String name) {
	this.id=id;
	this.name=name;
}
@Override
public boolean equals(Object obj) {
    if(obj==this){
        return true;
    }
    if(obj ==null|| !(obj instanceof Customer)){
        return false;
    }
    Customer c=(Customer)obj;
    return (c.id==this.id);

}

@Override
public int hashCode() {
	
    return id;
}

}
