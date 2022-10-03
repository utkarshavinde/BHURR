package pj.db.model;

public class Passengers {

private String name;
private String gender;
private int age;
private String email;
private Long phone;
private int psg;
private String doj;
private String source;
private String destination;
private int BusNo,fare;
private String BusName,BusTime,BusHrs;

public int getBusNo() {
	return BusNo;
}
public void setBusNo(int busNo) {
	BusNo = busNo;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public int getPsg() {
	return psg;
}
public void setPsg(int psg) {
	this.psg = psg;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
public String getBusName() {
	return BusName;
}
public void setBusName(String busName) {
	BusName = busName;
}
public String getBusTime() {
	return BusTime;
}
public void setBusTime(String busTime) {
	BusTime = busTime;
}
public String getBusHrs() {
	return BusHrs;
}
public void setBusHrs(String busHrs) {
	BusHrs = busHrs;
}
@Override
public String toString() {
	String result = "\n Bus No = " +this.getBusNo()
					+"\n Name = " +this.getName()
					+ "\n Mobile No = " +this.getPhone()
					+"\n Date of Journey = " +this.getDoj()
					+"\n No.of Passengers = " +this.getPsg()
					+"\n Source = " +this.getSource()
					+"\n Destination = " +this.getDestination()
					+"\n Bus Name = " +this.getBusName()
					+"\n Bus Time = " +this.getBusTime()
					+"\n Journey Hours = " +this.getBusHrs()
					+"\n Total Fare = " +this.getFare()*this.getPsg();
	return result;
}


}
