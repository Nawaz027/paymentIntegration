package com.example.demo.controller;


import com.example.demo.dto.StripeChargeDto;
import com.example.demo.dto.StripeTokenDto;
import com.example.demo.service.StripeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.nonNull;

@RestController
@RequestMapping("/public/stripe")
@AllArgsConstructor
public class StripeApi {

    private final StripeService stripeService;


    @PostMapping("/card/token")
    @ResponseBody
    public StripeTokenDto createCardToken(@RequestBody StripeTokenDto model) {


        return stripeService.createCardToken(model);
    }

    @PostMapping("/charge")
    @ResponseBody
    public StripeChargeDto charge(@RequestBody StripeChargeDto model) {

        return stripeService.charge(model);
    }



}