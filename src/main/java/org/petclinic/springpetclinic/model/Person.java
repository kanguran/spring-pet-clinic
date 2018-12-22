package org.petclinic.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

public class Person {

   @Getter @Setter private String firstName;
   @Getter @Setter private String lastName;

}
