package Entities;

import Abstract.IEntity;

public class Player implements IEntity{
		int id;
		String firstName;
		String lastName;
		int yearOfBirth;
		String nationalityId;
		
		public Player() {
			
		}
		
		public Player(int id, String firstName, String lastName, int yearOfBirth, String nationalityId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.yearOfBirth = yearOfBirth;
			this.nationalityId = nationalityId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getYearOfBirth() {
			return yearOfBirth;
		}

		public void setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
		}

		public String getNationalityId() {
			return nationalityId;
		}

		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}

}