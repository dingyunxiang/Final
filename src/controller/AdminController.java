package controller;

import entity.*;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import service.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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

    @RequestMapping(value="index.form")
    public String index(HttpServletRequest request ){
        return "index";
    }



    @RequestMapping(value="logout.form")
    public String jiedao(HttpServletRequest request, JiedaoEntity jiedao){
        request.getSession().setAttribute("user",null);
        return "login";
    }


    //登录模块
    @ResponseBody
    @RequestMapping("login.form")
    public Map<String, Object> login(HttpServletRequest request,  UserEntity user){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if(userService.login(user)) {
            request.getSession().setAttribute("user",user.getUsername());
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
    public Map<String, Object> delUser(HttpServletRequest request,@RequestParam(value = "id", required = false)  String id){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shequService.delShequ(id);
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

    @RequestMapping("getShequ.form")
    public String getShequ(@RequestParam(value = "id", required = false) String id, HttpServletRequest request){
        ShequEntity shequ = shequService.getShequById(id);
        request.setAttribute("shequ",shequ);
        return "updateShequ";
    }

    //得到所有社区
    @RequestMapping("getAllShequ.form")
    public String getAllShequ(HttpServletRequest request){
        List<ShequEntity> list = null;
        try{
            list = shequService.getAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("list", list);
        return "allshequ";
    }
    @RequestMapping("uploadShequ.form")
    public String uploadShequ(@RequestParam(value = "shequfile", required = false) MultipartFile file, HttpServletRequest request, ModelMap model){

        String path = request.getRealPath("file");
        File a = new File(path,"test1.xls");
        try {
            file.transferTo(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        shequService.excelToList(a);
        return "index";
    }


    @RequestMapping("downloadShequ.form")
    public ResponseEntity<byte[]> downloadShequ() throws IOException {
        //String path="D:\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springMVC\\WEB-INF\\upload\\图片10（定价后）.xlsx";
        File file= shequService.listToExcel();
        HttpHeaders headers = new HttpHeaders();
        String fileName= null;//为了解决中文名称乱码问题
        try {
            fileName = new String("社区.xls".getBytes("UTF-8"),"iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);

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

    @RequestMapping("getUser.form")
    public String getUser(HttpServletRequest request,@RequestParam(value = "id", required = false) String id){
        UserEntity user = userService.getUserById(id);
        request.setAttribute("user",user);
        return "updateUser";
    }

    @RequestMapping("getAllUser.form")
    public String getAllUser(HttpServletRequest request){
        List<UserEntity> list = null;
        try{
             list = userService.getAllUser();
        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("list",list);
        return "allUser";
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

    @RequestMapping("getShengshi.form")
    public String getShengshi(HttpServletRequest request,@RequestParam(value = "id", required = false)  String id){

        ShengshiEntity shengshi = shengshiService.getById(id);
        request.setAttribute("shengshi",shengshi);

        return "updateXianqu";

    }

    @ResponseBody
    @RequestMapping("delShengshi.form")
    public Map<String, Object> delShengshi(HttpServletRequest request,@RequestParam(value = "id", required = false)  String id){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            shengshiService.delShengshi(id);
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


    @RequestMapping("getAllShengshi.form")
    public String getAllShengshi(HttpServletRequest request){
        List<ShengshiEntity> list = null;
        try{
             list = shengshiService.getAllShengshi();
        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("list",list);
        System.out.println("AllShengshi:"+list);
        return "allxianqu";
    }


    @RequestMapping("uploadShengshi.form")
    public String uploadShengshi(@RequestParam(value = "shengshifile", required = false) MultipartFile file, HttpServletRequest request, ModelMap model){
       // System.out.println("开始");
       // System.out.println("file"+file);
        String path = request.getRealPath("file");
        //System.out.println(path);
        File a = new File(path,"test.xls");
        try {
            file.transferTo(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        shengshiService.excelToList(a);
        return "index";
    }

    @RequestMapping("downloadShengshi.form")
    public ResponseEntity<byte[]> downloadShengshi() throws IOException {
        //String path="D:\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springMVC\\WEB-INF\\upload\\图片10（定价后）.xlsx";
        File file= shengshiService.listToExcel();
        HttpHeaders headers = new HttpHeaders();
        String fileName= null;//为了解决中文名称乱码问题
        try {
            fileName = new String("省市.xls".getBytes("UTF-8"),"iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);

    }


    //Cyry模块

    @ResponseBody
    @RequestMapping("addCyry.form")
    public Map<String, Object> addCyry(HttpServletRequest request, CyryEntity cyry){
        System.out.println(cyry);
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
    public Map<String, Object> delCyry(HttpServletRequest request, @RequestParam(value = "id", required = false)String id){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            cyryService.delCyry(id);
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
    @RequestMapping("getAllCyry.form")
    public String getAllCyry(HttpServletRequest request){
        try{
            List<CyryEntity> list = cyryService.getAllCyry();
            request.setAttribute("list",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "allshuju";
    }

    @RequestMapping("delShujuByShequ.form")
    @ResponseBody
    public Map<String, Object> delCyryByShequ(HttpServletRequest request, @RequestParam(value = "id", required = false)String shequ){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            cyryService.delShejuByShequ(shequ);
            map.put("result","success");
        }catch (Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }
        return map;
    }

    @RequestMapping("getShuju.form")
    public String getShuju(HttpServletRequest request,@RequestParam(value = "id", required = false)  String id){
        System.out.println("id"+id);
       CyryEntity cyry = cyryService.getCyryById(id);
        System.out.println("cyry"+cyry.getId());
        request.setAttribute("cyry",cyry);
        List<ShengshiEntity> shengshi = shengshiService.getAllShengshi();
        List<ShequEntity> shequ = shequService.getAll();
        request.setAttribute("shengshi",shengshi);
        request.setAttribute("shequ",shequ);
        return "updateShuju1";

    }

    @RequestMapping("downloadAllShuju.form")
    public ResponseEntity<byte[]> downloadAllShuju() throws IOException {
        //String path="D:\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springMVC\\WEB-INF\\upload\\图片10（定价后）.xlsx";
        File file= cyryService.listToExcel();
        HttpHeaders headers = new HttpHeaders();
        String fileName= null;//为了解决中文名称乱码问题
        try {
            fileName = new String("数据.xls".getBytes("UTF-8"),"iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);

    }

    @RequestMapping("downloadShujuByDiy.form")
    public ResponseEntity<byte[]> downloadShujuByDiy(@RequestParam(value = "array1", required = false)String []array) throws IOException {
        System.out.println("succ"+array[0]);
        //String path="D:\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springMVC\\WEB-INF\\upload\\图片10（定价后）.xlsx";
        File file= cyryService.listToExcelByDiy(array);
        HttpHeaders headers = new HttpHeaders();
        String fileName= null;//为了解决中文名称乱码问题
        try {
            fileName = new String("自定义数据.xls".getBytes("UTF-8"),"iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);

    }

    @RequestMapping("addShuju.form")
    public String addShuju(HttpServletRequest request){
        List<ShengshiEntity> shengshi = shengshiService.getAllShengshi();
        List<ShequEntity> shequ = shequService.getAll();
        request.setAttribute("shengshi",shengshi);
        request.setAttribute("shequ",shequ);
       return "addshuju";
    }




}
