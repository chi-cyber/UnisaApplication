<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">
  <display-name>UnisaApplication</display-name>
  <welcome-file-list>
   
  
    <welcome-file>stud.jsp</welcome-file>
    
   
  </welcome-file-list>
<servlet>
  <servlet-name>Student</servlet-name>
  <servlet-class>za.ac.unisa.Student</servlet-class>
  </servlet>
  <servlet-mapping>
  <servlet-name>Student</servlet-name>
  <url-pattern>/student</url-pattern>
  
  </servlet-mapping>
  </web-app>