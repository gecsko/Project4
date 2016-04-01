/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.Kathy.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.jokes.JavaJoker;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myEndpoint",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.Kathy.example.com",
    ownerName = "backend.myapplication.Kathy.example.com",
    packagePath=""
  )
)
public class MyEndpoint {

    private JavaJoker joker;

    // constructor
    public MyEndpoint() {
        joker = new JavaJoker();
    }

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "getJokeFromEndPoint")
    public MyBean getJokeFromEndPoint() {
        String joke = joker.getJoke();
        // output object
        MyBean response = new MyBean();
        response.setJoke(joke);

        return response;
    }

}
