package com.tw.parade.control;

import com.tw.CarParadeApi;
import com.tw.entity.BackMessage;
import com.tw.parade.feigns.ParadeFeign;
import com.tw.service.CarRegisteredApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ParadeController implements CarParadeApi {
    @Autowired
    private ParadeFeign paradeFeign;

    public BackMessage Parade_login(String user, String password) {
        return paradeFeign.Registered_login(user,password);
        //return new BackMessage(1,"null",null);
    }
}
