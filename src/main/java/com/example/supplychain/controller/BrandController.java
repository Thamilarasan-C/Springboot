package com.example.supplychain.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.supplychain.model.Brand;
import com.example.supplychain.service.BrandServiceInterface;

@RestController
@RequestMapping(path = "brand")
public class BrandController {

    @Autowired
    private BrandServiceInterface service;

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception e) {
        return new ResponseEntity<>("throws exception", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/test")
    public ResponseEntity<String> get() throws Exception {
        // throw new Exception();
        return new ResponseEntity<String>("In Brand", HttpStatus.OK);
    }

    // create and save the Brand
    @PostMapping("/save")
    public ResponseEntity<Brand> insertBrand(@RequestBody Brand brand) {
        Brand b = service.saveData(brand);
        if (b != null)
            return new ResponseEntity<Brand>(b, HttpStatus.CREATED);
        return new ResponseEntity<Brand>(new Brand(), HttpStatus.NOT_ACCEPTABLE);

    }

    @PostMapping("/{id}/saveImage")
    public ResponseEntity<String> insertBrandImage(@PathVariable String id, @RequestParam("image") MultipartFile file) {
        String result = service.updateImagePath(id, file);
        if (result.equals("Image saved"))
            return new ResponseEntity<String>(result, HttpStatus.CREATED);
        return new ResponseEntity<String>(result, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}/deleteImage/{imagename}")
    public ResponseEntity<String> deleteBrandImage(@PathVariable String id, @PathVariable String imagename) {
        service.deleteImagePath(id, imagename);
        return new ResponseEntity<String>("image deleted", HttpStatus.OK);
    }

    @GetMapping("/{id}/getImage/")
    public ResponseEntity<byte[]> getBrandImage(@PathVariable String id) throws Exception {
        return new ResponseEntity<byte[]>(service.getImage(id), HttpStatus.CREATED);
    }

    // select all Brand
    @GetMapping("/select/all")
    public ResponseEntity<List<Brand>> selectAll() {
        List<Brand> brands = service.getAllBrand();
        if (brands == null) {
            return new ResponseEntity<>(new ArrayList<Brand>(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    // select Brand by id;
    @GetMapping("/select/{id}")
    public ResponseEntity<Brand> selectById(@PathVariable("id") String id) {
        try {
            Brand brand = service.getById(id);
            if (brand == null) {
                return new ResponseEntity<>(new Brand(), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(brand, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new Brand(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // update the Brand;
    @PutMapping("update")
    public ResponseEntity<Brand> updateBrand(@RequestBody Brand brand) {
        try {
            if (service.getById(brand.get_id()) != null)
                return new ResponseEntity<Brand>(service.updateBrand(brand), HttpStatus.OK);
            return new ResponseEntity<Brand>(new Brand(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Brand>(new Brand(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteBrand(@PathVariable String id) {
        try {
            if (service.getById(id) != null)
                return new ResponseEntity<String>(service.deleteData(id), HttpStatus.OK);
            return new ResponseEntity<String>("Id not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Internal error", HttpStatus.BAD_REQUEST);
        }
    }
}
