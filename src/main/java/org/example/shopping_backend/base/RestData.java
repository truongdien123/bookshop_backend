package org.example.shopping_backend.base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.shopping_backend.base.RestStatus;
import org.springframework.http.HttpStatus;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestData<T>{
    private RestStatus restStatus;
    private String message;
    private List<String> reasons;
    private T result;


    public RestData(String message, T result) {
        this.restStatus = RestStatus.SUCCESS;
        this.message = message;
        this.result = result;
    }

    public RestData(String message, List<String> reasons) {
        this.restStatus = RestStatus.ERROR;
        this.message = message;
        this.reasons = reasons;
    }

    public RestData(RestStatus restStatus, String message, List<String> reasons, T result) {
        this.restStatus = restStatus;
        this.message = message;
        this.reasons = reasons;
        this.result = result;
    }

    public RestStatus getRestStatus() {
        return restStatus;
    }

    public void setRestStatus(RestStatus restStatus) {
        this.restStatus = restStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
