package com.example.generate_code.controller;
import com.example.generate_code.model.RespBean;
import com.example.generate_code.model.TableClass;
import com.example.generate_code.service.GenerateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class GenerateCodeController {
    @Autowired
    GenerateCodeService generateCodeService;


    @PostMapping("/generateCode")
    public RespBean generateCode(@RequestBody List<TableClass> tableClassList, HttpServletRequest req) {
        return generateCodeService.generateCode(tableClassList, req.getServletContext().getRealPath("/"));
    }
}
