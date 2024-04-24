/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtk;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author omkar
 */
@WebService(serviceName = "MtkService")
public class MtkService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "miletokm")
    public double miletokm(@WebParam(name = "miles") double miles) {
        //TODO write your implementation code here:
        return miles*1.60934;
    }

    /**
     * This is a sample web service operation
     */
    
}
