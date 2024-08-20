package com.example.AlertManagement.service;

import com.example.AlertManagement.model.Scenario;
import com.example.AlertManagement.repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScenarioService {

    private final ScenarioRepository scenarioRepository;

    @Autowired
    public ScenarioService(ScenarioRepository scenarioRepository) {
        this.scenarioRepository = scenarioRepository;
    }

    public List<Scenario> getAllScenarios() {
        return scenarioRepository.findAll();
    }

    public Optional<Scenario> getScenarioById(Long id) {
        return scenarioRepository.findById(id);
    }

    public Scenario saveScenario(Scenario scenario) {
        return scenarioRepository.save(scenario);
    }

    public void deleteScenario(Long id) {
        scenarioRepository.deleteById(id);
    }
}