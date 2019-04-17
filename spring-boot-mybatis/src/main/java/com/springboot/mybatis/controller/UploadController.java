package com.springboot.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/*
* 上传文件控制器
* 直接上传到服务器
* */
@RestController
public class UploadController {
    //指定一个临时目录作为上传目录
//    private static String UPLOAD_FOLDER = "E:/temp/";
//    遇到http://loaclhost:8080,则跳转到upload.html页面
    @PostMapping("/upload")
    public String fileUpload(@RequestParam("file")MultipartFile srcFile){
        //前端没有选择文件。srcFile为空
        String returnFileName= "" ;
        try {
            File destFile = new File(ResourceUtils.getURL("classPath").getPath());
            if(!destFile.exists()){
                destFile = new File("");
            }
            //拼接static目录
            File upload = new File(destFile.getAbsolutePath(),"static/");
//            若木比奥文件夹不存在，则自动创建
            if(!upload.exists()){
                upload.mkdirs();
            }
            System.out.println("file path:"+upload.getAbsolutePath());
            //更具srcFlie的大小准备字节数组,装备一个字节数组
            Path path = Paths.get(upload.getAbsolutePath()+"/"+srcFile.getOriginalFilename());
            byte[] bytes = srcFile.getBytes();
            Files.write(path,bytes);
            returnFileName = "http://localhost:8080/upload/"+ srcFile.getOriginalFilename();
        }catch (IOException e){
            e.printStackTrace();
        }
        return returnFileName;
    }
    //匹配upload_status页面
    @GetMapping("/upload_status")
    public String uploadStatusPage(){
        return "upload_status";
    }
}
