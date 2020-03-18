/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cz.covid.po.api.generated.controller;

import cz.covid.po.api.generated.dto.ExposureRequest;
import cz.covid.po.api.generated.dto.SimtompsRequest;
import cz.covid.po.api.generated.dto.TestingPlaceInstuctionsDto;
import cz.covid.po.api.generated.dto.TestingPlaceRequest;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "HealthCheckController", description = "the HealthCheckController API")
public interface HealthCheckControllerApi {

    Logger log = LoggerFactory.getLogger(HealthCheckControllerApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Fills exposure form", nickname = "personsPersonUidHealthCheckExposurePut", notes = "", authorizations = {
        @Authorization(value = "apiKey")
    }, tags={ "health-check-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/persons/{personUid}/health-check/exposure",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Void> _personsPersonUidHealthCheckExposurePut(@ApiParam(value = "Unique Person's ID (person_uid.person)",required=true) @PathVariable("personUid") UUID personUid,@ApiParam(value = "Health check's data - exposure" ,required=true )  @Valid @RequestBody ExposureRequest exposureDto) {
        return personsPersonUidHealthCheckExposurePut(personUid, exposureDto);
    }

    // Override this method
    default ResponseEntity<Void> personsPersonUidHealthCheckExposurePut(UUID personUid,ExposureRequest exposureDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default HealthCheckControllerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Fills actual health check form", nickname = "personsPersonUidHealthCheckSymptomsPut", notes = "", authorizations = {
        @Authorization(value = "apiKey")
    }, tags={ "health-check-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/persons/{personUid}/health-check/symptoms",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Void> _personsPersonUidHealthCheckSymptomsPut(@ApiParam(value = "Unique Person's ID (person_uid.person)",required=true) @PathVariable("personUid") UUID personUid,@ApiParam(value = "Health check's data - simptoms" ,required=true )  @Valid @RequestBody SimtompsRequest simptomsDto) {
        return personsPersonUidHealthCheckSymptomsPut(personUid, simptomsDto);
    }

    // Override this method
    default ResponseEntity<Void> personsPersonUidHealthCheckSymptomsPut(UUID personUid,SimtompsRequest simptomsDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default HealthCheckControllerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Fills testing place form", nickname = "personsPersonUidHealthCheckTestingPlacePut", notes = "", response = TestingPlaceInstuctionsDto.class, authorizations = {
        @Authorization(value = "apiKey")
    }, tags={ "health-check-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = TestingPlaceInstuctionsDto.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/persons/{personUid}/health-check/testing-place",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<TestingPlaceInstuctionsDto> _personsPersonUidHealthCheckTestingPlacePut(@ApiParam(value = "Unique Person's ID (person_uid.person)",required=true) @PathVariable("personUid") UUID personUid,@ApiParam(value = "Health check's data - testing place" ,required=true )  @Valid @RequestBody TestingPlaceRequest testingPlaceDto) {
        return personsPersonUidHealthCheckTestingPlacePut(personUid, testingPlaceDto);
    }

    // Override this method
    default ResponseEntity<TestingPlaceInstuctionsDto> personsPersonUidHealthCheckTestingPlacePut(UUID personUid,TestingPlaceRequest testingPlaceDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"address\" : {    \"city\" : \"city\",    \"street\" : \"street\",    \"street_number_evidence\" : \"street_number_evidence\",    \"street_number_descriptive\" : \"street_number_descriptive\",    \"zip_code\" : \"zip_code\"  },  \"openingHours\" : \"openingHours\"}", TestingPlaceInstuctionsDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default HealthCheckControllerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
