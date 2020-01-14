package com.gcamargo.feignDemo.model.dto;

import java.io.Serializable;
import java.util.List;

public class PlanetResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long count;
    private String next;
    private String previous;
    private List<PlanetDto> results;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<PlanetDto> getResults() {
        return results;
    }

}
