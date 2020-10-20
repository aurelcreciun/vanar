package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	private static HumanRepository hr;
	
	public static void main(String[] args) throws SQLException {
		Scanner in = new Scanner(System.in);
		Boolean boolTrue = true;
		
		hr = new HumanRepository();

		while(boolTrue) {
			switch(TUI.printMenu()) {
				case 0 : {
					TUI.Thx();
					return;
				}
				case 1 : {
					ArrayList<Human> people = hr.showAll();
					for(Human human:people) {
						System.out.println(human);
					}
					break;
				}
				case 2 : {					
					hr.save(TUI.readHumanData());
					break;
				}
				case 3 : {
					hr.update(TUI.readHumanData());
					break;
				}
				case 4 : {
					System.out.println("email : ");
					hr.delete(in.next());
					break;
				}
				case 5 : {
					TUI.sendMail(TUI.readHumanData());
					break;
				}		
			}
		}
		in.close();
	}
}
