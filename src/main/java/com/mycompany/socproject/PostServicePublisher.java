/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socproject;

import com.mycompany.socproject.services.PostService;
import jakarta.xml.ws.Endpoint;

public class PostServicePublisher {
    public static void main(String[] args) {
        // URL du service SOAP
        String url = "http://localhost:8081/PostService";
        System.out.println("Service SOAP publié à : " + url);

        // Publier le service
        Endpoint.publish(url, new PostService());
    }
}
