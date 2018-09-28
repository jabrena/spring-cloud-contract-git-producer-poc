package org.jab.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class BasicController {

    @GetMapping(path="concept1")
    public ConceptReponse getConcept1() throws Exception {
        return new ConceptReponse("OK");
    }

}