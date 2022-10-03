package pj.db.model;

public class Bus {
private int BusNo;
private String source;
private String destination;
private String BusName;
private String time;
private String Bushrs;
private int Fare; 

public int getFare() {
	return Fare;
}
public void setFare(int fare) {
	this.Fare = fare;
}
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
public String getBusName() {
	return BusName;
}
public void setBusName(String busName) {
	BusName = busName;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getBushrs() {
	return Bushrs;
}
public void setBushrs(String bushrs) {
	Bushrs = bushrs;
}
@Override
public String toString() {
	return "Bus Details [\n Bus No = " + BusNo + "\n Source = " + source + "\n Destination = " + destination + "\n Bus Name = " + BusName
			+ "\n Time = " + time + "\n Journey Hours = " + Bushrs + "\n Fare = " + Fare + "]";
}


}
