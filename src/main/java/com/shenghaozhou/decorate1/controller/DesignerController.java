package com.shenghaozhou.decorate1.controller;

import com.shenghaozhou.decorate1.entity.Designer;
import com.shenghaozhou.decorate1.entity.Work;
import com.shenghaozhou.decorate1.repository.DesignerMapper;
import com.shenghaozhou.decorate1.repository.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/d")
public class DesignerController {

    private final DesignerMapper designerMapper;
    private final WorkMapper workMapper;

    @Autowired
    public DesignerController(DesignerMapper designerMapper, WorkMapper workMapper) {
        this.designerMapper = designerMapper;
        this.workMapper = workMapper;
    }

    @RequestMapping("/representative")
    @ResponseBody
    public List<Designer> showRepresentativeDesigners() {
        return designerMapper.findRepresentativeDesigners();
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Designer> showAllDesigners() {
        return designerMapper.findAllDesigners();
    }

    @RequestMapping(value = "/showWorks")
    @ResponseBody
    public List<Work> showDesignerWorks(Long id) {
        return workMapper.findWorksByAuthor(id);
    }

}
