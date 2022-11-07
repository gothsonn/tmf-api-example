/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package dev.rafaelfreitas.api;

import dev.rafaelfreitas.model.PartyAccount;
import dev.rafaelfreitas.model.PartyAccountCreate;
import dev.rafaelfreitas.model.PartyAccountUpdate;
import dev.rafaelfreitas.model.Error;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")

@Validated
@Api(value = "partyAccount", description = "the partyAccount API")
@RequestMapping(value = "/tmf-api/accountManagement/v4/")
public interface PartyAccountApi {

    @ApiOperation(value = "Creates a PartyAccount", nickname = "createPartyAccount", notes = "This operation creates a PartyAccount entity.", response = PartyAccount.class, tags={ "partyAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = PartyAccount.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/partyAccount",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<PartyAccount> createPartyAccount(@ApiParam(value = "The PartyAccount to be created" ,required=true )  @Valid @RequestBody PartyAccountCreate partyAccount);


    @ApiOperation(value = "Deletes a PartyAccount", nickname = "deletePartyAccount", notes = "This operation deletes a PartyAccount entity.", tags={ "partyAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/partyAccount/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePartyAccount(@ApiParam(value = "Identifier of the PartyAccount",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "List or find PartyAccount objects", nickname = "listPartyAccount", notes = "This operation list or find PartyAccount entities", response = PartyAccount.class, responseContainer = "List", tags={ "partyAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PartyAccount.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/partyAccount",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<PartyAccount>> listPartyAccount(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Updates partially a PartyAccount", nickname = "patchPartyAccount", notes = "This operation updates partially a PartyAccount entity.", response = PartyAccount.class, tags={ "partyAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = PartyAccount.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/partyAccount/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.PATCH)
    ResponseEntity<PartyAccount> patchPartyAccount(@ApiParam(value = "Identifier of the PartyAccount",required=true) @PathVariable("id") String id,@ApiParam(value = "The PartyAccount to be updated" ,required=true )  @Valid @RequestBody PartyAccountUpdate partyAccount);


    @ApiOperation(value = "Retrieves a PartyAccount by ID", nickname = "retrievePartyAccount", notes = "This operation retrieves a PartyAccount entity. Attribute selection is enabled for all first level attributes.", response = PartyAccount.class, tags={ "partyAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PartyAccount.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/partyAccount/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<PartyAccount> retrievePartyAccount(@ApiParam(value = "Identifier of the PartyAccount",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}
