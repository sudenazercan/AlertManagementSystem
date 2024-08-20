package com.example.AlertManagement.controller;

import com.example.AlertManagement.model.Tags;
import com.example.AlertManagement.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tags")
public class TagsController {

    private final TagsService tagsService;

    @Autowired
    public TagsController(TagsService tagsService) {
        this.tagsService = tagsService;
    }

    @GetMapping
    public List<Tags> getAllTags() {
        return tagsService.getAllTags();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tags> getTagsById(@PathVariable Long id) {
        Optional<Tags> tags = tagsService.getTagsById(id);
        return tags.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tags createTags(@RequestBody Tags tags) {
        return tagsService.saveTags(tags);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTags(@PathVariable Long id) {
        tagsService.deleteTags(id);
        return ResponseEntity.noContent().build();
    }
}