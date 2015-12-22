package com.junitSpringTest.controller;

import com.junitSpringTest.model.MiBean;
import com.junitSpringTest.service.Calculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by XI319411 on 17/12/2015.
 */

@Controller
public class Prueba {
    @Autowired
    Calculo calculo;
    @Autowired
    MiBean miBean;

//    @Autowired
//    DataSource ds;



    @RequestMapping("prueba.htm")
    public ModelAndView prueba(HttpServletRequest hsr, HttpServletResponse hs1) throws Exception {


        //MODEL AND VIEW CONFIG
        ModelAndView mv = new ModelAndView("prueba");
        mv.addObject("mensaje","mensaje");
        String nombreBean = miBean.getNombre();

        mv.addObject("nombre",nombreBean);

        //String result = calculo.pollo(a , b);



        //log.debug("se cargara la siguiente vista: --->{}.jsp<---", mv.getViewName());
        return mv;
    }

}