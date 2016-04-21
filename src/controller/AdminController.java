package controller;

import com.google.gson.Gson;
import entity.JiedaoEntity;
import entity.ShequEntity;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.JiedaoService;
import service.ShequService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dingyunxiang on 16/4/19.
 */

@Controller
@RequestMapping(value="/*")
public class AdminController {

    @Autowired
    private JiedaoService jiedaoService;

    @Autowired
    private UserService userService;

    @Autowired
    private ShequService shequService;


    Gson gson = new Gson();



    @RequestMapping(value="jiedaoAdd.form")
    public String jiedao(HttpServletRequest request, JiedaoEntity jiedao){
        return "admin/admin";
    }


    //登录模块
    @ResponseBody
    @RequestMapping("login.form")
    public Map<String, Object> login(HttpServletRequest request,  UserEntity user){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if(userService.login(user)) {
            modelMap.put("result","success");
            return modelMap;
        }
        else {
            modelMap.put("result", "fail");
            return modelMap;
        }
    }


    //社区模块
    @RequestMapping("addCommunity.form")
    public String addCommunity(HttpServletRequest request, ShequEntity shequ){
        try{
            shequService.addShequ(shequ);
            return "community";
        }catch(Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    @RequestMapping("delCommunity.form")
    public String delCommunity(HttpServletRequest request, ShequEntity shequ){
        try{
            shequService.delShequ(shequ);
            return "community";
        }catch(Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    @RequestMapping("updateCommunity.form")
    public String updateCommunity(HttpServletRequest request, ShequEntity shequ){
        try{
            shequService.updateShequ(shequ);
            return "community";
        }catch(Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

}
