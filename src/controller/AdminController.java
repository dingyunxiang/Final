package controller;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
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

    @Autowired
    private ShengshiService shengshiService;

    @Autowired
    private CyryService cyryService;





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
            request.getSession().setAttribute("user",user);
            modelMap.put("result","success");
            return modelMap;
        }
        else {
            modelMap.put("result", "fail");
            return modelMap;
        }
    }

    //社区模块

    //添加社区
    @ResponseBody
    @RequestMapping("addShequ.form")
    public Map<String, Object> addShequ(HttpServletRequest request, ShequEntity shequ){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shequService.addShequ(shequ);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    //删除社区
    @ResponseBody
    @RequestMapping("delShequ.form")
    public Map<String, Object> delUser(HttpServletRequest request, ShequEntity shequ){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shequService.delShequ(shequ);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    //修改社区
    @ResponseBody
    @RequestMapping("updateShequ.form")
    public Map<String, Object> updateShequ(HttpServletRequest request, ShequEntity shequ){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shequService.updateShequ(shequ);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    //得到所有社区
    @ResponseBody
    @RequestMapping("getAllShequ.form")
    public Map<String, Object> getAllShequ(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            List<ShequEntity> list = shequService.getAll();
            map.put("result",list);
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }

    //用户模块

    //添加用户
    @ResponseBody
    @RequestMapping("addUser.form")
    public Map<String, Object> addUser(HttpServletRequest request, UserEntity user){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            userService.addUser(user);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    //删除用户
    @ResponseBody
    @RequestMapping("delUser.form")
    public Map<String, Object> delUser(HttpServletRequest request, UserEntity user){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            userService.delUser(user);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    //修改用户
    @ResponseBody
    @RequestMapping("updateUser.form")
    public Map<String, Object> updateUser(HttpServletRequest request, UserEntity user){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            userService.updateUser(user);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    //得到所有用户
    @ResponseBody
    @RequestMapping("getAllUser.form")
    public Map<String, Object> getAllUser(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            List<UserEntity> list = userService.getAllUser();
            map.put("result",list);
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }

    //街道模块

    @ResponseBody
    @RequestMapping("addJiedao.form")
    public Map<String, Object> addJiedao(HttpServletRequest request, JiedaoEntity jiedao){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            jiedaoService.addJiedao(jiedao);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("delJiedao.form")
    public Map<String, Object> delJiedao(HttpServletRequest request, JiedaoEntity jiedao){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            jiedaoService.delJiedao(jiedao);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("updateJiedao.form")
    public Map<String, Object> updateJiedao(HttpServletRequest request, JiedaoEntity jiedao){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            jiedaoService.updateJiedao(jiedao);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("getAllJiedao.form")
    public Map<String, Object> getAllJiedao(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            List<JiedaoEntity> list = jiedaoService.getAllJiedao();
            map.put("result",list);
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }


    //省市模块

    @ResponseBody
    @RequestMapping("addShengshi.form")
    public Map<String, Object> addShengshi(HttpServletRequest request, ShengshiEntity shengshi){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shengshiService.addShengshi(shengshi);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("delShengshi.form")
    public Map<String, Object> delShengshi(HttpServletRequest request, ShengshiEntity shengshi){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shengshiService.delShengshi(shengshi);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("updateShengshi.form")
    public Map<String, Object> updateShengshi(HttpServletRequest request,ShengshiEntity shengshi){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shengshiService.updateShengshi(shengshi);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("getAllShengshi.form")
    public Map<String, Object> getAllShengshi(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            List<ShengshiEntity> list = shengshiService.getAllShengshi();
            map.put("result",list);
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }


    //Cyry模块

    @ResponseBody
    @RequestMapping("addCyry.form")
    public Map<String, Object> addCyry(HttpServletRequest request, CyryEntity cyry){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
           cyryService.addCyry(cyry);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("delCyry.form")
    public Map<String, Object> delCyry(HttpServletRequest request, CyryEntity cyry){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            cyryService.delCyry(cyry);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("updateCyry.form")
    public Map<String, Object> updateCyry(HttpServletRequest request,CyryEntity cyry){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            cyryService.updateCyry(cyry);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("getAllCyry.form")
    public Map<String, Object> getAllCyry(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            List<CyryEntity> list = cyryService.getAllCyry();
            map.put("result",list);
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }



}
