/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.controller;

import com.pzhu.management.pojo.Merchandise;
import com.pzhu.management.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/merchandise")
public class MerchandiseController {
    @Autowired
    private MerchandiseService merchandiseService;
    @RequestMapping("/selectMerchandise")
    public String selectMerchandise(Model model){
        List<Merchandise> merchandises = merchandiseService.selectMerchandise();
        model.addAttribute("mer",merchandises);
        return "goods-files";
    }
    @RequestMapping("/insertMerchandise")
    public String insertMerchandise(Merchandise merchandise){
        int i = merchandiseService.insertMerchandise(merchandise);
        return "redirect:/merchandise/selectMerchandise";
    }
    @RequestMapping("/deleteMerchandise")
    public String deleteMerchandise(@RequestParam(value ="mid") int id){
        int i = merchandiseService.deleteMerchandise(id);
        return "redirect:/merchandise/selectMerchandise";
    }
    @RequestMapping("/selectMerchandiseByKey")
    public String selectMerchandiseByKey(@RequestParam(value="mid") int id,Model model){
        Merchandise merchandise = merchandiseService.selectMerchandiseByKey(id);
        model.addAttribute("mer",merchandise);
        return "goods-update";
    }
    @RequestMapping("/updateMerchandise")
    public String updateMerchandise(Merchandise merchandise){
        int i = merchandiseService.updateMerchandise(merchandise);
        return "redirect:/merchandise/selectMerchandise";
    }
    @RequestMapping("/selectMerchandiseSelective")
    public String selectMerchandiseSelective(Merchandise merchandise,Model model){
        List<Merchandise> merchandises = merchandiseService.selectMerchandiseSelective(merchandise);
        model.addAttribute("mer",merchandises);
        return "goods-files";
    }
}
