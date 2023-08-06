package com.example.catalogservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
// Null 값의 데이터는 반환 X
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalog {

    private String productId;
    private String productName;
    private Integer unitPrice;
    private Integer stock;
    private Date createdAt;
}
