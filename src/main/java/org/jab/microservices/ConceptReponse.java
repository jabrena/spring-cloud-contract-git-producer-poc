package org.jab.microservices;

public class ConceptReponse {

    private final String status;

    public ConceptReponse(String message) {
        this.status = message;
    }

    public String getStatus() {
        return status;
    }
}
