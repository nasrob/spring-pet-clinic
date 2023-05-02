package com.nasdev.petclinic.services;

import com.nasdev.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
