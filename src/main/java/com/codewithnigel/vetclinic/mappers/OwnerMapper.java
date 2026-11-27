package com.codewithnigel.vetclinic.mappers;

import com.codewithnigel.vetclinic.dtos.OwnerDto;
import com.codewithnigel.vetclinic.dtos.RegisterOwnerRequest;
import com.codewithnigel.vetclinic.entities.Owner;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring") // makesMapstruct's generated class a spring bean so I can inject it
                                   // into my service/controller instead of creating it
public interface OwnerMapper {

    // OUTGOING: entity -> response DTO. ( make sure the data leaving is safe)
    // Used after you load or save an Owner, to send it back to the client.
    // MapStruct copies every field with a matching name (id, firstName, email...)
    // and skips fields OwnerDto doesn't have, like pets and updatedAt.
    OwnerDto OwnerDto(Owner owner);

    // INCOMING: request DTO -> entity. (this is to update the Entity)
    // Used when a POST comes in. The client's JSON becomes a RegisterOwnerRequest,
    // and this turns it into an Owner you can save with the repository.
    // id, createdAt and pets stay empty; the database and @PrePersist fill those in.
    Owner toEntity(RegisterOwnerRequest request);

}
