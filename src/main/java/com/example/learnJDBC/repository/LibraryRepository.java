package com.example.learnJDBC.repository;

import com.example.learnJDBC.DTO.AddLibraryDTO;
import com.example.learnJDBC.entity.Libraries;

import java.util.List;

public interface LibraryRepository {

    List<Libraries>getAll();

    Libraries getByIndex(Long id);

    Libraries addLibrary(AddLibraryDTO addLibraryDTO);
}
