//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.20 a las 10:23:25 AM CET 
//


package com.odeene.formacion.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Province complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Province"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autonomyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autonomyArea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Province", propOrder = {
    "provinceId",
    "name",
    "autonomyName",
    "autonomyArea"
})
public class Province {

    protected long provinceId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String autonomyName;
    protected int autonomyArea;

    /**
     * Obtiene el valor de la propiedad provinceId.
     * 
     */
    public long getProvinceId() {
        return provinceId;
    }

    /**
     * Define el valor de la propiedad provinceId.
     * 
     */
    public void setProvinceId(long value) {
        this.provinceId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad autonomyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutonomyName() {
        return autonomyName;
    }

    /**
     * Define el valor de la propiedad autonomyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutonomyName(String value) {
        this.autonomyName = value;
    }

    /**
     * Obtiene el valor de la propiedad autonomyArea.
     * 
     */
    public int getAutonomyArea() {
        return autonomyArea;
    }

    /**
     * Define el valor de la propiedad autonomyArea.
     * 
     */
    public void setAutonomyArea(int value) {
        this.autonomyArea = value;
    }

}
