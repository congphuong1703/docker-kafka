package com.cmcglobal.resourcemanagement.app.responses.base;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
@Builder
public class Metadata {

    private int page;
    private int size;
    private int totalPage;
    private long total;

    private static Metadata build(Page page) {
        return Metadata.builder()
                .page(page.getNumber())
                .size(page.getSize())
                .totalPage(page.getTotalPages())
                .total(page.getTotalElements())
                .build();
    }
}
