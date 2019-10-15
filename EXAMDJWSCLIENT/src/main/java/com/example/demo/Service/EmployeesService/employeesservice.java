/**
 * EmployeesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.EmployeesService;

public interface EmployeesService extends java.rmi.Remote {
    public com.example.demo.Service.EmployeesService.Employees update(com.example.demo.Service.EmployeesService.Employees arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.EmployeesService.Employees store(com.example.demo.Service.EmployeesService.Employees arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.EmployeesService.Employees getById(long arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.EmployeesService.Employees[] getAll() throws java.rmi.RemoteException;
}
