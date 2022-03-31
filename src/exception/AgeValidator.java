package exception;

public class AgeValidator {
	

		public void ageValidate(int age) throws InvalidAgeException {
			if (age>=18) {
				System.out.println("u have right to vote");
			}
			else {
				throw new InvalidAgeException("the age is <18 u have no right to vote");
			}
		}
		
	}


