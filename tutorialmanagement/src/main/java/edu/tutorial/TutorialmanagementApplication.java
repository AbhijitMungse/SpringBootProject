package edu.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.tutorial.entity.Tutorial;
import edu.tutorial.exception.TutorialException;
import edu.tutorial.repository.TutorialRepository;

@SpringBootApplication
public class TutorialmanagementApplication implements CommandLineRunner {

	@Autowired
	private TutorialRepository tutorialRepository;

	public static void main(String[] args) {
		SpringApplication.run(TutorialmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws TutorialException {
		Tutorial t1 = new Tutorial("java", "Core Java", false);
		Tutorial t2 = new Tutorial("java","Advance java",false);
		Tutorial t3 = new Tutorial("java","Spring boot with java",false);
		Tutorial t4 = new Tutorial("python","Core python",false);
		Tutorial t5 = new Tutorial("python","Data science with python",false);
		Tutorial t6 = new Tutorial("Python","Machine learning with python",true);
		
		//exception handled if starting of the title contains Capital letter
		if(Character.isUpperCase(t1.getTitle().charAt(0)))
			throw new TutorialException("String contain Capital Letter");
		tutorialRepository.save(t1);
		
		if(Character.isUpperCase(t2.getTitle().charAt(0)))
			throw new TutorialException("String contain Capital Letter");
		tutorialRepository.save(t2);
		
		if(Character.isUpperCase(t3.getTitle().charAt(0)))
			throw new TutorialException("String contain Capital Letter");
		tutorialRepository.save(t3);
		
		if(Character.isUpperCase(t4.getTitle().charAt(0)))
			throw new TutorialException("String contain Capital Letter");
		tutorialRepository.save(t4);
		
		if(Character.isUpperCase(t5.getTitle().charAt(0)))
			throw new TutorialException("String contain Capital Letter");
		tutorialRepository.save(t5);
		
		if(Character.isUpperCase(t6.getTitle().charAt(0)))
			throw new TutorialException("String contain Capital Letter");
		tutorialRepository.save(t6);
		
		System.out.println("--------------------------all saved----------------------");

	}

}
