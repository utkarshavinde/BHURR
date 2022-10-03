package pj.db.model;

public class ShowTicket {
	private int BusNo,psg,fare;
	private long phone;
	private String name,doj,source,destination,BusName,
	BusTime,BusHrs;
	public int getBusNo() {
		return BusNo;
	}
	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	public int getPsg() {
		return psg;
	}
	public void setPsg(int psg) {
		this.psg = psg;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
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
		return "ShowTicket [BusNo=" + BusNo + ", psg=" + psg + ", fare=" + fare + ", phone=" + phone + ", name=" + name
				+ ", doj=" + doj + ", source=" + source + ", destination=" + destination + ", BusName=" + BusName
				+ ", BusTime=" + BusTime + ", BusHrs=" + BusHrs + "]";
	}
}
