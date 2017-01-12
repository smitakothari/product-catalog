package com.jlabs.ecomm.service;

import  com.sun.jersey.api.client.Client;
        import com.sun.jersey.api.client.ClientResponse;
        import com.sun.jersey.api.client.WebResource;
        import org.springframework.stereotype.Service;

@Service
public class RailwayEnquiry {

    public void enquiry() {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource("http://api.railwayapi.com/live/train/12903/doj/20170102/apikey/s6puku2t");

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();

        }


    }

}