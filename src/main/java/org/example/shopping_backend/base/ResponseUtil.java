package org.example.shopping_backend.base;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ResponseUtil {

    public static ResponseEntity<RestData<?>> success(Object data){
        RestData<?> restData = new RestData<>("success", data);
        return ResponseEntity.ok(restData);
    }

    public static ResponseEntity<RestData<?>> error(HttpStatus status, List<String> message){
        RestData<?> restData = new RestData<>("error", message);
        return new ResponseEntity<>(restData, status);
    }
}
