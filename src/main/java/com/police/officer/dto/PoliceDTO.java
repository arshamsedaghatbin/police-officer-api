package com.police.officer.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.police.domain.Police} entity.
 */
public class PoliceDTO implements Serializable {

    private Long id;

    private String address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PoliceDTO policeDTO = (PoliceDTO) o;
        if (policeDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), policeDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PoliceDTO{" +
            "id=" + getId() +
            ", address='" + getAddress() + "'" +
            "}";
    }
}
