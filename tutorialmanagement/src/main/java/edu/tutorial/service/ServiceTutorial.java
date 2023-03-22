package edu.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import edu.tutorial.entity.Tutorial;
import edu.tutorial.repository.TutorialRepository;

@Service
public class ServiceTutorial {

	@Autowired
	private TutorialRepository tutorialRepository;
	
	public List<Tutorial> getTutorialByTitle(String title) {
        return tutorialRepository.findByTitleContaining(title);
    }
}
