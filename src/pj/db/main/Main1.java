package pj.db.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import pj.db.dao.Project1Dao;
import pj.db.model.Bus;
import pj.db.model.Passengers;

public class Main1 {
	public static void main(String[] args) throws IOException {
		Project1Dao projectDao = new Project1Dao();
		Passengers passengers = new Passengers();
		
		Bus bus = new Bus(); 
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		int choice;
		int busno;
		String source,destination;
		String email,name,gender;
		String doj;
		int age,psg;
		Long phone;
		while(true) {
			System.out.println("***************************");
			System.out.println("           BHURR           ");
			System.out.println("***************************");
			System.out.println("1. Search Buses");
			System.out.println("2. Show Ticket");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. Exit");
			System.out.println("***************************");
			System.out.println();
			System.out.print("Enter your choice : " );
			choice = s.nextInt();
			System.out.println();
			if(choice == 4) {
				break;
			}
			else {
				switch(choice) {
				case 1 : // Search buses
						System.out.println("Select Travel Options : ");
						System.out.println("  Mumbai");
						System.out.println("  Nashik");
						System.out.println("  Pune");
						System.out.println("  Ratnagiri");
						System.out.println("  Satara");
						System.out.print("\nEnter Source : ");
						source = s.next();
						System.out.print("Enter Destination : ");
						destination = s.next();
						System.out.print("Enter Date of Journey (dd-mm-yy): ");
						doj = s.next();
						System.out.println();
						bus = projectDao.searchBuses(source,destination);
						if(bus.getSource() != source && bus.getDestination() != destination) {
							System.out.println(bus);
						}
						System.out.print("Do You Want To Book Ticket [Y / N] : ");
						 ch = s.next().charAt(0);
						if(ch == 'Y' || ch == 'y') {
							System.out.print("Enter Bus No : ");
							busno = s.nextInt();	
							System.out.print("Enter Email : ");
							email = s.next();
							System.out.print("Enter Mobile No : ");
							phone = s.nextLong();
							System.out.print("Enter Full Name : ");
							name = br.readLine();
							System.out.print("Enter Gender : ");
							gender = s.next();
							System.out.print("Enter Age : ");
							age = s.nextInt();
							System.out.print("Enter No.of Passenger : ");
							psg = s.nextInt();
							
							boolean result = projectDao.insertRecords(email,phone,name,gender,age,psg,doj,busno);
							if(result) {
								System.out.println("Ticket Confirmation is Successful.");
							}
							else {
								System.out.println("Ticket Confirmation Unsuccessful. ");
							}
							
						}
						else {
							
							System.out.println("***** THANK YOU *****");
							System.out.println();
						}
						
						
						break;
						
				case 2 : // show ticket
						System.out.print("Enter Mobile No : ");
						phone = s.nextLong();
						passengers = Project1Dao.searchByPhone(phone);
						if(passengers.getPhone()!= phone) {
							System.out.println(passengers);
						}
						
						break;
						
				case 3 : // Cancel Ticket
					System.out.println("Enter Mobile No : ");
					phone = s.nextLong();
					try {
						boolean detail = projectDao.deletebyPhone(phone);
						 if(detail)
						    	System.out.println("Ticket Cancellation Successful");
						    else
						    	System.out.println("Ticket Cancellation Unsuccessful");
							
							
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println();
						
						break;
						
				default : System.out.println("Invalid Choice .");
					     break;
				
				}
			}
		}
		

	}

	
}
