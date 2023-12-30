package com.example.supplychain.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.supplychain.model.Brand;

public interface BrandServiceInterface {

    Brand saveData(Brand brand);

    Brand updateBrand(Brand brand);

    String deleteData(String id);

    Brand getById(String id);

    List<Brand> getAllBrand();

    String updateImagePath(String id, MultipartFile file);

    void deleteImagePath(String id, String imagename);

    byte[] getImage(String id) throws IOException;

}
