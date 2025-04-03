package polymorphism;

public class Zoo {

	public static void main(String[] args) {
		Dog rocky = new Dog();
		rocky.fetch();
		rocky.makeSound();
		feed(rocky);
		
		Animal shasha = new Dog();
		shasha.makeSound();
		feed(shasha);
		
		shasha = new Cat();
		shasha.makeSound();
		((Cat) shasha).scratch();
		feed(shasha);
	}
	
	public static void feed(Animal animal) {
		
		if(animal instanceof Dog) {
			System.out.println("Provide dog food");
		}
		else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
		
	}

}
