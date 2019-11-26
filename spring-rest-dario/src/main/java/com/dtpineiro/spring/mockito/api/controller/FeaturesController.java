package com.dtpineiro.spring.mockito.api.controller;

import com.dtpineiro.spring.mockito.api.dao.FeatureRepository;
import com.dtpineiro.spring.mockito.api.model.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/feature")
public class FeaturesController {
    private static String URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-13&endtime=2019-10-14";
    @Autowired
    FeatureRepository featureRepository;

    @GetMapping("/getSismos")
    public List<Features> getSismos() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Features>> rateResponse =
                restTemplate.exchange("https://bitpay.com/api/rates",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Features>>() {
                        });
        List<Features> featuresList = rateResponse.getBody();
        return featuresList;
    }
}
