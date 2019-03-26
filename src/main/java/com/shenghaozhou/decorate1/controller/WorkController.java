package com.shenghaozhou.decorate1.controller;

import com.shenghaozhou.decorate1.entity.Work;
import com.shenghaozhou.decorate1.repository.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/w")
public class WorkController {
    private final WorkMapper workMapper;

    @Autowired
    public WorkController(WorkMapper workMapper) {
        this.workMapper = workMapper;
    }

    @RequestMapping("/banner")
    @ResponseBody
    public List<Work> showBanner() {
        return workMapper.getBanner();
    }

    @RequestMapping("/sampleWorks")
    @ResponseBody
    public List<Work> showSampleWorks() {
        return workMapper.findSampleWorks();
    }

    @RequestMapping("/moreSampleWorks")
    @ResponseBody
    public List<Work> showMoreSampleWorks() {
        return workMapper.findMoreSampleWorks();
    }

    @RequestMapping("/worksByStyle")
    @ResponseBody
    public List<Work> showWorksByStyle(String style) {
        return workMapper.findWorksByStyle(style);
    }

    @RequestMapping("/worksByAuthor")
    @ResponseBody
    public List<Work> showWorksByAuthor(Long authorId) {
        return workMapper.findWorksByAuthor(authorId);
    }
}
