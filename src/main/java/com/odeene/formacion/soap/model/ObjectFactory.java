//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.20 a las 10:23:25 AM CET 
//


package com.odeene.formacion.soap.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.odeene.formacion.soap.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.odeene.formacion.soap.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAutonomousCommunityRequest }
     * 
     */
    public GetAutonomousCommunityRequest createGetAutonomousCommunityRequest() {
        return new GetAutonomousCommunityRequest();
    }

    /**
     * Create an instance of {@link AutonomousCommunity }
     * 
     */
    public AutonomousCommunity createAutonomousCommunity() {
        return new AutonomousCommunity();
    }

    /**
     * Create an instance of {@link GetAutonomousCommunityResponse }
     * 
     */
    public GetAutonomousCommunityResponse createGetAutonomousCommunityResponse() {
        return new GetAutonomousCommunityResponse();
    }

    /**
     * Create an instance of {@link GetProvinceByAutonomousIdRequest }
     * 
     */
    public GetProvinceByAutonomousIdRequest createGetProvinceByAutonomousIdRequest() {
        return new GetProvinceByAutonomousIdRequest();
    }

    /**
     * Create an instance of {@link GetProvinceByAutonomousIdResponse }
     * 
     */
    public GetProvinceByAutonomousIdResponse createGetProvinceByAutonomousIdResponse() {
        return new GetProvinceByAutonomousIdResponse();
    }

    /**
     * Create an instance of {@link Province }
     * 
     */
    public Province createProvince() {
        return new Province();
    }

    /**
     * Create an instance of {@link GetProvincesRequest }
     * 
     */
    public GetProvincesRequest createGetProvincesRequest() {
        return new GetProvincesRequest();
    }

    /**
     * Create an instance of {@link GetProvincesResponse }
     * 
     */
    public GetProvincesResponse createGetProvincesResponse() {
        return new GetProvincesResponse();
    }

    /**
     * Create an instance of {@link GetCityByProvinceIdRequest }
     * 
     */
    public GetCityByProvinceIdRequest createGetCityByProvinceIdRequest() {
        return new GetCityByProvinceIdRequest();
    }

    /**
     * Create an instance of {@link GetCityByProvinceIdResponse }
     * 
     */
    public GetCityByProvinceIdResponse createGetCityByProvinceIdResponse() {
        return new GetCityByProvinceIdResponse();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

}
