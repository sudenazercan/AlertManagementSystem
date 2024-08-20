package com.example.AlertManagement.service;

import com.example.AlertManagement.model.Tags;
import com.example.AlertManagement.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagsService {

    private final TagsRepository tagsRepository;

    @Autowired
    public TagsService(TagsRepository tagsRepository) {
        this.tagsRepository = tagsRepository;
    }

    public List<Tags> getAllTags() {
        return tagsRepository.findAll();
    }

    public Optional<Tags> getTagsById(Long id) {
        return tagsRepository.findById(id);
    }

    public Tags saveTags(Tags tags) {
        return tagsRepository.save(tags);
    }

    public void deleteTags(Long id) {
        tagsRepository.deleteById(id);
    }
}