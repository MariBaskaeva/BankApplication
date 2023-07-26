package ru.baskaeva.bankapplication.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.baskaeva.bankapplication.services.OperationService;

@RequiredArgsConstructor
@RestController
public class OperationController {
    @Autowired
    private final OperationService service;


}
